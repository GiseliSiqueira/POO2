
package adapterclientes1toclientes2;

/**
 *
 * @author Giseli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteS1 c1 = new ClienteS1();
        ClienteS2 c2 = new ClienteS2();
        
        c2.setCelular("1111");
        c2.setDddCelular("027");
        c2.setTelefone("3333");
        c2.setDddTelefone("027"); 
        c2.setEmail("email"); 
        c2.setNome("jose"); 
        c2.setSobreNome("Silva");
        
        AdapterClientes adapterCli = new AdapterClientes(c2);
        SalvaCliente salvar = new SalvaCliente();
        salvar.salva(adapterCli);
    }
}
