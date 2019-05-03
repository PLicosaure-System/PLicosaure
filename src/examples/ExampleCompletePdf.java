package examples;

import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import plicosaure.pdf.Document;
import plicosaure.pdf.settings.Margins;
import plicosaure.pdf.Util;
import plicosaure.pdf.settings.Format;
import plicosaure.pdf.settings.VerticalAlignment;
import plicosaure.pdf.structures.Column;
import plicosaure.pdf.structures.Row;
import plicosaure.pdf.structures.Table;
import plicosaure.pdf.structures.cell.CellText;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExampleCompletePdf extends Document{

    private int type;

    public ExampleCompletePdf(int type) throws IOException {
        super(Format.A4);
        this.type = type;
        Margins margins = new Margins();
        margins.left = 10;
        margins.right = 10;
        margins.bottom = 10;
        margins.top = 10;
        this.margins(margins);
    }

    @Override
    protected void header() throws IOException {
        System.out.println("We are here");
        this.drawText("Informations", PDType1Font.HELVETICA, 12, Color.black, this.getMinX(), this.getUpperY() - Util.getFontHeight(PDType1Font.HELVETICA, 12));
        this.drawText("D3", PDType1Font.HELVETICA, 12, Color.black, this.getMaxX() - Util.getStringWidth("D3", PDType1Font.HELVETICA, 12), this.getUpperY() - Util.getFontHeight(PDType1Font.HELVETICA, 12));
        this.drawRect(Color.BLACK, 2, this.getMinX(), this.getUpperY()-200 - Util.getFontHeight(PDType1Font.HELVETICA, 12), this.getMaxX() - this.getMinX(), 200);


        Table firstTab = new Table();
        Row r = firstTab.addRow();
        CellText left = new CellText("Something");
        left.settings().setVerticalAlignment(VerticalAlignment.MIDDLE);
        CellText title = new CellText("tolérance matière assemblage");
        title.settings().setFontSize(36);
        CellText right = new CellText("Date : 25/04/2018");
        right.settings().setVerticalAlignment(VerticalAlignment.MIDDLE);
        r.addCell(left);
        r.addCell(title);
        r.addCell(right);
        Column c = firstTab.getColumn(0);
        c.setWidth(200);
        c = firstTab.getColumn(1);
        c.setWidth(300);
        c = firstTab.getColumn(1);
        c.setWidth(200);
        this.drawTable(firstTab, this.getMinX(), this.getUpperY()- Util.getFontHeight(PDType1Font.HELVETICA, 12));
        this.drawFilledRect(Color.darkGray, this.getMinX(), this.getUpperY() - 100, this.getMaxX()  - this.getMinX(), 10);
    }

    @Override
    protected void footer() {

    }

    public static void main(String[] args){

        try {
            Document doc = new ExampleCompletePdf(1);
            PDDocumentInformation meta = doc.MetaData();
            meta.setAuthor("PLICOSAURE Systems");
            meta.setCreator("PLICOSAURE Systems");
            meta.setTitle("Basic Example");
            doc.pageBreak();

            doc.save(new File("example-format1.pdf"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
