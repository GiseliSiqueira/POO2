
package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.ProdutoGas;

/**
 *
 * @author Giseli
 */
public class GasDAOImpl extends GenericDAOImpl<ProdutoGas> implements GasDAO{

    @Override
    public ProdutoGas buscaGasPorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from gas where id = '" + id + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (ProdutoGas)lista.get(0);
    }

    @Override
    public ProdutoGas buscaGasPorNome(String nome) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from gas where nome = '" + nome + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (ProdutoGas)lista.get(0);
    }
    
}
