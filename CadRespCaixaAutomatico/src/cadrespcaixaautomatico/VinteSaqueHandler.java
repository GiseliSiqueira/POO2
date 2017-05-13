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
public class VinteSaqueHandler extends AbstractSaqueHandler {

    @Override
    public int[] verificaValor(int valor) {
        int[] notasVinte = {(valor / 20),(valor % 20)};
       
       return notasVinte;
    }

    @Override
    public void valorAqui(int quantidade) {
        System.out.printf("%d notas de 20\n", quantidade);
    }
    
}
