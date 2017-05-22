
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.ClienteDAO;
import nossadistribuidora.model.Cliente;
import nossadistribuidora.model.DAO.ClienteDAOImpl;

/**
 *
 * @author Giseli
 */
public class ClienteController {
    //private ClienteDAO clienteDAO;
    ClienteDAO clienteDAO = new ClienteDAOImpl();
    
    public void inserir(Cliente cliente) throws Exception{
        clienteDAO.inserir(cliente);
    }
    
    public Cliente buscaClientePorNome(String nome){
        return clienteDAO.buscaClientePorNome(nome);
    }
    
    public void deletar(int id) throws Exception{
        clienteDAO.deletarClientePorId(id);
    }
    
    public void alterar( int id ) throws Exception{
        clienteDAO.alterarClientePorId(id);
        
    }
}
