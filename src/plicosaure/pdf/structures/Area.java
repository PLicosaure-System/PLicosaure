package plicosaure.pdf.structures;

import plicosaure.pdf.Document;
import plicosaure.pdf.Drawable;

import java.io.IOException;
import java.util.ArrayList;

public class Area implements Drawable {

    /**
     * The list of drawable elements contained in this area
     */
    private ArrayList<Drawable> elements;

    public Area(){
        elements = new ArrayList<>();
    }



    @Override
    public void draw(Document doc, float x, float y, float maxX, float maxY) throws IOException {
        for(Drawable d : elements){
        }
    }
}
