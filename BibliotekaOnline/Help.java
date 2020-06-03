import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;

import java.io.File;
import java.io.IOException;

public class Help {

    public static void main(String[] args){
        try {
            PdfDocument p = new PdfDocument(new PdfReader(new File("Resources/Pan Tadeusz-Adam_Mickiewicz.pdf")));
            System.out.print(p.getNumberOfPages());
        } catch(IOException e){e.printStackTrace();}

    }
}
