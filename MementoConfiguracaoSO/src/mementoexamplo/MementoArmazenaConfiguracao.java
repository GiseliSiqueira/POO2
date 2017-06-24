
package mementoexamplo;

public class MementoArmazenaConfiguracao {
    
    private ConfiguracaoSO config;
    private ConfiguracaoSO state;
    
    //Editado para registrar o momento e recuperar as configurações do SO após modificações;
    public MementoArmazenaConfiguracao(ConfiguracaoSO config) throws CloneNotSupportedException {
        this.config = config;
        this.state = (ConfiguracaoSO) config.clone();
    }
    
    public void restoreState(){
        config.setUsb(state.isUsb());
        config.setVersaoSO(state.getVersaoSO());
        config.setWifi(state.isWifi());
    } 
}
