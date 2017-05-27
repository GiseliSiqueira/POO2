
package nossadistribuidora.model.DAO;

import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.Cliente;

/**
 *
 * @author Giseli
 */
/*
*Classe que define os métodos específicos para manipulação dos dados na tabela cliente. 
*/
public interface ClienteDAO extends GenericDAO<Cliente> {
   public Cliente buscaClientePorNome(String nome);
   public Cliente buscaClientePorId(int id);
   public Cliente buscaClientePorTelefone(String telefone);
   public void deletarClientePorId(int id);
   public void alterarClientePorId(int id);
}
