
package Patterns;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import nossadistribuidora.controller.ProdutoAguaController;
import nossadistribuidora.controller.ProdutoGasController;
import nossadistribuidora.model.ProdutoAgua;
import nossadistribuidora.model.ProdutoGas;
import nossadistribuidora.view.CompraAguaView;
import nossadistribuidora.view.CompraGasView;

/**
 *
 * @author Giseli
 */
/*
*Classe que cria o JComboBox com as informações de produtos que estão salvos de cada tipo selecionado
*/
public class FabricaProdutoComboBox {
    
    public static void criaJComboBoxProduto(String tipoProduto, JComboBox comboBox){
        
        if(tipoProduto.equalsIgnoreCase("Água")){
            ProdutoAguaController aguaController = new ProdutoAguaController();
            try {
                //Busca todos os produtos cadastrados no banco
                List<ProdutoAgua> listProd = aguaController.listar(ProdutoAgua.class);
                //percorre a lista com os produtos adicionando-os ao comboBox
                for(ProdutoAgua agua : listProd){
                   comboBox.addItem(agua);
                }
            } catch (Exception ex) {
                Logger.getLogger(CompraAguaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(tipoProduto.equalsIgnoreCase("Gás")){
            ProdutoGasController gasController = new ProdutoGasController();
            try {
                //Busca todos os produtos cadastrados no banco
                List<ProdutoGas> listProd = gasController.listar(ProdutoGas.class);
                //percorre a lista com os produtos adicionando-os ao comboBox
                for(ProdutoGas gas : listProd){
                    comboBox.addItem(gas);
                }
            } catch (Exception ex) {
                Logger.getLogger(CompraGasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
