/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadorcaixaentrada;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class CaixaEntradaGrupo extends Observable{
    
    private ArrayList<Observer> monitores;
    private String mensagem;

    public void setNovaMensagem(String msg){
        mensagem = msg;
        notifyObserver();
    }
    
    public String getMensagem() {
        return mensagem;
    }
}
