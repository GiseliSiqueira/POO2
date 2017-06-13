
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;

/**
 *
 * @author felipe
 */
public class MoveFile{

    public static void main(String args[]) throws IOException, InterruptedException {
        
        //Cria objetos MoverArquivo para serem executados pelas threads
        MoverArquivo m1 = new MoverArquivo("Thread A"); 
        MoverArquivo m2 = new MoverArquivo("Thread B");
        
        //Inicia as threads.
        new Thread(m1).start();
        new Thread(m2).start();    
    }
}
