package plicosaure.pdf.structures.cell;

import plicosaure.pdf.Drawable;
import plicosaure.pdf.settings.CellSettings;
import plicosaure.pdf.structures.Column;
import plicosaure.pdf.structures.Row;

import java.io.IOException;

/**
 * Cell class
 */
public abstract class Cell implements Drawable {

    //region //////////////////////////////////////////// COLUMN ///////////////////////////////////////////////////////

    /**
     * The cell column
     */
    private Column column;

    /**
     * Get the cell column
     *
     * @return The cell column
     */
    public Column getColumn() {
        return column;
    }

    /**
     * Set the cell colum
     *
     * @param column The new cell column
     *
     * @return this
     */
    public Cell setColumn(Column column) {
        this.column = column;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// ROW //////////////////////////////////////////////////////////

    /**
     * The cell row
     */
    private Row row;

    /**
     * Get the cell row
     *
     * @return the cell row
     */
    public Row getRow() {
        return row;
    }

    /**
     * Set the row
     *
     * @param row the new row of the cell
     *
     * @return this
     */
    public Cell setRow(Row row){
        this.row = row;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// SETTINGS /////////////////////////////////////////////////////

    /**
     * The settings of the cell
     */
    protected CellSettings settings;

    /**
     * Set the cell settings
     *
     * @param settings the new cell settings
     *
     * @return this
     */
    protected Cell settings(CellSettings settings){
        this.settings = settings;
        return this;
    }

    /**
     * Get the cell settings
     *
     * @return The cell settings
     */
    public CellSettings settings() {
        if(settings == null)
            settings = new CellSettings();
        return settings;
    }

    //endregion

    /**
     * Get the height of the cell
     *
     * @return the height
     *
     * @throws IOException on error
     */
    public abstract float getHeight() throws IOException;

    /**
     * Get the width of the cell
     *
     * @return the width
     *
     * @throws IOException on error
     */
    public abstract float getWidth() throws IOException;

}
