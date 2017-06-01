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
public class CanalSetup {
    
    private CanalSetupState canalQuatro;
    private CanalSetupState canalCinco;
    private CanalSetupState canalSeis;
    private CanalSetupState canalSete;
    private CanalSetupState estadoCorrente;
    
    public CanalSetup() {
        canalQuatro = new CanalQuatro(this);
        canalCinco = new CanalCinco(this);
        canalSeis = new CanalSeis(this);
        canalSete = new CanalSete(this);
        setEstado(canalQuatro);
        
    }
    
    public void setEstado(CanalSetupState estado){
        setEstadoCorrente(estado);
        
    }
    
    public void pressionaBotaoAumentar(){
        getEstadoCorrente().canalSeguinte();
    }
    
    public void pressionaBotaoDiminuir(){
        getEstadoCorrente().canalAnterior();
    }

    public CanalSetupState getCanalQuatro() {
        return canalQuatro;
    }

    public void setCanalQuatro(CanalSetupState canalQuatro) {
        this.canalQuatro = canalQuatro;
    }

    public CanalSetupState getCanalCinco() {
        return canalCinco;
    }

    public void setCanalCinco(CanalSetupState canalCinco) {
        this.canalCinco = canalCinco;
    }

    public CanalSetupState getCanalSeis() {
        return canalSeis;
    }

    public void setCanalSeis(CanalSetupState canalSeis) {
        this.canalSeis = canalSeis;
    }

    public CanalSetupState getCanalSete() {
        return canalSete;
    }

    public void setCanalSete(CanalSetupState canalSete) {
        this.canalSete = canalSete;
    }

    public CanalSetupState getEstadoCorrente() {
        return estadoCorrente;
    }

    public void setEstadoCorrente(CanalSetupState estadoCorrente) {
        this.estadoCorrente = estadoCorrente;
    }

}
