/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotemplateexportfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import templateexemplo.ExportFiles;

/**
 *
 * @author Giseli
 */
public class ExportWord extends Export{
    
    XWPFDocument document;
    FileOutputStream out1 = null;

    @Override
    public void criaArquivo() {
        String current = null;
        
        try {
            current = new java.io.File(".").getCanonicalPath();
            out1 = new FileOutputStream(new File(current + "\\src\\" + "word.docx"));
            document = new XWPFDocument();
        } catch (IOException ex) {
            Logger.getLogger(ExportWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void exportaAquivo(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLineArquivo((String)linhas);
        }   
        salvaArquivo(); 
    }

    @Override
    public void printLineArquivo(String linha) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linha);
    }

    @Override
    public void salvaArquivo() {
        try {
            document.write(out1);
            out1.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
