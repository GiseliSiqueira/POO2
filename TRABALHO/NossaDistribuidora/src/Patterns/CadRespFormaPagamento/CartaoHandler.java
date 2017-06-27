
package Patterns.CadRespFormaPagamento;

import javax.swing.JOptionPane;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */
public class CartaoHandler extends AbstractPagamentoHandler {

    private final Venda venda;

    public CartaoHandler(Venda venda) {
        super(Pagamento.CARTAO);
        this.venda = venda;
    }

    @Override
    public void processaFormaDePagamento() {
        //Processar o pagamento com cartao (processamento de comunicação com máquina etc...)
        //Atributo na classe venda que registra o tipo de pagamento deve receber o tipo de pagamento.
        JOptionPane.showMessageDialog(null,"Forma de pagamento indisponível. Verifique essa informação e"
                            + "tente novamente!",
                            "Inserir venda",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
}
