package plicosaure.pdf;

import org.apache.pdfbox.pdmodel.font.PDFont;

import java.io.IOException;
import java.util.*;

/**
 * Provides some helping functions.
 */
public class Util {

    private static final String NEW_LINE_REGEX = "\\r?\\n";

    private Util() {

    }

    /**
     * Computes the width of a String (in points).
     *
     * @param text     Text
     * @param font     Font of Text
     * @param fontSize FontSize of String
     * @return Width (in points)
     */
    public static float getStringWidth(final String text, final PDFont font, final int fontSize) {
        return Arrays.stream(text.split(NEW_LINE_REGEX))
                .max(Comparator.comparing(String::length))
                .map(x -> getWidthOfStringWithoutNewlines(x, font, fontSize))
                .orElseThrow(CouldNotDetermineStringWidthException::new);
    }

    private static float getWidthOfStringWithoutNewlines(String str, PDFont font, int fontSize) {
        try {
            return font.getStringWidth(str) * fontSize / 1000F;
        } catch (IOException exception) {
            throw new CouldNotDetermineStringWidthException(exception);
        }
    }


    /**
     * Computes the height of a font.
     *
     * @param font     Font
     * @param fontSize FontSize
     * @return Height of font
     */
    public static float getFontHeight(final PDFont font, final int fontSize) {
        return font.getFontDescriptor().getCapHeight() / 1000f * fontSize;
    }

    /**
     * Split a text into multiple lines to prevent a text-overflow.
     *
     * @param text     Text
     * @param font     Used font
     * @param fontSize Used fontSize
     * @param maxWidth Maximal width of resulting text-lines
     * @return A list of lines, where all are smaller than maxWidth
     */
    public static List<String> getOptimalTextBreakLines(final String text, final PDFont font, final int fontSize, final float maxWidth) {
        final List<String> result = new LinkedList<>();

        for (final String line : text.split(NEW_LINE_REGEX)) {
            if (Util.isLineFine(line, font, fontSize, maxWidth)) {
                result.add(line);
            } else {
                result.addAll(Util.wrapLine(line, font, fontSize, maxWidth));
            }
        }

        return result;
    }

    private static List<String> wrapLine(final String line, final PDFont font, final int fontSize, final float maxWidth) {
        if (Util.isLineFine(line, font, fontSize, maxWidth)) {
            return Collections.singletonList(line);
        }

        final List<String> resultLines = Util.splitByWords(line, font, fontSize, maxWidth);

        if (resultLines.isEmpty()) {
            resultLines.addAll(Util.splitBySize(line, font, fontSize, maxWidth));
        }

        return resultLines;
    }

    private static List<String> splitBySize(final String line, final PDFont font, final int fontSize, final float maxWidth) {
        final List<String> returnList = new ArrayList<>();

        for (int i = line.length() - 1; i > 0; i--) {
            final String fittedNewLine = line.substring(0, i) + "-";
            final String remains = line.substring(i);

            if (Util.isLineFine(fittedNewLine, font, fontSize, maxWidth)) {
                returnList.add(fittedNewLine);
                returnList.addAll(Util.wrapLine(remains, font, fontSize, maxWidth));

                break;
            }
        }

        return returnList;
    }

    private static List<String> splitByWords(final String line, final PDFont font, final int fontSize, final float maxWidth) {
        final List<String> returnList = new ArrayList<>();
        final List<String> splitBySpace = Arrays.asList(line.split(" "));

        for (int i = splitBySpace.size() - 1; i >= 0; i--) {
            final String fittedNewLine = join(splitBySpace.subList(0, i+1), " ");
            final String remains = join(splitBySpace.subList(i, splitBySpace.size()), " ");

            if (!fittedNewLine.isEmpty() && Util.isLineFine(fittedNewLine, font, fontSize, maxWidth)) {
                returnList.add(fittedNewLine);

                if (!remains.equals(line)) {
                    returnList.addAll(Util.wrapLine(remains, font, fontSize, maxWidth));
                }
                break;
            }
        }

        return returnList;
    }

    private static String join(List<String> strings, String separator){
        StringBuilder s = new StringBuilder();
        for(String str : strings){
            s.append(separator).append(str);
        }
        return s.toString();
    }

    private static boolean isLineFine(final String line, final PDFont font, final int fontSize, final float maxWidth) {
        if(maxWidth == 0)
            return true;
        return maxWidth >= Util.getStringWidth(line, font, fontSize);
    }


    private static class CouldNotDetermineStringWidthException extends RuntimeException {
        CouldNotDetermineStringWidthException() {
            super();
        }

        CouldNotDetermineStringWidthException(Exception exception) {
            super(exception);
        }
    }

}
