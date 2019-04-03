package plicosaure.pdf.settings;

import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import plicosaure.pdf.Border;
import plicosaure.pdf.Padding;

import java.awt.*;

/**
 * Class representing the settings of a cell
 */
public class CellSettings {

    //region //////////////////////////////////////////// ALIGNMENTS ///////////////////////////////////////////////////

    /**
     * The cell horizontal alignment setting
     */
    private HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEFT;

    /**
     * The cell vertical alignment setting
     */
    private VerticalAlignment verticalAlignment = VerticalAlignment.MIDDLE;

    /**
     * Get the cell vertical alignment setting
     * @return The alignment
     */
    public VerticalAlignment getVerticalAlignment(){
        return verticalAlignment;
    }

    /**
     * Set the cell vertical alignment setting
     *
     * @param verticalAlignment The new setting
     *
     * @return this
     */
    public CellSettings setVerticalAlignment(VerticalAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }

    /**
     * Get the cell horizontal alignment setting
     *
     * @return The alignment
     */
    public HorizontalAlignment getHorizontalAlignment(){
        return horizontalAlignment;
    }

    /**
     * Set the cell horizontal alignment setting
     *
     * @param horizontalAlignment The new horizontal alignment
     *
     * @return this
     */
    public CellSettings setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// FONTS ////////////////////////////////////////////////////////

    /**
     * The font size setting of the cell
     */
    private Integer fontSize;

    /**
     * The font setting of the cell
     */
    private PDFont font;

    /**
     * Get the font size setting
     *
     * @return the font size
     */
    public Integer getFontSize() {
        if(fontSize == null)
            return 12;
        return fontSize;
    }

    /**
     * Set the font size setting
     *
     * @param fontSize The new font size setting
     *
     * @return this
     */
    public CellSettings setFontSize(Integer fontSize){
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Get the cell font setting
     *
     * @return the font setting
     */
    public PDFont getFont(){
        if(font == null)
            font = PDType1Font.HELVETICA;
        return font;
    }

    /**
     * Set the cell font setting
     *
     * @param font The new font setting
     *
     * @return this
     */
    public CellSettings setFont(PDFont font){
        this.font = font;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// PADDING //////////////////////////////////////////////////////

    /**
     * The cell padding setting
     */
    private Padding padding;

    /**
     * Get the cell padding setting
     *
     * @return The padding
     */
    public Padding padding(){
        if(padding == null)
            padding = new Padding();
        return padding;
    }

    /**
     * Set the cell padding setting
     *
     * @param padding The new padding setting
     *
     * @return this
     */
    public CellSettings padding(Padding padding){
        this.padding = padding;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// BORDER ///////////////////////////////////////////////////////

    /**
     * The borders settings
     */
    private Border
            borderTop,
            borderBottom,
            borderLeft,
            borderRight;

    /**
     * Get the border top setting
     *
     * @return the border top setting
     */
    public Border borderTop(){
        return borderTop;
    }

    /**
     * Set the cell border top setting
     *
     * @param border The new border top setting
     *
     * @return this
     */
    public CellSettings borderTop(Border border){
        this.borderTop = border;
        return this;
    }

    /**
     * Get the border bottom setting
     *
     * @return the border bottom setting
     */
    public Border borderBottom(){
        return borderBottom;
    }

    /**
     * Set the cell border bottom setting
     *
     * @param border The new border bottom setting
     *
     * @return this
     */
    public CellSettings borderBottom(Border border){
        this.borderBottom = border;
        return this;
    }

    /**
     * Get the border left setting
     *
     * @return the border left setting
     */
    public Border borderLeft(){
        return borderLeft;
    }

    /**
     * Set the cell border left setting
     *
     * @param border The new border left setting
     *
     * @return this
     */
    public CellSettings borderLeft(Border border){
        this.borderLeft = border;
        return this;
    }

    /**
     * Get the border right setting
     *
     * @return the border right setting
     */
    public Border borderRight(){
        return borderRight;
    }

    /**
     * Set the cell border right setting
     *
     * @param border The new border right setting
     *
     * @return this
     */
    public CellSettings borderRight(Border border){
        this.borderRight = border;
        return this;
    }

    //endregion
    //region //////////////////////////////////////////// BACKGROUND COLOR /////////////////////////////////////////////

    /**
     * The cell background color setting
     */
    private Color backgroundColor;

    /**
     * Set the cell background color setting
     *
     * @param backgroundColor The new background color setting
     *
     * @return this
     */
    public CellSettings setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * Get the background color setting
     *
     * @return the background color setting
     */
    public Color getBackgroundColor() {
        if(backgroundColor == null)
            backgroundColor = Color.white;
        return backgroundColor;
    }

    //endregion
}
