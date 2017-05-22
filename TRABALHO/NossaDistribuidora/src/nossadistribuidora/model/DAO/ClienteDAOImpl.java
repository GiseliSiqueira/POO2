

package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.Cliente;



/**
 *
 * @author Giseli
 */
public class ClienteDAOImpl extends GenericDAOImpl<Cliente> implements ClienteDAO {

    @Override
    public Cliente buscaClientePorNome(String nome) {
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

    @Override
    public void deletarClientePorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        Cliente cliente = (Cliente) sessao.load(Cliente.class, id);
        sessao.delete(cliente);
        sessao.flush();
        transacao.commit();
        sessao.close();
    }

    @Override
    public void alterarClientePorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        Cliente cliente = (Cliente) sessao.load(Cliente.class, id);
        sessao.update(cliente);
        sessao.flush();
        transacao.commit();
        sessao.close();
    }

    
}
