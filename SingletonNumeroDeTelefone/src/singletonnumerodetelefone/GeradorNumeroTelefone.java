
package singletonnumerodetelefone;

/**
 *
 * @author Giseli
 */
public enum GeradorNumeroTelefone {
    INST;

    private GeradorNumeroTelefone() {
    }
    
    public synchronized long getProxNum(){
        NumeroTelefone numero = new NumeroTelefone();
        return numero.geraNumeroTel();
    }
    
}
