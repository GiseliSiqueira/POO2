
package singletonnumerodetelefone;

import java.util.Random;

/**
 *
 * @author Giseli
 */
public class NumeroTelefone {
    private long numero;
    public long geraNumeroTel(){
        
        Random gerar = new Random();
        String num = "";
       
        for (int contador = 0; contador < 8; contador++){//cria o numero com 8 dígitos
            num += gerar.nextInt(10);
            System.out.println(num);
        }
        numero = Long.parseLong(num);
        return numero;
    }    

    /*public int gerarNumero(){ 
        
        return gerar.nextInt(10); //numero aleatorio entre 0 e 9
    }*/
}
