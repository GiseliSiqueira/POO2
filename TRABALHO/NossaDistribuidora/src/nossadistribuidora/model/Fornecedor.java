/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nossadistribuidora.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table (name = "fornecedor")
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue
    private int numeroRegistro;
    @Column(length = 20,nullable = false)
    private String cnpj;
    @Column(length = 100,nullable = false)
    private String razaoSocial;
    @Column(length = 15)
    private String telefone;
    @Column(length = 10)
    private boolean statusAtivacao;
    @ManyToOne
    @Cascade(CascadeType.DELETE)
    private Endereco endereco;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String razaoSocial, String telefone, boolean statusAtivacao, Endereco endereco) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.statusAtivacao = statusAtivacao;
        this.endereco = endereco;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getStatusAtivacao() {
        return statusAtivacao;
    }

    public void setStatusAtivacao(boolean statusAtivacao) {
        this.statusAtivacao = statusAtivacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    /*
    *Metodos toString e equals sobrescritos para implementação do ComboModel utilizado
    *na View do produto.
    */
    @Override
    public String toString(){
        String texto = razaoSocial;
        return texto;
    }

    @Override
    public boolean equals(Object obj) {
        Fornecedor fornecedor = (Fornecedor) obj;
        return Objects.equals(this.numeroRegistro, fornecedor.numeroRegistro);
    }
    
    
}
