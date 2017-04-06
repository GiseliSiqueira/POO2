
package adapterclientes1toclientes2;

/**
 *
 * @author Giseli
 */
public class SalvaCliente {
    
    public void salva(ClienteS1 cliente){ 
        System.out.println("Salvando o cliente...");
        System.out.println(cliente.getNomeCompleto());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getEmail());
        System.out.println(cliente.getCelular());
    }
}
