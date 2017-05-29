
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.AguaDAO;
import nossadistribuidora.model.DAO.AguaDAOImpl;
import nossadistribuidora.model.DAO.ProdutoDAO;
import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;

/**
 *
 * @author Giseli
 */
public class ProdutoAguaController {
    AguaDAO aguaDAO = new AguaDAOImpl();
    
    public void inserir(ProdutoAgua agua) throws Exception{
        aguaDAO.inserir(agua);
    }
    
    public void deletar(ProdutoAgua agua) throws Exception{
        aguaDAO.deletar(agua);
    }
    
    public void alterar(ProdutoAgua agua) throws Exception{
        aguaDAO.alterar(agua);
    }
    
    public ProdutoAgua buscaAguaPorId(int id){
        return aguaDAO.buscaAguaPorId(id);
    }

    public ProdutoAgua buscaAguaPorNome(String nome) {
        return aguaDAO.buscaAguaPorNome(nome);
    }
}
