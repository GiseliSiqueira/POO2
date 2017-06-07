
package exerciciotemplateexportfiles;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n"; 
        
        ExportHtml exportarHTML = new ExportHtml();
        exportarHTML.exportarArquivo(texto);
        
        ExportWord exportarWord = new ExportWord();
        exportarWord.exportarArquivo(texto);
    }
    
}
