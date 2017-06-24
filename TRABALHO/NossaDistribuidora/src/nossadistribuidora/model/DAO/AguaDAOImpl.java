
package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;

/**
 *
 * @author Giseli
 */
public class AguaDAOImpl extends GenericDAOImpl<ProdutoAgua> implements AguaDAO{

    @Override
    public ProdutoAgua buscaAguaPorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from ProdutoAgua where id = '" + id + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (ProdutoAgua)lista.get(0);
    }

    @Override
    public ProdutoAgua buscaAguaPorNome(String nome) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from ProdutoAgua where nome= '" + nome + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (ProdutoAgua)lista.get(0);
    }

    @Override
    public ProdutoAgua buscaAguaPorNomeMarcaCapacidade(String nome, String marca, float capacidade) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from ProdutoAgua where nome= '" + nome + "' and marca= '" + marca + 
                "' and capacidade= '" + capacidade + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (ProdutoAgua)lista.get(0);
    }
}
