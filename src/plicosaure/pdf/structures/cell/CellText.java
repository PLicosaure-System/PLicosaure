package plicosaure.pdf.structures.cell;

import org.apache.pdfbox.pdmodel.font.PDFont;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import plicosaure.pdf.Document;
import plicosaure.pdf.Util;

/**
 * Class representing a cell with text
 */
public class CellText extends Cell {

    private String text;

    private Color textColor;

    private float lineSpacing = 1f;

    public CellText(String text){
        this.text = text;
    }

    //region Custom Getter

    public PDFont getFont(){
        return settings().getFont();
    }

    public Integer getFontSize(){
        return settings().getFontSize();
    }

    public Color getTextColor(){
        if(textColor == null)
            textColor = Color.BLACK;
        return textColor;
    }

    //endregion

    @Override
    public float getHeight(){
        final float textHeight;
        final float fontHeight = Util.getFontHeight(getFont(), getFontSize());

        final int size = Util.getOptimalTextBreakLines(text, getFont(), getFontSize(),
                getWidth() - this.settings().padding().getHorizontalPadding()).size();

        final float heightOfTextLines = size * fontHeight;
        final float heightOfLineSpacing = (size - 1) * fontHeight * getLineSpacing();

        textHeight = heightOfTextLines + heightOfLineSpacing;

        return textHeight + this.settings().padding().getHorizontalPadding();
    }

    @Override
    public float getWidth(){
        final float notBrokenTextWidth = Util.getStringWidth(text, getFont(), getFontSize());

        final float textWidth;

        float columnsWidth = this.getColumn().getWidth();
        float maxWidth = 0;
        if(columnsWidth != 0) {
            maxWidth = columnsWidth - this.settings().padding().getHorizontalPadding();
        }

        List<String> textLines = Util.getOptimalTextBreakLines(text, getFont(), getFontSize(), maxWidth);
        float maximalTextWidth = 0;
        for(String s : textLines){
            maximalTextWidth = Math.max(Util.getStringWidth(s, getFont(), getFontSize()), maximalTextWidth);
        }
        textWidth = maximalTextWidth;


        return textWidth + this.settings().padding().getHorizontalPadding();
    }

    @Override
    public void draw(Document doc, float x, float y, float maxX, float maxY) throws IOException {
        // TODO taking into account the size of the cell
        doc.drawText(this.text, this.getFont(), this.getFontSize(), this.getTextColor(), x, y);
    }

    public float getLineSpacing(){
        return lineSpacing;
    }
}
