/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.VendaDAO;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */
public class VendaController {
    private VendaDAO vendaDAO;
    public void inserir(Venda venda){
        vendaDAO.inserir(venda);
    }
}
