
package Patterns;

import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;
import nossadistribuidora.model.ProdutoGas;
import nossadistribuidora.view.CompraAguaView;
import nossadistribuidora.view.CompraGasView;
import nossadistribuidora.view.ProdutoAguaView;
import nossadistribuidora.view.ProdutoGasView;

/**
 *
 * @author Giseli
 */

/*
* Classe fábrica que define a criação de tela para registro de compra de um produto;
*/
public class FabricaCompras {
    public static void criaTelaCompra(String tipoCompra){
        if(tipoCompra.equalsIgnoreCase("Água")){
            CompraAguaView compraAguaView = new CompraAguaView();
            compraAguaView.setVisible(true);
        }else if(tipoCompra.equalsIgnoreCase("Gás")){
            CompraGasView compraGasView = new CompraGasView();
            compraGasView.setVisible(true);
        }
    }
}
