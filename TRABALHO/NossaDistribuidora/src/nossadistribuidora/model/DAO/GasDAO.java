
package nossadistribuidora.model.DAO;

import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoGas;

/**
 *
 * @author Giseli
 */
/*
*Classe que define os métodos específicos para manipulação dos dados na tabela gás. 
*/
public interface GasDAO extends GenericDAO<ProdutoGas> {

    public ProdutoGas buscaGasPorId(int id);

    public ProdutoGas buscaGasPorNome(String nome);
    
    
}
