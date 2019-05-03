package plicosaure.pdf;

import java.io.IOException;

public interface Drawable {

    /**
     * Draw the cell
     *
     * @param doc The document where to draw the cell
     * @param x The x coordinate where to draw the cell
     * @param y The y coordinate where to draw the cell
     * @param maxX The x coordinate where to stop drawing the cell
     * @param maxY The y coordinate where to stop drawing the cell
     *
     * @throws IOException on error
     */
    void draw(Document doc, float x, float y, float maxX, float maxY) throws IOException;
}
