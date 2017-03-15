/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidametodofabrica;

import java.util.Scanner;

/**
 *
 * @author Giseli
 */
public class Principal {
    public static void main(String[] args) {
        
        System.out.println("***********MENU***********");
        System.out.println("Selecione o tipo de bebida: \n"
                + "1 - Café\n"
                + "2 - Chá\n"
                + "3 - Refrigerante\n"
                + "4 - Suco\n");
        Scanner entrada = new Scanner(System.in);
        int escolha = entrada.nextInt();
        
        Bebida bebida;
        bebida = FabricaBebida.prepararBebida(escolha);
        bebida.confirmarBebida();
    }
}
