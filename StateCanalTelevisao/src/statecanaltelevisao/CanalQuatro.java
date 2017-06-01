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
public class CanalQuatro implements CanalSetupState{

    private CanalSetup canalSetup;
    private int canal;
    
    public CanalQuatro(CanalSetup canalSetup) {
        this.canalSetup = canalSetup;
        canal = 4;
    }

    @Override
    public void canalSeguinte() {
        canal++;
    }

    @Override
    public void canalAnterior() {
        canal--;
    }

    @Override
    public void selecionaCanal() {
        //System.out.println("Canal selecionado:" + canal);
        canalSetup.setEstado(canalSetup.getCanalCinco());
    }

    @Override
    public int getCanalSelecionado() {
        return canal;
    }

}
