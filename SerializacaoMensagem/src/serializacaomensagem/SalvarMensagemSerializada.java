
package serializacaomensagem;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Giseli
 */
public class SalvarMensagemSerializada {
    public static void main(String[] args) throws Exception{
        String current = new java.io.File( "." ).getCanonicalPath();
        
        Mensagem msg = new Mensagem();
        msg.setTexto("Texto da mensagem! :) ");
        
        FileOutputStream arqSerializado = new FileOutputStream(current + "\\src\\mensagem_serializada.ser");
        ObjectOutputStream outputSerializado = new ObjectOutputStream(arqSerializado);
        outputSerializado.writeObject(msg);
        outputSerializado.close();
        
        System.out.println("Mensagem salva!");
        System.out.println("Arquivo gerado em: " + current + "\\src\\mensagem_serializada.ser");
        
    }
}
