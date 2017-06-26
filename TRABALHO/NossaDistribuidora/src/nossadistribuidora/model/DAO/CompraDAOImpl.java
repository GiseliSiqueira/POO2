
package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.Compra;
import org.hibernate.Hibernate;

/**
 *
 * @author Giseli
 */

/*
*Classe que implementa os métodos específicos para manipulação dos dados na tabela compra
* definidos na interface CompraDAO e extende os métodos Genéricos de manipulação de dados
* implementados em GenericDAOImpl. 
*/
public class CompraDAOImpl extends GenericDAOImpl<Compra> implements CompraDAO{

    @Override
    public Compra buscaCompraPorNumero(int numero) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List<Compra> lista = sessao.createQuery("from Compra where numero = '" + numero + "'").list();
        if(!(lista.isEmpty())){
            Hibernate.initialize(lista.get(0).getListaDeProdutosGas());
            Hibernate.initialize(lista.get(0).getListaDeProdutosAgua());
        }
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Compra)lista.get(0);
    }
}
