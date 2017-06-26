
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.CompraDAO;
import nossadistribuidora.model.Compra;
import nossadistribuidora.model.DAO.CompraDAOImpl;

/**
 *
 * @author Giseli
 */

/*
*Classe que controla a comunicação entre a View e o DAO da Compra.
*/
public class CompraController {
    
    CompraDAO compraDAO = new CompraDAOImpl();
    
    public void inserir(Compra compra) throws Exception{
        compraDAO.inserir(compra);
    }
    
    public Compra buscaCompraPorNumero(int numero){
        return compraDAO.buscaCompraPorNumero(numero);
    }
    
    public void deletar(Compra compra) throws Exception{
        compraDAO.deletar(compra);
    }
}
