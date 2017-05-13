/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadrespcaixaautomatico;

/**
 *
 * @author Giseli
 */
public abstract class AbstractSaqueHandler implements SaqueHandler{
    
    private SaqueHandler proximoHandler;

    @Override
    public void nextHandler(SaqueHandler handler) {
        proximoHandler = handler;
    }

    @Override
    public void processaHandler(int valor) {
        
        int quantNotas = 0;
        int resto = 0;
        
        //LISTA QUE CONTEM A QUANTIDADE DE NOTAS DO VALOR E O RESTO;
        int[] lista = verificaValor(valor);
        
        if(lista.length >0){
            quantNotas = lista[0];
            resto = lista[1];
            //QUANTIDADE DE NOTAS INDICA QUE SERÁ INFORMADO QUE SERAO ENTREGUES X NOTAS DE X VALOR
            if(quantNotas > 0){
                valorAqui(quantNotas);
            }
        }
        //PROCURA O PROXIMO VALOR PARA TESTAR O VALOR (OU O RESTO);
        if (resto >= 5){
                proximoHandler.processaHandler(resto);
        }
    }
    
    public abstract int[] verificaValor(int valor);
    public abstract void valorAqui(int quantidade);
    
}
