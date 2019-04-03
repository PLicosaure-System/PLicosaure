package plicosaure.pdf.structures;

import plicosaure.pdf.settings.CellSettings;

/**
 * The column class
 */
public class Column {

    //region //////////////////////////////////////////// WIDTH ////////////////////////////////////////////////////////

    /**
     * The column width
     */
    private int width;

    /**
     * Get the column width
     *
     * @return the column width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Set the column width
     *
     * @param width the new column width
     *
     * @return this
     */
    public Column setWidth(int width) {
        this.width = width;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// SETTINGS /////////////////////////////////////////////////////

    /**
     * The cell settings
     */
    protected CellSettings cellSettings;

    /**
     * Set the cell settings
     *
     * @param cellSettings The new cell settings
     *
     * @return this;
     */
    protected Column setCellSettings(CellSettings cellSettings){
        this.cellSettings = cellSettings;
        return this;
    }

    /**
     * Get the cell settings
     *
     * @return the cell settings
     */
    public CellSettings getCellSettings() {
        return cellSettings;
    }

    //endregion
}
