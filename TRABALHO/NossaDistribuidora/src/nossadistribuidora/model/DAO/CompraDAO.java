
package nossadistribuidora.model.DAO;

/*
*Classe que define os métodos específicos para manipulação dos dados na tabela compra. 
*/
import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.Compra;

/**
 *
 * @author Giseli
 */
public interface CompraDAO extends GenericDAO<Compra>{
    public Compra buscaCompraPorNumero(int numero);
    
}
