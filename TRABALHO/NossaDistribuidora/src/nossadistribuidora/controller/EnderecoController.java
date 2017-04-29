/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.EnderecoDAO;
import nossadistribuidora.model.Endereco;

/**
 *
 * @author Giseli
 */
public class EnderecoController {
    private EnderecoDAO enderecoDAO;
    public void inserir(Endereco endereco){
        enderecoDAO.inserir(endereco);
    }
}
