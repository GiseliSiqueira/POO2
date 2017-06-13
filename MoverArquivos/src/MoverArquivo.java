
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giseli
 */
public class MoverArquivo implements Runnable {
    
    private static File listaFiles[] = null;
    public static int cont = -1; //Contador para controlar a distribuição dos arquivos para as threads.
    private String nomeThread;

    public MoverArquivo(String nomeThread) {
        this.nomeThread = nomeThread; //Atribui nome a thread.
    }
    
    
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }
    
   
    public static void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }

    @Override
    public void run() {
        final long startTime = System.currentTimeMillis();// tempo incial
        try {
            listaFiles = MoverArquivo.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
        } catch (IOException ex) {
            Logger.getLogger(MoveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Iniciando copiar de arquivos" + nomeThread);
        
        incrementaContador();
        while(cont < listaFiles.length){
            
            File origem = new File(listaFiles[cont].getAbsolutePath());
            String destinationFile = listaFiles[cont].getAbsolutePath();
            destinationFile = destinationFile.replace("origem", "destino")  + nomeThread;
            
            try{
                copyFile(origem, new File(destinationFile));
                incrementaContador();
            }catch (IOException ex) {
                    Logger.getLogger(MoveFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
        
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:" + elapsedTimeMillis);
    }
    
    /*
    *Método que incrementa o contador que controla a distribuição dos arquivos para as threads.
    */
    public static synchronized int incrementaContador(){
        
        return cont++;
    }
}


