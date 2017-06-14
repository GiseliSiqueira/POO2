
package nossadistribuidora.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Giseli
 */
/*
* Anotações com @ são para configuração da persistência com Hibernate;
*/

@Entity
@Table (name = "cliente")
public class Cliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 100,nullable = false)
    private String nome;
    @ManyToOne
    @Cascade(CascadeType.DELETE)
    private Endereco endereco;
    @Column(length = 15)
    private String telefone;
    @Column(length = 10)
    private boolean StatusAtivacao;
    @Column(length = 10)
    private boolean StatusPagamento;

    public Cliente() {
    }

    public Cliente(String nome, Endereco endereco, String telefone, boolean StatusAtivacao, boolean StatusPagamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.StatusAtivacao = StatusAtivacao;
        this.StatusPagamento = StatusPagamento;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        Endereco oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public boolean getStatusAtivacao() {
        return StatusAtivacao;
    }

    public void setStatusAtivacao(boolean StatusAtivacao) {
        boolean oldStatusAtivacao = this.StatusAtivacao;
        this.StatusAtivacao = StatusAtivacao;
        changeSupport.firePropertyChange("statusAtivacao", oldStatusAtivacao, StatusAtivacao);
    }

    public boolean getStatusPagamento() {
        return StatusPagamento;
    }

    public void setStatusPagamento(boolean StatusPagamento) {
        boolean oldStatusPagamento = this.StatusPagamento;
        this.StatusPagamento = StatusPagamento;
        changeSupport.firePropertyChange("statusPagamento", oldStatusPagamento, StatusPagamento);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
