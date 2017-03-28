
package serializacaomensagem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Giseli
 */
public class RecuperarMensagemSerializada {
    public static void main(String[] args) throws Exception{
        Mensagem msg = null;
        
        String current = new java.io.File(".").getCanonicalPath();
        
        FileInputStream arqIn = new FileInputStream(current + "\\src\\mensagem_serializada.ser");
        ObjectInputStream entrada = new ObjectInputStream(arqIn);
        
        msg = (Mensagem) entrada.readObject();
        entrada.close();
        
        System.out.println("Deserializando Mensagem...");
        System.out.println("Mensagem: " + msg.getTexto());
    }
}
