
package nossadistribuidora.controller;

import java.util.List;
import nossadistribuidora.model.DAO.ClienteDAO;
import nossadistribuidora.model.Cliente;
import nossadistribuidora.model.DAO.ClienteDAOImpl;

/**
 *
 * @author Giseli
 */

/*
*Classe que controla a comunicação entre a View e o DAO do Cliente.
*/
public class ClienteController {
    
    ClienteDAO clienteDAO = new ClienteDAOImpl();
    
    public void inserir(Cliente cliente) throws Exception{
        clienteDAO.inserir(cliente);
    }
    
    public Cliente buscaClientePorNome(String nome){
        return clienteDAO.buscaClientePorNome(nome);
    }
    
    public Cliente buscaClientePorId(int id){
        return clienteDAO.buscaClientePorId(id);
    }
    
    public Cliente buscaClientePorTelefone(String telefone){
        return clienteDAO.buscaClientePorTelefone(telefone);
    }
    
    public void deletar(Cliente cliente) throws Exception{
        clienteDAO.deletar(cliente);
    }
    
    public void alterar( Cliente cliente ) throws Exception{
        clienteDAO.alterar(cliente); 
    }
    
    public List<Cliente> listar(Class clazz) throws Exception{
        return clienteDAO.listar(clazz);
    }
}
