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
public class CemSaqueHandler extends AbstractSaqueHandler{

    @Override
    public int[] verificaValor(int valor) {
       
        int[] notasCem = {(valor / 100),(valor % 100)};
       
       return notasCem;
    }

    @Override
    public void valorAqui(int quantidade) {
        System.out.printf("%d notas de 100\n", quantidade);
    }
    
}
