
package padraopesomosca;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class StatusItem {
    //private String nome;
    private boolean podeCancelar;
    private boolean compraConcluida;
    
    protected ArrayList<StatusItem> status; 

    public StatusItem(Estado estado, boolean cancelar, boolean concluir) {
        //this.nome = estado;
        this.podeCancelar = cancelar;
        this.compraConcluida = concluir;
        
    }

    public enum Estado {
       CARRINHO, FECHADO, PAGO, ENVIADO,ENTREGUE;
    }
}
