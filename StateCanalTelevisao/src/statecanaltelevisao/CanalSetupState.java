/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statecanaltelevisao;

/**
 *
 * @author Giseli
 */
public interface CanalSetupState {
    
    public void canalSeguinte();
    
    public void canalAnterior();
    
    public void selecionaCanal(String opcao);

    public int getCanalSelecionado();
}
