/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.CompraDAO;
import nossadistribuidora.model.Compra;

/**
 *
 * @author Giseli
 */
public class CompraController {
    private CompraDAO compraDAO;
    public void inserir(Compra compra){
        compraDAO.inserir(compra);
    }
}
