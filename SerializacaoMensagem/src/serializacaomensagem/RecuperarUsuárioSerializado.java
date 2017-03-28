
package serializacaomensagem;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Giseli
 */
public class RecuperarUsuárioSerializado {
    public static void main(String[] args) throws Exception{
        Usuario user = null;
        
        String current = new java.io.File(".").getCanonicalPath();
        
        FileInputStream arqIn = new FileInputStream(current + "\\src\\usuario_serializado.ser");
        ObjectInputStream entrada = new ObjectInputStream(arqIn);
        
        user = (Usuario) entrada.readObject();
        entrada.close();
        
        System.out.println("Deserializando Usuario...");
        System.out.println("Nome: " + user.getNome());
    }
}
