
package Patterns.CadRespFormaPagamento;

/**
 *
 * @author Giseli
 */
public class CartaoHandler extends AbstractPagamentoHandler {

    public CartaoHandler() {
        super(Pagamento.CARTAO);
    }

    @Override
    public void processaFormaDePagamento() {
        //Processar o pagamento com cartao (processamento de comunicação com máquina etc...)
        //Atributo na classe venda que registra o tipo de pagamento deve receber o tipo de pagamento.
        
    }
    
    
}
