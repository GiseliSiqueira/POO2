
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.GasDAO;
import nossadistribuidora.model.DAO.GasDAOImpl;
import nossadistribuidora.model.ProdutoGas;

/**
 *
 * @author Giseli
 */

/*
*Classe que controla a comunicação entre a View e o DAO do produto gás.
*/
public class ProdutoGasController {
    
    GasDAO gasDAO = new GasDAOImpl();
    
    public void inserir(ProdutoGas gas) throws Exception{
        gasDAO.inserir(gas);
    }
    
    public void deletar(ProdutoGas gas) throws Exception{
        gasDAO.deletar(gas);
    }
    
    public void alterar(ProdutoGas gas) throws Exception{
        gasDAO.alterar(gas); 
    }
    
    public ProdutoGas buscaGasPorId(int id){
        return gasDAO.buscaGasPorId(id);
    }

    public ProdutoGas buscaGasPorNome(String nome) {
        return gasDAO.buscaGasPorNome(nome);
    }
}
