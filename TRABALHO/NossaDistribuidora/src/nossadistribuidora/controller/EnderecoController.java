
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.EnderecoDAO;
import nossadistribuidora.model.DAO.EnderecoDAOImpl;
import nossadistribuidora.model.Endereco;

/**
 *
 * @author Giseli
 */
public class EnderecoController {
    
    EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
    public void inserir(Endereco endereco) throws Exception{
        enderecoDAO.inserir(endereco);
    }
    
    public void alterar( Endereco endereco ) throws Exception{
        enderecoDAO.alterar(endereco);
    }
}
