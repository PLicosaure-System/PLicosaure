package plicosaure.pdf.settings;

/**
 * Class representing the padding of a cell
 */
public class Padding {

    public float
    right,
    left,
    top,
    bottom;

    /**
     * Calculate the horizontal padding
     *
     * @return The Horizontal Padding
     */
    public float getHorizontalPadding() {
        return left + right;
    }

    /**
     * Calculate the vertical padding
     *
     * @return The Vertical Padding
     */
    public float getVerticalPadding() {
        return top + bottom;
    }

}
