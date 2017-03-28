
package serializacaomensagem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Giseli
 */
public class SalvarUsuárioSerializado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String current = new java.io.File( "." ).getCanonicalPath();
        
        Usuario user = new Usuario();
        user.setNome("Maria");
        
        FileOutputStream arqSerializado = new FileOutputStream(current + "\\src\\usuario_serializado.ser");
        ObjectOutputStream outputSerializado = new ObjectOutputStream(arqSerializado);
        outputSerializado.writeObject(user);
        outputSerializado.close();
        
        System.out.println("Usuário salvo!");
        System.out.println("Arquivo gerado em: " + current + "\\src\\usuario_serializado.ser");
    }
    
}
