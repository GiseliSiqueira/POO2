
package nossadistribuidora.model.DAO;

import nossadistribuidora.factoryDAO.GenericDAO;
import nossadistribuidora.model.Fornecedor;

/**
 *
 * @author Giseli
 */

/*
*Classe que define os métodos específicos para manipulação dos dados na tabela fornecedor. 
*/
public interface FornecedorDAO extends GenericDAO<Fornecedor> {

    public Fornecedor buscaFornecedorPorId(int id);

    public void deletarFornecedorPorId(int id);

    public Fornecedor buscaFornecedorPorCnpj(String cnpj);

    public Fornecedor buscaFornecedorPorRazaoSocial(String razaoSocial);

    public Fornecedor buscaFornecedorPorTelefone(String telefone);
    
}
