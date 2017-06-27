
package Patterns.CadRespFormaPagamento;

import javax.swing.JOptionPane;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */
public class DinheiroHandler extends AbstractPagamentoHandler {

    private final Venda venda;

    public DinheiroHandler(Venda venda) {
        super(Pagamento.DINHEIRO);
        this.venda = venda;
    }

    @Override
    public void processaFormaDePagamento() {
        //Atributo na classe venda que registra o tipo de pagamento deve receber o tipo de pagamento.
        venda.setFormaDePagamento("Dinheiro");
        JOptionPane.showMessageDialog(null,"Forma de pagamento: Dinheiro - Adicionada!",
                            "Inserir venda",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
