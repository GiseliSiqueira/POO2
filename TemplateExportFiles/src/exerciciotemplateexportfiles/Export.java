/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotemplateexportfiles;

/**
 *
 * @author Giseli
 */
public abstract class Export {
    
    public abstract void criaArquivo();
   // public abstract void exportaAquivo(String txt);
    public abstract void printLineArquivo(String linha);
    public abstract void salvaArquivo();
    
    public void exportarArquivo(String texto){
        criaArquivo();
        exportaAquivo(texto);
    }
    
    public void exportaAquivo(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLineArquivo((String)linhas);
        }   
        salvaArquivo(); 
    }
}
