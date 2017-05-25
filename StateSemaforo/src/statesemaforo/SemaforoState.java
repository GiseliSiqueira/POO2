/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesemaforo;

/**
 *
 * @author Giseli
 */
public abstract class SemaforoState {
    
    SemaforoState proxEstado;
    
    public abstract void selecionaEstado();
    
    public void setProximoEstado(SemaforoState estado){
        this.proxEstado = estado;
    }
    
    public SemaforoState getProximoEstado(){
        return this.proxEstado;
    }
}
