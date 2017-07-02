
package Patterns;

import nossadistribuidora.view.CompraAguaView;
import nossadistribuidora.view.CompraGasView;

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
