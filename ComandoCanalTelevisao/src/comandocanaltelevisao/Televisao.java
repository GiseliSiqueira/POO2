
package comandocanaltelevisao;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class Televisao {
    ArrayList listaCanais = new ArrayList();
    int canal = 0;
    String canalAtual;

    public Televisao(ArrayList listaCanais) {
        this.listaCanais = listaCanais;
    }
    
    public void aumentarCanal(){
        canal++;
        //configura o loop do ultimo ao primeiro canal;
        if(canal < listaCanais.size()){
            canalAtual = (String) listaCanais.get(canal);
            System.out.println("Canal Atual: " + canalAtual);
        }else{
            canal = 0;
            canalAtual = (String) listaCanais.get(canal);
            System.out.println("Canal Atual: " + canalAtual);
        }
    }
    
    public void diminuirCanal(){
        //Verifica se está no ultimo canal(posição 0 da lista), caso esteja, seta o anterior
        //como o ultimo da lista.
        if(canal > 0){
            canal--;
        }else{
            canal = (listaCanais.size())-1;
        }
        
        //Configura o loop do primeiro ao ultimo canal da lista
        if(canal < listaCanais.size()){
                canalAtual = (String) listaCanais.get(canal);
                System.out.println("Canal Atual: " + canalAtual);
        }else{
            canal = 0;
            canalAtual = (String) listaCanais.get(canal);
            System.out.println("Canal Atual: " + canalAtual);
        }
    }
}
