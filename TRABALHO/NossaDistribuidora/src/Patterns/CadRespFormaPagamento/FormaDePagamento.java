
package Patterns.CadRespFormaPagamento;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Giseli
 */

/*
*Classe que instancia as formas de pagamento e a cadeia de receivers que tratarão a
*requisição de acordo com a forma de pagamento selecionada.
*/
public class FormaDePagamento {
    //Método que recebe a forma de pagamento selecionada na aplicação venda
    public void selecionaFormaDePagamento(AbstractPagamentoHandler.Pagamento formaPagamento){
        AbstractPagamentoHandler dinheiro = new DinheiroHandler();
        AbstractPagamentoHandler cartao = new CartaoHandler();
        
        //Especifica a cadeia de receivers
        dinheiro.setProxOpcao(cartao);
        
        List<AbstractPagamentoHandler.Pagamento> opcoesDePagamento = new LinkedList<>();
        opcoesDePagamento.add(formaPagamento); //Adiciona a forma de pagamento selecionada à lista das opções de pagamento
        
        dinheiro.buscaOpcaoDePagamento(opcoesDePagamento); // Inicia a busca por um receiver para tratar a requisição.
    }
}
