

package example.hibernate.persistencia;

import example.hibernate.model.Cliente;

/**
 *
 * @author Giseli
 */
public interface ClienteDAO extends GenericDAO<Cliente> {
    
    public Cliente buscaUsuarioPorNomeESenha(String login, String senha);
    public Cliente buscaUsuarioPorNome(String nome);
}
