
package Patterns.CadRespFormaPagamento;

import java.util.LinkedList;
import java.util.List;
import nossadistribuidora.model.Venda;

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
    public void selecionaFormaDePagamento(AbstractPagamentoHandler.Pagamento formaPagamento, Venda venda){
        AbstractPagamentoHandler dinheiro = new DinheiroHandler(venda);
        AbstractPagamentoHandler cartao = new CartaoHandler(venda);
        
        //Especifica a cadeia de receivers
        dinheiro.setProxOpcao(cartao);
        
        List<AbstractPagamentoHandler.Pagamento> opcoesDePagamento = new LinkedList<>();
        opcoesDePagamento.add(formaPagamento); //Adiciona a forma de pagamento selecionada à lista das opções de pagamento
        
        dinheiro.buscaOpcaoDePagamento(opcoesDePagamento); // Inicia a busca por um receiver para tratar a requisição.
    }
}
