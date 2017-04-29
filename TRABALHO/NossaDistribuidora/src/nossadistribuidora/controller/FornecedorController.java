/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.FornecedorDAO;
import nossadistribuidora.model.Fornecedor;

/**
 *
 * @author Giseli
 */
public class FornecedorController {
    private FornecedorDAO fornecedorDAO;
    public void inserir(Fornecedor fornecedor){
        fornecedorDAO.inserir(fornecedor);
    }
}
