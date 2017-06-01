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
public class CanalSeis implements CanalSetupState {
    
    private CanalSetup canalSetup;
    private int canal;
    
    public CanalSeis(CanalSetup canalSetup) {
        this.canalSetup = canalSetup;
        canal = 6;
    }

    @Override
    public void canalSeguinte() {
        canal=7;
    }

    @Override
    public void canalAnterior() {
        canal=5;
    }

    @Override
    public void selecionaCanal(String opcao) {
        if(opcao.equalsIgnoreCase("A")){
            canalSetup.setEstado(canalSetup.getCanalSete());
        }else if(opcao.equalsIgnoreCase("D")){
            canalSetup.setEstado(canalSetup.getCanalCinco());
        }
    }

    @Override
    public int getCanalSelecionado() {
        return canal;
    }

}
