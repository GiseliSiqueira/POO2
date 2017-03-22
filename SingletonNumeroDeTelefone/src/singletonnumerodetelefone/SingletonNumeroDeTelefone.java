
package singletonnumerodetelefone;

/**
 *
 * @author Giseli
 */
public class SingletonNumeroDeTelefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeradorNumeroTelefone gerador = GeradorNumeroTelefone.getInst();
        
        System.out.println("numero de telefone: " + gerador.getProxNum());
        System.out.println("numero de telefone: " + gerador.getProxNum());
        System.out.println("numero de telefone: " + gerador.getProxNum());
        System.out.println("numero de telefone: " + gerador.getProxNum());
    }
    
}
