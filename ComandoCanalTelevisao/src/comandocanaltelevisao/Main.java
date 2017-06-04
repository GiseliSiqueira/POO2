
package comandocanaltelevisao;

import java.util.ArrayList;
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
        ArrayList listaCanais = new ArrayList();
        listaCanais.add("2");
        listaCanais.add("3");
        listaCanais.add("4");
        listaCanais.add("5");
        listaCanais.add("6");
        
        Televisao televisao = new Televisao(listaCanais);
        ControleCanal controle = new ControleCanal();
        controle.setComandos(new AumentaCanalCommand(televisao), new DiminuiCanalCommand(televisao));
        
        String opcao = "";
        
        while(true){
            System.out.println("Pressione 'A' para aumentar canal, 'D' para diminuir"
                    + "canal ou 'S' para sair:");
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextLine();
            
            if(opcao.equalsIgnoreCase("A")){
                controle.aumentarCanal();
            }else if(opcao.equalsIgnoreCase("D")){
                controle.diminuirCanal();
            }else{
                break;
            }
            
        }
        /*controle.aumentarCanal();
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.diminuirCanal();
        controle.diminuirCanal();*/
    }
    
}
