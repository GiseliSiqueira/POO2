
package padraopesomosca;

/**
 *
 * @author Giseli
 */
public class ItemPedido {
    private String descricao;
    private String nome;
    private StatusItem status;
    private StatusItem estatus;
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusItem getStatus() {
        return status;
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }

    public void setEstatus(StatusItem estatus) {
        this.estatus = estatus;
    }

    public StatusItem getEstatus() {
        return estatus;
    }
}
