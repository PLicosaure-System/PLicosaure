package plicosaure.pdf.structures;

import plicosaure.pdf.settings.CellSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Class representing a Table
 */
public class Table implements Iterable{

    /**
     * Construct an empty table
     */
    public Table(){
        rows = new ArrayList<>();
        columns = new HashMap<>();
        redrawHeaderAfterPageJump = true;
    }

    //region //////////////////////////////////////////// Footer ///////////////////////////////////////////////////////

    /**
     * The footer row of the table
     */
    private Row footer;

    /**
     * Set the footer row of the table
     *
     * @param footer the new footer row of the table
     *
     * @return this
     */
    public Table setFooter(Row footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Get the footer row of the table
     *
     * @return the row
     */
    public Row getFooter(){
        return footer;
    }

    //endregion
    //region //////////////////////////////////////////// Header ///////////////////////////////////////////////////////

    /**
     * Get the header row of the table
     */
    private Row header;

    /**
     * Set the header row of the table
     *
     * @param header the new header row
     *
     * @return this
     */
    public Table setHeader(Row header){
        this.header = header;
        return this;
    }

    /**
     * Get the header row of the table
     *
     * @return the header
     */
    public Row getHeader(){
        return header;
    }

    //endregion
    //region //////////////////////////////////////////// Rows /////////////////////////////////////////////////////////

    /**
     * The rows list
     */
    private ArrayList<Row> rows;

    /**
     * Get the table row
     *
     * @param  nb the index of the row
     *
     * @return the row
     */
    public Row getRow(int nb){
        return this.rows.get(nb);
    }

    /**
     * Add a row to the table
     *
     * @return this
     */
    public Row addRow(){
        Row r = new Row(this);
        this.rows.add(r);
        return r;
    }

    /**
     * Remove a row of the table by its position
     *
     * @param nb the position of the row
     *
     * @return The removed row
     */
    public Row removeRow(int nb){
        return this.rows.remove(nb);
    }

    /**
     * Remove a row of the table
     *
     * @param row the row to remove
     *
     * @return if the row was present in the rows
     */
    public boolean removeRow(Row row){
        return this.rows.remove(row);
    }

    //endregion
    //region //////////////////////////////////////////// Columns //////////////////////////////////////////////////////

    /**
     * The columns list
     */
    private HashMap<Integer, Column> columns;

    /**
     * Get a column of the table
     *
     * @param nb The column number
     *
     * @return the column get
     */
    public Column getColumn(int nb){
        if(!columns.containsKey(nb)){
            Column c = new Column();
            columns.put(nb, c);
            return c;
        }
        return columns.get(nb);
    }

    /**
     * Set a column in the table
     *
     * @param index The index in the table
     * @param col The column
     *
     * @return this
     */
    public Table setColumn(int index, Column col){
        this.columns.put(index, col);
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// SETTINGS /////////////////////////////////////////////////////

    /**
     * The cells settings
     */
    protected CellSettings cellsSettings;

    /**
     * Set the cells settings
     *
     * @param cellsSettings the new cells settings
     *
     * @return this
     */
    protected Table setCellsSettings(CellSettings cellsSettings){
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
    //region //////////////////////////////////////////// Redraw the table header //////////////////////////////////////

    /**
     * If the header is redraw after a page jump
     */
    private boolean redrawHeaderAfterPageJump;

    /**
     * Check if the header is redraw after a page jump
     *
     * @return if it's true
     */
    public boolean redrawHeaderAfterPageJump() {
        return this.redrawHeaderAfterPageJump;
    }

    /**
     * Set if the header of the table is redraw after a page jump
     *
     * @param redraw if we redraw the header
     */
    public void redrawHeaderAfterPageJump(boolean redraw) {
        this.redrawHeaderAfterPageJump = redraw;
    }


    //endregion

    /**
     * Get an iterator over the rows of the table
     *
     * @return an iterator over the table rows
     */
    @Override
    public Iterator iterator() {
        return rows.iterator();
    }

}
