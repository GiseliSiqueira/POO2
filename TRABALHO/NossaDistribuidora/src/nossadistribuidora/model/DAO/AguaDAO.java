
package nossadistribuidora.model.DAO;

import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.ProdutoAgua;

/**
 *
 * @author Giseli
 */

/*
*Classe que define os métodos específicos para manipulação dos dados na tabela Agua. 
*/
public interface AguaDAO extends GenericDAO<ProdutoAgua> {

    public ProdutoAgua buscaAguaPorId(int id);

    public ProdutoAgua buscaAguaPorNome(String nome);
    
    
}
