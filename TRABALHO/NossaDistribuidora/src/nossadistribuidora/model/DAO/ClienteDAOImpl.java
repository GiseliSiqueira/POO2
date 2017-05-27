

package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.Cliente;



/**
 *
 * @author Giseli
 */

/*
*Classe que implementa os métodos específicos para manipulação dos dados na tabela cliente
* definidos na interface ClienteDAO e extende os métodos Genéricos de manipulação de dados
* implementados em GenericDAOImpl. 
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
    public Cliente buscaClientePorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Cliente where id = '" + id + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Cliente)lista.get(0);
    }
    
    @Override
    public Cliente buscaClientePorTelefone(String telefone) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Cliente where telefone = '" + telefone + "'").list();
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
