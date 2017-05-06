

package example.hibernate.persistencia;

import example.hibernate.model.Cliente;
import java.util.List;



/**
 *
 * @author Giseli
 */
public class ClienteDAOImpl  extends GenericDAOImpl<Cliente> implements ClienteDAO {

    public Cliente buscaUsuarioPorNomeESenha(String login, String senha) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Cliente where login = '" + login + "' and senha ='" + senha + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Cliente)lista.get(0);
    }

    //METODO ADICIONADO PARA BUSCAR CLIENTE POR NOME;
    public Cliente buscaUsuarioPorNome(String nome) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Cliente where nome = '" + nome + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Cliente)lista.get(0);
    }    
}
