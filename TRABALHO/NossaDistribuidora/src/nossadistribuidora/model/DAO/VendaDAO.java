
package nossadistribuidora.model.DAO;

import java.util.Date;
import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */
/*
*Classe que define os métodos específicos para manipulação dos dados na tabela venda. 
*/
public interface VendaDAO extends GenericDAO<Venda>{

    public Venda buscaVendaPorCodigo(int codigo);

    public Venda buscaVendaPorData(Date data);
    
}
