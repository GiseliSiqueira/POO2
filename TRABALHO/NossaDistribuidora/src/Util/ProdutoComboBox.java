
package Util;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import nossadistribuidora.controller.ProdutoAguaController;
import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;

/**
 *
 * @author Giseli
 */

/*
*Classe que preenche o JComboBox com valores obtidos da classe Produto.
*/
public class ProdutoComboBox extends AbstractListModel<ProdutoAgua> implements ComboBoxModel<ProdutoAgua> {
    
    private List<ProdutoAgua> listProduto;
    //private List<ProdutoGas> listProdutoGas;
    
    //seleciona um objeto no JComboBox
    private Produto selecionado;

    public ProdutoComboBox() {
        //Preenche a lista com os valores obtidos da classe
        preencherLista();
        //Define o objeto inicialmente selecionado.
        setSelectedItem(listProduto.get(0));
        
    }
    
    //Obtém o tamanho da lista
    @Override
    public int getSize() {
        int totalElementos = listProduto.size();
        return totalElementos;
    }

    //Obtém um objeto da lista em uma posição específica
    @Override
    public ProdutoAgua getElementAt(int indice) {
        ProdutoAgua produto = listProduto.get(indice);
        return produto;
    }

    //Marca um objeto como selecionado
    @Override
    public void setSelectedItem(Object anItem) {
        selecionado = (Produto) anItem;
    }

    //Obtém o objeto selecionado
    @Override
    public Object getSelectedItem() {
        return selecionado;
    }
    
    //metodo que preenche a lista
    private void preencherLista() {
        try {
            
            ProdutoAguaController aguaController = new ProdutoAguaController();
            
            // Cria um modelo vazio
            ProdutoAgua produtoAgua = new ProdutoAgua();
            produtoAgua.setMarca("");

            // Recupera os registros da tabela atraves do método listar
            listProduto = aguaController.listar(ProdutoAgua.class);
            

            // Cria o primeiro registro da lista que é o título
            ProdutoAgua primeiro = new ProdutoAgua();
            primeiro.setMarca("Selecione");

            // Adiciona o primeiro registro a lista 
            listProduto.add(0, primeiro);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
