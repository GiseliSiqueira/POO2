
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
        //GeradorNumeroTelefone gerador = GeradorNumeroTelefone.getInst();
        
        System.out.printf("numero de telefone: %d", GeradorNumeroTelefone.INST.getProxNum());
        System.out.printf("numero de telefone: %d", GeradorNumeroTelefone.INST.getProxNum());
        System.out.printf("numero de telefone: %d", GeradorNumeroTelefone.INST.getProxNum());
        System.out.printf("numero de telefone: %d", GeradorNumeroTelefone.INST.getProxNum());
    }
    
}
