/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypebuilderpiscina;

/**
 *
 * @author Giseli
 */
public abstract class PiscinaBuilder {
    Piscina piscina;
    
    public void fabricarCorpo(Formato formato){
        piscina.setCorpo(formato);
    }
    
    public void aplicarCor(String cor){
        piscina.setCor(cor);
    }
    
    public void AplicarTratamentoAntiVazamento(boolean tratAntiVazamento){
        piscina.setTratAntiVazamento(tratAntiVazamento);
    }
    
    public void AdicionarEscada(boolean escada){
        piscina.setEscada(escada);
    }
  
}
