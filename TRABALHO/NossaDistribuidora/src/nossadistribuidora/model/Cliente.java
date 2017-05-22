
package nossadistribuidora.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
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
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 100)
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
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getStatusAtivacao() {
        return StatusAtivacao;
    }

    public void setStatusAtivacao(boolean StatusAtivacao) {
        this.StatusAtivacao = StatusAtivacao;
    }

    public boolean getStatusPagamento() {
        return StatusPagamento;
    }

    public void setStatusPagamento(boolean StatusPagamento) {
        this.StatusPagamento = StatusPagamento;
    }

    
}
