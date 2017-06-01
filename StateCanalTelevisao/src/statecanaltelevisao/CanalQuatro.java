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
        canal = 5;
    }

    @Override
    public void canalAnterior() {
        canal = 7;
    }

    @Override
    public void selecionaCanal(String opcao) {
        if(opcao.equalsIgnoreCase("A")){
            canalSetup.setEstado(canalSetup.getCanalCinco());
        }else if(opcao.equalsIgnoreCase("D")){
            canalSetup.setEstado(canalSetup.getCanalSete());
        }
    }

    @Override
    public int getCanalSelecionado() {
        return canal;
    }

}
