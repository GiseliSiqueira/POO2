/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;
import nossadistribuidora.model.ProdutoGas;

/**
 *
 * @author Giseli
 */
public class FabricaProduto {
    public static Produto criaProduto(String tipo){
        Produto produto = null;
        
        if(tipo.equalsIgnoreCase("Gás")){
            produto = new ProdutoGas();
        }else if(tipo.equalsIgnoreCase("Água")){
            produto = new ProdutoAgua();
        }
        return produto;
    }
}
