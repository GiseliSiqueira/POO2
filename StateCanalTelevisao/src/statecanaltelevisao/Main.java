/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statecanaltelevisao;

import java.util.Scanner;

/**
 *
 * @author Giseli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean ligar = true;
        String opcao;
        
        CanalSetup canalSetup = new CanalSetup();
        
        System.out.println("canal atual: " + canalSetup.getEstadoCorrente().getCanalSelecionado());

        while(ligar){
            System.out.println("\nAumentar canal: Pressione 'A'\nDiminuir canal: Pressione 'D'\n"
                    + "Desligar: pressione qualquer outra tecla\n");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextLine();
           
            if(opcao.equalsIgnoreCase("A")){  
                canalSetup.pressionaBotaoAumentar();
                System.out.println("canal atual: " + canalSetup.getEstadoCorrente().getCanalSelecionado());
                canalSetup.getEstadoCorrente().selecionaCanal(opcao);
            }else if(opcao.equalsIgnoreCase("D")){
                canalSetup.pressionaBotaoDiminuir();
                System.out.println("canal atual: " + canalSetup.getEstadoCorrente().getCanalSelecionado());
                canalSetup.getEstadoCorrente().selecionaCanal(opcao);
            }else{
                ligar = false;
            }
        }
    }
    
}
