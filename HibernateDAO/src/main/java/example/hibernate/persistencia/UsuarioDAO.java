

package example.hibernate.persistencia;

import example.hibernate.model.Usuario;

/**
 *
 * @author Giseli
 */
public interface UsuarioDAO extends GenericDAO<Usuario> {
    
    public Usuario buscaUsuarioPorNomeESenha(String login, String senha);
    public Usuario buscaUsuarioPorNome(String nome);
}
