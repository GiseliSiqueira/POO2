/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.controller;

import nossadistribuidora.model.DAO.ClienteDAO;
import nossadistribuidora.model.Cliente;

/**
 *
 * @author Giseli
 */
public class ClienteController {
    private ClienteDAO clienteDAO;
    public void inserir(Cliente cliente){
        clienteDAO.inserir(cliente);
    }
}
