
package nossadistribuidora.controller;

import java.util.List;
import nossadistribuidora.model.DAO.AguaDAO;
import nossadistribuidora.model.DAO.AguaDAOImpl;
import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;

/**
 *
 * @author Giseli
 */

/*
*Classe que controla a comunicação entre a View e o DAO do Produto Água.
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
    
    public ProdutoAgua buscaAguaPorNomeMarcaCapacidade(String nome, String marca, float capacidade){
        return aguaDAO.buscaAguaPorNomeMarcaCapacidade(nome, marca, capacidade);
    }
    
    public List<ProdutoAgua> listar(Class clazz) throws Exception{
        return aguaDAO.listar(clazz);
    }
}
