/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.CompraDAO;
import nossadistribuidora.model.Compra;
import nossadistribuidora.model.DAO.CompraDAOImpl;

/**
 *
 * @author Giseli
 */
public class CompraController {
    
    CompraDAO compraDAO = new CompraDAOImpl();
    
    public void inserir(Compra compra) throws Exception{
        compraDAO.inserir(compra);
    }
    
    public Compra buscaCompraPorNumero(int numero){
        return compraDAO.buscaCompraPorNumero(numero);
    }
    
    public void deletar(Compra compra) throws Exception{
        compraDAO.deletar(compra);
    }
}
