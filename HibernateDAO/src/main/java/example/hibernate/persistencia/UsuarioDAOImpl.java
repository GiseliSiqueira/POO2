

package example.hibernate.persistencia;

import example.hibernate.model.Usuario;
import java.util.List;



/**
 *
 * @author Giseli
 */
public class UsuarioDAOImpl  extends GenericDAOImpl<Usuario> implements UsuarioDAO {

    public Usuario buscaUsuarioPorNomeESenha(String login, String senha) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Usuario where login = '" + login + "' and senha ='" + senha + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Usuario)lista.get(0);
    }

    //METODO ADICIONADO PARA BUSCAR CLIENTE POR NOME;
    public Usuario buscaUsuarioPorNome(String nome) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Usuario where nome = '" + nome + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Usuario)lista.get(0);
    }    
}
