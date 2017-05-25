/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesemaforo;

/**
 *
 * @author Giseli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SetupSemaforo semaforo = new SetupSemaforo();
        
        semaforo.setarEstadoInicial();
        while(true){
            semaforo.estadoCorrente.selecionaEstado();
            semaforo.vaiProximoEstado();
        }
    }
}
