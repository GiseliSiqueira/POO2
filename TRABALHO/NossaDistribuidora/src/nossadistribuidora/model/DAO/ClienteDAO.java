
package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.Cliente;

/**
 *
 * @author Giseli
 */
public interface ClienteDAO extends GenericDAO<Cliente> {
   public Cliente buscaClientePorNome(String nome);
   public Cliente buscaClientePorId(int id);
   public void deletarClientePorId(int id);
   public void alterarClientePorId(int id);
}
