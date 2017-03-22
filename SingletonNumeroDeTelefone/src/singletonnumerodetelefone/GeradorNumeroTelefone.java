
package singletonnumerodetelefone;

/**
 *
 * @author Giseli
 */
public class GeradorNumeroTelefone {
    
    private static GeradorNumeroTelefone inst;

    public synchronized static GeradorNumeroTelefone getInst(){
        if(inst == null){
            inst = new GeradorNumeroTelefone();
        }
        return inst;
    }
    
    private long numero; 
    private GeradorNumeroTelefone() {
    }
    
    public synchronized long getProxNum(){
        return numero;
    }
    
}
