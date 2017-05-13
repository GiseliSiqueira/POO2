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
public class CincoSaqueHandler extends AbstractSaqueHandler{

    @Override
    public int[] verificaValor(int valor) {
       int[] notasCinco = {(valor / 5),(valor % 5)};
       
       return notasCinco;
    }

    @Override
    public void valorAqui(int quantidade) {
        System.out.printf("%d notas de 5\n", quantidade);
    }
    
}
