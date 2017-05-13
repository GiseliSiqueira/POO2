/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadrespcaixaautomatico;

import java.util.Scanner;

/**
 *
 * @author Giseli
 */
public class CadRespCaixaAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Notas Disponíveis: 100.00, 50.00, 20.00, 5.00\n");
        System.out.println("INFORME UM VALOR PARA SAQUE: R$");
        valor = entrada.nextInt();
        
        if (valor >=5){
            SaqueHandler cem = new CemSaqueHandler();
            SaqueHandler cinquenta = new CinquentaSaqueHandler();
            SaqueHandler vinte = new VinteSaqueHandler();
            SaqueHandler cinco = new CincoSaqueHandler();

            cem.nextHandler(cinquenta);
            cinquenta.nextHandler(vinte);
            vinte.nextHandler(cinco);
            
            System.out.println("Você receberá:");
            
            cem.processaHandler(valor);
        }else{
            System.out.println("Valor inválido, a operação não pode ser realizada! ");
        }
    }
    
}
