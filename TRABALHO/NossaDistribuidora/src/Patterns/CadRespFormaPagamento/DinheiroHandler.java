
package Patterns.CadRespFormaPagamento;

/**
 *
 * @author Giseli
 */
public class DinheiroHandler extends AbstractPagamentoHandler {

    public DinheiroHandler() {
        super(Pagamento.DINHEIRO);
    }

    @Override
    public void processaFormaDePagamento() {
        //Atributo na classe venda que registra o tipo de pagamento deve receber o tipo de pagamento.
    }
    
}
