
package nossadistribuidora.controller;

import java.util.Date;
import java.util.List;
import nossadistribuidora.model.DAO.VendaDAO;
import nossadistribuidora.model.DAO.VendaDAOImpl;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */
/*
*Classe que controla a comunicação entre a View e o DAO da venda.
*/
public class VendaController {
    VendaDAO vendaDAO = new VendaDAOImpl();
    
    public void inserir(Venda venda) throws Exception{
        vendaDAO.inserir(venda);
    }
    
    public void deletar(Venda venda) throws Exception{
        vendaDAO.deletar(venda);
    }
    
    public void alterar(Venda venda) throws Exception{
        vendaDAO.alterar(venda);
    }
    
    public List<Venda> listar(Class clazz) throws Exception{
        return vendaDAO.listar(clazz);
    }
    
    public Venda buscaVendaPorCodigo(int codigo){
        return vendaDAO.buscaVendaPorCodigo(codigo);
    }
    
    public Venda buscaVendaPorData(Date data){
        return vendaDAO.buscaVendaPorData(data);
    }
    
}
