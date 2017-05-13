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
public class CinquentaSaqueHandler extends AbstractSaqueHandler{

    @Override
    public int[] verificaValor(int valor) {
       int[] notasCinquenta = {(valor / 50),(valor % 50)};
       
       return notasCinquenta;
    }

    @Override
    public void valorAqui(int quantidade) {
        System.out.printf("%d notas de 50\n", quantidade);
    }
    
}
