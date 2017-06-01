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
        
        
        while(ligar){
            System.out.println("mudar canal? S/N");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextLine();
            if(opcao.equalsIgnoreCase("S")){                
                //System.out.println("canal atual: " + canalSetup.getEstadoCorrente().getCanalSelecionado());
                if(canalSetup.getEstadoCorrente() == canalSetup.getCanalQuatro()){
                    System.out.println("canal atual: " + canalSetup.getEstadoCorrente().getCanalSelecionado());
                }
                canalSetup.pressionaBotaoAumentar();
                canalSetup.getEstadoCorrente().selecionaCanal();
                //System.out.println("canal atual: " + canalSetup.getEstadoCorrente().getCanalSelecionado());

            }else{
                ligar = false;
            }
        }
    }
    
}
