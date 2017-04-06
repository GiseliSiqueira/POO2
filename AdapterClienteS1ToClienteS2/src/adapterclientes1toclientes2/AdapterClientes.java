
package adapterclientes1toclientes2;

/**
 *
 * @author Giseli
 */
public class AdapterClientes extends ClienteS1{
    
    private ClienteS2 cliente2;

    AdapterClientes(ClienteS2 c2) {
        this.cliente2 = c2;        
    }
    
    @Override
    public String getNomeCompleto() {
        //return this.nomeCompleto;
        return (cliente2.getNome() + " " + cliente2.getSobreNome());
    }
    
    @Override
    public String getTelefone() {
        return (cliente2.getDddTelefone() + cliente2.getTelefone());
    }

    @Override
    public String getEmail() {
        return (cliente2.getEmail());
    }

    @Override
    public String getCelular() {
        return (cliente2.getDddCelular()+cliente2.getCelular());
    }  
}
