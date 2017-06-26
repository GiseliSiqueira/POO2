
package Patterns.CadRespFormaPagamento;

import java.util.List;

/**
 *
 * @author Giseli
 */

/*
* Classe abstrata que seleciona que deve tratar a requisição de forma de pagamento de uma venda
*/
public abstract class AbstractPagamentoHandler {
    
    public enum Pagamento { DINHEIRO, CARTAO}; //Formas de pagamento Possíveis
    public Pagamento tipoDePagamento; 
    public List<Integer> opcoesDePagamento;
    public AbstractPagamentoHandler proxOpcao;

    public AbstractPagamentoHandler(Pagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }
    
    //Configura a proxima opção de pagamento definida na cadeia de receivers
    public void setProxOpcao(AbstractPagamentoHandler proxOpcao){
        this.proxOpcao = proxOpcao;
    }
    
    //Executa a verificação de receiver para cada opção de pagamento informada na lista de opções
    public void buscaOpcaoDePagamento(List<Pagamento> opcoesDePagamento){
        for (Pagamento opcao : opcoesDePagamento) {
            pagamentoHandler(opcao);}
    }    
    
    //Processa a requisição caso o receiver seja a opção de pagamento selecionada ou procura o proximo para tratar a requisição
    public void pagamentoHandler(Pagamento opcaoDePagamento){
        if(tipoDePagamento == opcaoDePagamento){
            processaFormaDePagamento();
        }else{
            proxOpcao.pagamentoHandler(opcaoDePagamento);
        }
    }
    
    public abstract void processaFormaDePagamento();
}
