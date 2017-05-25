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
public class SetupSemaforo {
    
    SemaforoState verdeState = new Verde();
    SemaforoState amareloState = new Amarelo();
    SemaforoState vermelhoState = new Vermelho();
    SemaforoState estadoCorrente;
    
    public SetupSemaforo() {
    }
    
    public void setarEstadoInicial(){
        verdeState.setProximoEstado(amareloState);
        amareloState.setProximoEstado(vermelhoState);
        vermelhoState.setProximoEstado(verdeState);
        this.estadoCorrente = verdeState;
    }
    
    public SemaforoState getEstado(){
        return this.estadoCorrente;
    }     
    
    public void vaiProximoEstado(){
        this.estadoCorrente = this.estadoCorrente.getProximoEstado();
    }

}
