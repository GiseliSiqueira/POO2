/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.model.DAO;

import java.util.List;
import nossadistribuidora.factoryDAO.GenericDAOImpl;
import nossadistribuidora.factoryDAO.HibernateUtil;
import nossadistribuidora.model.Fornecedor;

/**
 *
 * @author Giseli
 */

/*
*Classe que implementa os métodos específicos para manipulação dos dados na tabela fornecedor
* definidos na interface FornecedorDAO e extende os métodos Genéricos de manipulação de dados
* implementados em GenericDAOImpl. 
*/
public class FornecedorDAOImpl extends GenericDAOImpl<Fornecedor> implements FornecedorDAO{

    @Override
    public Fornecedor buscaFornecedorPorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Fornecedor where id = '" + id + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Fornecedor)lista.get(0);
    }

    @Override
    public void deletarFornecedorPorId(int id) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        Fornecedor fornecedor = (Fornecedor) sessao.load(Fornecedor.class, id);
        sessao.delete(fornecedor);
        sessao.flush();
        transacao.commit();
        sessao.close();
    }

    @Override
    public Fornecedor buscaFornecedorPorCnpj(String cnpj) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Fornecedor where cnpj = '" + cnpj + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Fornecedor)lista.get(0);
    } 

    @Override
    public Fornecedor buscaFornecedorPorRazaoSocial(String razaoSocial) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Fornecedor where razaoSocial = '" + razaoSocial + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Fornecedor)lista.get(0);
    }

    @Override
    public Fornecedor buscaFornecedorPorTelefone(String telefone) {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List lista = sessao.createQuery("from Fornecedor where telefone = '" + telefone + "'").list();
        sessao.flush();
        transacao.commit();
        sessao.close();
        if (lista.isEmpty()){
            return null;
        }
        return (Fornecedor)lista.get(0);
    }
   
}
