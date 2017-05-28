/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import java.util.List;
import nossadistribuidora.model.DAO.FornecedorDAO;
import nossadistribuidora.model.DAO.FornecedorDAOImpl;
import nossadistribuidora.model.Fornecedor;

/**
 *
 * @author Giseli
 */

/*
*Classe que controla a comunicação entre a View e o DAO do Fornecedor.
*/
public class FornecedorController {
    
    FornecedorDAO fornecedorDAO = new FornecedorDAOImpl();
    
    public void inserir(Fornecedor fornecedor) throws Exception{
        fornecedorDAO.inserir(fornecedor);
    }
    
    public Fornecedor buscaFornecedorPorId(int id){
        return fornecedorDAO.buscaFornecedorPorId(id);
    }
    
    public void alterar(Fornecedor fornecedor ) throws Exception{
        fornecedorDAO.alterar(fornecedor);
    }
    
     public void deletar(int id) throws Exception{
        fornecedorDAO.deletarFornecedorPorId(id);
    }

    public Fornecedor buscaFornecedorPorCnpj(String cnpj) {
        return fornecedorDAO.buscaFornecedorPorCnpj(cnpj);
    }

    public Fornecedor buscaFornecedorPorRazaoSocial(String razaoSocial) {
        return fornecedorDAO.buscaFornecedorPorRazaoSocial(razaoSocial);
    }

    public Fornecedor buscaFornecedorPorTelefone(String telefone) {
        return fornecedorDAO.buscaFornecedorPorTelefone(telefone);
    }
    
    public List<Fornecedor> listar(Class clazz) throws Exception{
        return fornecedorDAO.listar(clazz);
    }
}
