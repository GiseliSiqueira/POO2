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
public class CanalSete implements CanalSetupState{

    private CanalSetup canalSetup;
    private int canal;
    
    public CanalSete(CanalSetup canalSetup) {
        this.canalSetup = canalSetup;
        canal = 7;
    }

    @Override
    public void canalSeguinte() {
        
        canal = 4;
        
    }

    @Override
    public void canalAnterior() {
        canal--;
    }

    @Override
    public void selecionaCanal() {
        canalSetup.setEstadoCorrente(canalSetup.getCanalQuatro());
        //canalSetup.setEstado(canalSetup.setEstadoCorrente(this));
    }

    @Override
    public int getCanalSelecionado() {
        return canal;
    }

    
}
