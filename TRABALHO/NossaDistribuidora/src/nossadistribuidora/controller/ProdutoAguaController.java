
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.ProdutoDAO;
import nossadistribuidora.model.Produto;

/**
 *
 * @author Giseli
 */
public class ProdutoAguaController {
    private ProdutoDAO produtoDAO;
    public void inserir(Produto produto){
        produtoDAO.inserir(produto);
    }
}
