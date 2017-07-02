
package nossadistribuidora.model.DAO;

import java.util.Date;
import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.Venda;
import org.hibernate.Hibernate;

/**
 *
 * @author Giseli
 */
/*
*Classe que implementa os métodos específicos para manipulação dos dados na tabela venda
* definidos na interface VendaDAO e extende os métodos Genéricos de manipulação de dados
* implementados em GenericDAOImpl. 
*/
public class VendaDAOImpl extends GenericDAOImpl<Venda> implements VendaDAO {

    @Override
    public Venda buscaVendaPorCodigo(int codigo) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List<Venda> lista = sessao.createQuery("from Venda where codigo = '" + codigo + "'").list();
        if(!(lista.isEmpty())){
            Hibernate.initialize(lista.get(0).getListaDeProdutos());
            Hibernate.initialize(lista.get(0).getListaQuantidadeProdutos());
        }
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Venda)lista.get(0);
    }

    @Override
    public Venda buscaVendaPorData(Date data) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Venda where data = '" + data + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Venda)lista.get(0);
    }
    
}
