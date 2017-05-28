
package Patterns;

import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;
import nossadistribuidora.model.ProdutoGas;
import nossadistribuidora.view.ProdutoAguaView;
import nossadistribuidora.view.ProdutoGasView;

/**
 *
 * @author Giseli
 */

/*
* Classe fábrica que define a criação de um produto;
*/
public class FabricaProduto {
    public static Produto criaProduto(String tipo){
        Produto produto = null;
        
        if(tipo.equalsIgnoreCase("Gás")){
            produto = new ProdutoGas();
        }else if(tipo.equalsIgnoreCase("Água")){
            produto = new ProdutoAgua();
        }
        return produto;
    }
}
