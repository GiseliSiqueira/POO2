
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felipe
 */
public class MoveFile implements Runnable{

    private static File listaFiles[] = null;

    public static void main(String args[]) throws IOException, InterruptedException {
        
        
        MoveFile m1 = new MoveFile();
        new Thread(m1).start();
        new Thread(m1).start();
        
        /*final long startTime = System.currentTimeMillis();// tempo incial
        listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
        System.out.println("Iniciando copiar de arquivos");
        
        for(int i = 0; i < listaFiles.length; i++) {
            File origem = new File(listaFiles[i].getAbsolutePath());
            String destinationFile = listaFiles[i].getAbsolutePath();
            destinationFile = destinationFile.replace("origem", "destino");
            copyFile(origem, new File(destinationFile));
        }      
        
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:" + elapsedTimeMillis);*/

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
            listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles                
        } catch (IOException ex) {
            Logger.getLogger(MoveFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Iniciando copiar de arquivos");
        
        for(int i = 0; i < listaFiles.length; i++) {
            File origem = new File(listaFiles[i].getAbsolutePath());
            String destinationFile = listaFiles[i].getAbsolutePath();
            destinationFile = destinationFile.replace("origem", "destino");
            try {
                copyFile(origem, new File(destinationFile));
            } catch (IOException ex) {
                Logger.getLogger(MoveFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:" + elapsedTimeMillis);

    }
}
