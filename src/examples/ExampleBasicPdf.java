package examples;

import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import plicosaure.pdf.settings.Border;
import plicosaure.pdf.Document;
import plicosaure.pdf.settings.Padding;
import plicosaure.pdf.settings.Format;
import plicosaure.pdf.structures.Row;
import plicosaure.pdf.structures.Table;
import plicosaure.pdf.structures.cell.Cell;
import plicosaure.pdf.structures.cell.CellText;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExampleBasicPdf {


    public static void main(String[] args){

        try {
            Document doc = new Document(Format.A4);
            PDDocumentInformation meta = doc.MetaData();
            meta.setAuthor("PLICOSAURE Systems");
            meta.setCreator("PLICOSAURE Systems");
            meta.setTitle("Basic Example");
            doc.drawText("coucou ca va ?", PDType1Font.HELVETICA, 12, Color.black, 10, doc.getLowerY() -10);
            doc.drawRect(Color.RED, 2,50, 50, 100, 200);
            doc.pageBreak();
            doc.drawLine(Color.blue, 2, 10, 20, 20, 20);
            Table tab = new Table();
            Row header = new Row(tab);
            header.addCell(new CellText("intel"));
            tab.setHeader(header);
            for(int i = 0; i < 156;++i){
                Row r = tab.addRow();
                for(int j = 0; j < 4;++j){
                    Border b = new Border();
                    b.setWidth(1);
                    Padding p = new Padding();
                    p.right = 2;
                    p.bottom = 2;
                    p.left = 2;
                    p.top = 2;
                    Cell c = new CellText("Cellule_"+i+"_"+j);
                    c.settings().setBackgroundColor(Color.cyan);
                    c.settings().borderBottom(b).borderLeft(b).borderRight(b).borderTop(b);
                    c.settings().padding(p);
                    r.addCell(c);
                }
            }
            doc.drawTable(tab, 20, doc.getUpperY() - 20);
            doc.save(new File("example-table.pdf"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
