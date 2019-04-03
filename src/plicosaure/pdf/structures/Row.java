package plicosaure.pdf.structures;

import plicosaure.pdf.settings.CellSettings;
import plicosaure.pdf.structures.cell.Cell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing a row in a table
 */
public class Row implements Iterable{

    /**
     * Construct an empty row
     */
    public Row(Table tab){
        super();
        cells = new ArrayList<>();
        this.table = tab;
    }

    //region //////////////////////////////////////////// Table ////////////////////////////////////////////////////////

    /**
     * The row cells
     */
    private ArrayList<Cell> cells;

    /**
     * Check if the row is empty
     *
     * @return if the row is empty
     */
    public boolean isEmpty(){
        return this.cells.isEmpty();
    }

    /**
     * Add a cell to the row
     *
     * @param cell The new cell
     *
     * @return this
     */
    public Row addCell(Cell cell){
        this.cells.add(cell);
        cell.setColumn(this.getTable().getColumn(this.cells.size()-1));
        cell.setRow(this);
        return this;
    }

    /**
     * Get an iterator over the row cells
     *
     * @return An iterator over the cells
     */
    @Override
    public Iterator iterator() {
        return cells.iterator();
    }


    //endregion
    //region //////////////////////////////////////////// Table ////////////////////////////////////////////////////////

    /**
     * The table containing the row
     */
    private Table table;

    /**
     * Get the table
     *
     * @return The table
     */
    public Table getTable(){
        return table;
    }

    //endregion
    //region //////////////////////////////////////////// MIN HEIGHT ///////////////////////////////////////////////////

    /**
     * The minimal height of the row
     */
    private float minHeight = 0;

    /**
     * Set the min height of the row
     *
     * @param minHeight the new min height of the row
     *
     * @return this
     */
    public Row setMinHeight(float minHeight){
        this.minHeight = minHeight;
        return this;
    }

    /**
     * Get the row minimal height
     *
     * @return the height
     */
    public float getMinHeight() {
        return minHeight;
    }

    /**
     * Get The row height
     *
     * @return the height
     *
     * @throws IOException
     */
    public float getHeight() throws IOException {
        float maxCellHeight = 0;
        for (Cell c : cells){
            maxCellHeight = Math.max(maxCellHeight, c.getHeight());
        }
        return Math.max(minHeight, maxCellHeight);
    }

    //endregion
    //region //////////////////////////////////////////// SETTINGS /////////////////////////////////////////////////////

    /**
     * The cells settings
     */
    protected CellSettings cellsSettings;

    /**
     * Set the cell settings
     *
     * @param cellsSettings the new cell settings
     *
     * @return this
     */
    protected Row setCellsSettings(CellSettings cellsSettings){
        this.cellsSettings = cellsSettings;
        return this;
    }

    /**
     * Get the cells settings
     *
     * @return the cells settings
     */
    public CellSettings getCellsSettings() {
        return cellsSettings;
    }

    //endregion
}
