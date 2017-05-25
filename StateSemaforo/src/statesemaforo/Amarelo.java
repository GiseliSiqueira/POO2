/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesemaforo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giseli
 */
public class Amarelo extends SemaforoState{

    private long tempo = 3000;
   
    @Override
    public void selecionaEstado() {
        System.out.println("Sinal amarelo!");
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Amarelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
