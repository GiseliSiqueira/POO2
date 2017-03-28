
package serializacaomensagem;

import java.io.Serializable;

/**
 *
 * @author Giseli
 */
public class Mensagem implements Serializable{
    private String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
