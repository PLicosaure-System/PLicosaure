package plicosaure.pdf;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import plicosaure.pdf.settings.Border;
import plicosaure.pdf.settings.Format;
import plicosaure.pdf.settings.Margins;
import plicosaure.pdf.structures.Row;
import plicosaure.pdf.structures.Table;
import plicosaure.pdf.structures.cell.Cell;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Document {

    private PDDocument document;
    private PDPage curPage;
    private PDPageContentStream pageContent;

    private PDRectangle format;

    private Margins margins;

    private boolean tableIsBroken;

    private float yStart, yStartNewPage;

    private float currX, currY;

    private boolean removeTopBorders;

    /**
     * Create a new Document
     *
     * @param format The format to use for the document
     */
    public Document(PDRectangle format) throws IOException {
        document = new PDDocument();
        this.format = format;
        generatePage();
        document.getPage(0);
    }

    /**
     * Create a new Document
     *
     * @param format the format to use for the document
     */
    public Document(Format format) throws IOException {
        this(new PDRectangle((float)format.getWidth(), (float)format.getHeight()));
    }

    //region //////////////////////////////////////////// Margins //////////////////////////////////////////////////////

    /**
     *
     * Get the margins of the document
     *
     * @return the margins
     */
    public Margins margins(){
        if(margins == null)
            margins = new Margins();
        return margins;
    }

    /**
     * Set the margins of the document
     *
     * @param margins The new margins of the document
     *
     * @return this
     */
    public Document margins(Margins margins){
        this.margins = margins;
        return this;
    }

    //endregion

    /**
     * Get the minimum X position of the document
     *
     * @return the minimum x position
     */
    public float getMinX(){
        return curPage.getBleedBox().getLowerLeftX() - margins().left;
    }

    /**
     * Get the maximum X position of the document
     *
     * @return the maximum x position
     */
    public float getMaxX() {
        return curPage.getBleedBox().getUpperRightX() - margins().right;
    }

    /**
     * Get the upper Y position of the document
     *
     * @return The upper Y position
     */
    public float getUpperY(){
        return curPage.getBleedBox().getUpperRightY() - yStartNewPage - margins().top;
    }

    /**
     * Get the lower Y position of the document
     *
     * @return the lower Y position
     */
    public float getLowerY(){
        return curPage.getBleedBox().getUpperRightY() + margins().bottom;
    }

    //region //////////////////////////////////////////// DRAW TABLE ///////////////////////////////////////////////////

    /**
     * Draw a table
     *
     * @param table The table to draw
     *
     * @throws IOException on error
     */
    public void drawTable(Table table) throws IOException{
        drawTable(table, getMinX(), getUpperY(), getMaxX());
    }

    /**
     * Draw a table
     *
     * @param table The table to draw
     * @param startX The x position where to draw
     *
     * @throws IOException on error
     */
    public void drawTable(Table table, float startX) throws IOException{
        drawTable(table, startX, getUpperY(), getMaxX());
    }

    /**
     * Draw a table
     *
     * @param table The table to draw
     * @param startX The start x position
     * @param startY The start y position
     *
     * @throws IOException on error
     */
    public void drawTable(Table table, float startX, float startY) throws IOException{
        drawTable(table, startX, startY, getMaxX());
    }

    /**
     * Draw a Table
     *
     * @param table The table to draw
     * @param startX The x position where to draw the line
     * @param startY The y position where to draw the line
     * @param endX The end x position where to draw the line
     *
     * @throws IOException on error
     */
    public void drawTable(Table table, float startX, float startY, float endX)  throws IOException{
        currY = startY;
        for (Object o : table.getHeader()) {
            Row headerRow = (Row) o;
            // We Draw the line keeping the X limits and at the top of the page
            drawTableLine(table, headerRow, startX, getUpperY(), endX);
        }
        for(Object o : table){
            currX = startX;
            Row row = (Row) o;
            drawTableLine(table, row, currX, currY, endX);
        }
    }

    /**
     * Draw a table line
     *
     * @param table The table we draw
     * @param row The line to draw
     * @param startX The x position where to draw the line
     * @param startY The y position where to draw the line
     * @param endX The end x position where to draw the line
     *
     * @throws IOException on error
     */
    public void drawTableLine(Table table, Row row, float startX, float startY, float endX)  throws IOException{
       // startY = this.curPage.getBleedBox().getHeight() - startY;
        // We remove the top border if possible so that we don't make double borders
        removeTopBorders = true;
        if (isEndOfPage(row)) {
            pageBreak();
            // redraw all headers on each currentPage
            if (table.redrawHeaderAfterPageJump() && !table.getHeader().isEmpty()) {
                removeTopBorders = false;
                for (Object o : table.getHeader()) {
                    Row headerRow = (Row) o;
                    // We Draw the line keeping the X limits and at the top of the page
                    drawTableLine(table, headerRow, currX, getUpperY(), endX);
                }
                // after you draw all header rows on next page please keep
                // removing top borders to avoid double border drawing
                removeTopBorders = true;
            } else {
                // after a page break, we have to ensure that top borders get
                // drawn
                removeTopBorders = false;
            }
        }
        float curY = currY;
        for(Object ob : row){
            Cell cell = (Cell) ob;
            float curX = currX;
            drawCellBackground(cell, curX, curY);
            drawCellContent(cell, curX, curY);
            drawBorders(row, cell, curX, curY);
        }
        currY = curY - row.getHeight();
    }

    /**
     * Draw the cell borders
     *
     * @param row The cell row
     * @param cell The cell
     * @param startX The x position where to draw
     * @param startY The y position where to draw
     *
     * @throws IOException on error
     */
    private void drawBorders(Row row, Cell cell, float startX, float startY) throws IOException {
        float yEnd = startY - row.getHeight();
        // TODO taking into account the borders width
        // top
        Border topBorder = cell.settings().borderTop();
        if (topBorder != null) {
            float y = startY /*- (float) topBorder.getWidth() / 2*/;
            drawLine(
                    topBorder.getColor(),
                    topBorder.getWidth(),
                    startX,
                    y,
                    startX + cell.getWidth(),
                    y);
        }

        // right
        Border rightBorder = cell.settings().borderRight();
        if (rightBorder != null) {
            float x = startX + cell.getWidth()/* - (float)rightBorder.getWidth() / 2*/;
            drawLine(
                    rightBorder.getColor(),
                    rightBorder.getWidth(),
                    x,
                    startY,
                    x,
                    yEnd);
        }

        // bottom
        Border bottomBorder = cell.settings().borderBottom();
        if (bottomBorder != null) {
            float y = yEnd /*+ (float)bottomBorder.getWidth() / 2*/;
            drawLine(
                    bottomBorder.getColor(),
                    bottomBorder.getWidth(),
                    startX,
                    y,
                    startX + cell.getWidth(),
                    y);
        }

        // left
        Border leftBorder = cell.settings().borderLeft();
        if (leftBorder != null) {
            float x = startX/* + (float)leftBorder.getWidth() / 2*/;
            drawLine(
                    leftBorder.getColor(),
                    leftBorder.getWidth(),
                    x,
                    startY,
                    x,
                    yEnd);
        }
    }

    /**
     * Draw a cell content
     *
     * @param cell The cell to draw
     * @param x The x position where to draw
     * @param y The y position where to draw
     * @throws IOException
     */
    private void drawCellContent(Cell cell, float x, float y) throws IOException {
        // TODO Handling text alignments
        float yEnd = y - cell.getRow().getHeight() + cell.settings().padding().bottom;
        cell.draw(this, x+ cell.settings().padding().left, yEnd, 0, 0);
        this.currX = x + cell.getWidth();
    }

    /**
     * Draw a cell background
     *
     * @param cell The cell to draw
     * @param startX The x position where to draw
     * @param startY The y position where to draw
     *drawCellBackground
     * @throws IOException on error
     */
    private void drawCellBackground(Cell cell, float startX, float startY) throws IOException {
        this.drawFilledRect(cell.settings().getBackgroundColor(), startX, startY- cell.getRow().getHeight(), cell.getWidth(), cell.getHeight());
    }

    //endregion
    //region //////////////////////////////////////////// Drawing //////////////////////////////////////////////////////

    /**
     * Draw a text
     *
     * @param text The text to draw
     * @param font The font to use
     * @param fontSize The font size to use
     * @param color The color to use
     * @param x The x coordinate where to draw
     * @param y The y coordinate where to draw
     *
     * @throws IOException on error
     */
    public void drawText(String text, PDFont font, int fontSize, Color color, float x, float y) throws IOException {
        Document.drawText(text, this.getPageContent(), font, fontSize, color, x, y);
    }


    /**
     * Draw a text
     *
     * @param text The text to draw
     * @param contentStream The content stream to use for the drawing
     * @param font The font to use
     * @param fontSize The font size to use
     * @param color The color to use
     * @param x The x coordinate where to draw
     * @param y The y coordinate where to draw
     *
     * @throws IOException on error
     */
    private static void drawText(String text, PDPageContentStream contentStream, PDFont font, int fontSize, Color color, float x, float y) throws IOException {
       // y = this.curPage.getBleedBox().getHeight() - y;
        contentStream.beginText();
        contentStream.setNonStrokingColor(color);
        contentStream.setFont(font, fontSize);
        contentStream.newLineAtOffset(x, y);
        contentStream.showText(text);
        contentStream.endText();
        contentStream.setCharacterSpacing(0);
    }

    //endregion
    //region //////////////////////////////////////////// Pages ////////////////////////////////////////////////////////

    /**
     * draw the page header
     */
    protected void header() throws IOException {}

    /**
     * draw the page footer
     */
    protected void footer(){}


    /**
     * Get the page content
     *
     * @return the page content
     *
     * @throws IOException on error
     */
    private PDPageContentStream getPageContent() throws IOException {
        if(pageContent == null){
            generateContentStream(curPage);
        }
        return pageContent;
    }

    /**
     * Get the next new page
     *
     * @return the next new page
     */
    protected PDPage getNextPage(){
        return new PDPage();
    }

    /**
     * Generate a new page
     *
     * @return the new page
     */
    private PDPage generatePage() throws IOException {
        System.out.println("generate page");
        PDPage page = getNextPage();
        page.setBleedBox(format);
        document.addPage(page);
        curPage = page;
        this.yStart = this.getUpperY();
        getPageContent();
        return page;
    }

    /**
     * Generate a new content stream
     *
     * @param page the page
     *
     * @throws IOException on error
     */
    private void generateContentStream(PDPage page) throws IOException {
        pageContent = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.OVERWRITE, false);
        this.header();
        this.footer();
    }

    /**
     * Does the row is at the end of the page
     *
     * @param row The row to check
     *
     * @return if the row drawing will cause a page jump
     */
    private boolean isEndOfPage(Row row) throws IOException {
        float currentY = yStart - row.getHeight();
        boolean isEndOfPage = currentY <= margins.bottom;
        if (isEndOfPage) {
            tableIsBroken = true;
        }
        return isEndOfPage;
    }

    /**
     * Are we at the end of the page
     *
     * @param freeSpaceForPageBreak an amount of space to add the the page limit
     *
     * @return are we at the end of the page
     */
    private boolean isEndOfPage(float freeSpaceForPageBreak) {
        float currentY = yStart - freeSpaceForPageBreak;
        boolean isEndOfPage = currentY <= margins.bottom;
        if (isEndOfPage) {
            tableIsBroken = true;
        }
        return isEndOfPage;
    }

    /**
     * break the page and go to the next one
     *
     * @throws IOException On Error
     */
    public void pageBreak() throws IOException {
        System.out.println("page break");
        if(pageContent != null){
            pageContent.close();
            pageContent = null;
        }
        generatePage();
    }

    /**
     * Get the document pages number
     *
     * @return the pages number
     */
    public int getNumberOfPages(){
        return document.getNumberOfPages();
    }

    //endregion
    //region //////////////////////////////////////////// METADATA /////////////////////////////////////////////////////

    public PDDocumentInformation MetaData(){
        return this.document.getDocumentInformation();
    }

    public Document MetaData(PDDocumentInformation doc){
        this.document.setDocumentInformation(doc);
        return this;
    }
    //endregion
    //region //////////////////////////////////////////// DRAW LINE ////////////////////////////////////////////////////

    /**
     * Draw a vertical line
     *
     * @param color The line color
     * @param width The line width
     * @param x The line starting x position
     * @param y The line starting y position
     * @param toY The ending y position
     *
     * @return this
     * @throws IOException On error
     */
    public Document drawLineV(Color color, float width, float x, float y, float toY) throws IOException {
        return this.drawLine(color, width, x, y, x, toY);
    }

    /**
     * Draw a horizontal line
     *
     * @param color The line color
     * @param width The line width
     * @param x The starting x position
     * @param y The starting y position
     * @param toX The ending x position
     *
     * @return this
     * @throws IOException On error
     */
    public Document drawLineH(Color color, float width, float x, float y, float toX) throws IOException {
        return this.drawLine(color, width, x, y, toX, y);
    }


    /**
     * Draw a line from the current position to another
     *
     * @param color The line color
     * @param width The line width
     * @param toX The ending x position
     * @param toY The ending y position
     * @throws IOException
     */
    private void drawLine(Color color, float width, float toX, float toY) throws IOException {
        //toY = this.curPage.getBleedBox().getHeight() - toY;
        getPageContent();
        this.pageContent.setLineWidth(width);
        this.pageContent.lineTo(toX, toY);
        this.pageContent.setStrokingColor(color);
        this.pageContent.stroke();
    }

    /**
     * Draw a line from a position to another
     *
     * @param color The line color
     * @param width The line width
     * @param x The starting x position
     * @param y The starting y position
     * @param toX The ending x position
     * @param toY The ending y position
     *
     * @return this
     * @throws IOException On error
     */
    public Document drawLine(Color color, float width, float x, float y, float toX, float toY) throws IOException {
        // convert lower left origin to upper left one
        //y = this.curPage.getBleedBox().getHeight() - y;
        getPageContent();
        this.pageContent.moveTo(x, y);
        this.drawLine(color, width, toX, toY);
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// DRAW RECT ////////////////////////////////////////////////////

    /**
     * Draw a rectangle
     *
     * @param color The rectangle color
     * @param lineWidth The line width
     * @param x The initial x position
     * @param y The initial y position
     * @param width The rectangle width
     * @param height The rectangle height
     *
     * @return this
     * @throws IOException On error
     */
    public Document drawRect(Color color, float lineWidth, float x, float y, float width, float height) throws IOException {
        // convert lower left origin to upper left one
        //y = this.curPage.getBleedBox().getHeight() - y - height;
        getPageContent();
        this.pageContent.setStrokingColor(color);
        this.pageContent.setLineWidth(2);
        this.pageContent.addRect(x, y, width, height);
        this.pageContent.stroke();

        return this;
    }

    /**
     * Draw a filled rectangle
     *
     * @param color The rectangle color
     * @param x The initial x position
     * @param y The initial y position
     * @param width The rectangle width
     * @param height The rectangle height
     *
     * @return this
     * @throws IOException On error
     */
    public Document drawFilledRect(Color color, float x, float y, float width, float height) throws IOException {
        // convert lower left origin to upper left one
        //y = this.curPage.getBleedBox().getHeight() - y - height;
        getPageContent();
        this.pageContent.setNonStrokingColor(color);
        this.pageContent.addRect(x, y, width, height);
        this.pageContent.fill();

        return this;
    }

    //endregion


    public void draw(Drawable element, float x, float y, float maxX, float maxY) throws IOException {
        element.draw(this, x, y, maxX, maxY);
    }

    public void save(File file) throws IOException {
        if(pageContent != null){
            pageContent.close();
            pageContent = null;
        }
        document.save(file);
    }

}
