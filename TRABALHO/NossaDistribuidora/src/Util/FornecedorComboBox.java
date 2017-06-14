
package Util;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import nossadistribuidora.controller.FornecedorController;
import nossadistribuidora.model.Fornecedor;

/**
 *
 * @author Giseli
 */

/*
*Classe que preenche o JComboBox com valores obtidos da classe Fornecedor.
*/
public class FornecedorComboBox extends AbstractListModel<Fornecedor> implements ComboBoxModel<Fornecedor> {
    
    private List<Fornecedor> listFornecedor;
    //seleciona um objeto no JComboBox
    private Fornecedor selecionado;

    public FornecedorComboBox() {
        //Preenche a lista com os valores obtidos da classe
        preencherLista();
        //Define o objeto inicialmente selecionado.
        setSelectedItem(listFornecedor.get(0));
    }
    
    //Obtém o tamanho da lista
    @Override
    public int getSize() {
        int totalElementos = listFornecedor.size();
        return totalElementos;
    }

    //Obtém um objeto da lista em uma posição específica
    @Override
    public Fornecedor getElementAt(int indice) {
        Fornecedor fornecedor = listFornecedor.get(indice);
        return fornecedor;
    }

    //Marca um objeto como selecionado
    @Override
    public void setSelectedItem(Object anItem) {
        selecionado = (Fornecedor) anItem;
    }

    //Obtém o objeto selecionado
    @Override
    public Object getSelectedItem() {
        return selecionado;
    }
    
    //metodo que preenche a lista
    private void preencherLista() {
        try {
            
            FornecedorController fornecedorController = new FornecedorController();
            
            // Cria um modelo vazio
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setRazaoSocial("");

            // Recupera os registros da tabela atraves do método listar
            listFornecedor = fornecedorController.listar(Fornecedor.class);

            // Cria o primeiro registro da lista que é o título
            Fornecedor primeiro = new Fornecedor();
            primeiro.setRazaoSocial("Selecione");

            //Adiciona o primeiro registro a lista 
            listFornecedor.add(0, primeiro);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
