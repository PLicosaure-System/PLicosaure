package plicosaure.pdf.settings;

import java.awt.*;

/**
 * Class representing a border
 */
public class Border {

    //region //////////////////////////////////////////// Color ////////////////////////////////////////////////////////
    /**
     * The border color
     */
    private Color color;

    /**
     * Get the border color
     *
     * @return the border color
     */
    public Color getColor() {
        if(color == null)
            color = Color.black;
        return color;
    }

    /**
     * Set the border color
     *
     * @param color the new color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    //endregion
    //region //////////////////////////////////////////// Width ////////////////////////////////////////////////////////
    /**
     * The border width
     */
    private int width;

    /**
     * Get the border width
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the border width
     *
     * @param width the new width
     *
     * @return this
     */
    public Border setWidth(int width){
        this.width = width;
        return this;
    }

    //endregion
}
