/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.ProdutoDAO;
import nossadistribuidora.model.Produto;

/**
 *
 * @author Giseli
 */
public class ProdutoController {
    private ProdutoDAO produtoDAO;
    public void inserir(Produto produto){
        produtoDAO.inserir(produto);
    }
}
