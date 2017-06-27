
package nossadistribuidora.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Giseli
 */
/*
*Classe "mãe" abstrata que define as características comuns dos produtos.
*Anotações com @ são para configuração da persistência com Hibernate;
*Foi utilizada a estratégia de herança do Hibernate TABLE_PER_CLASS, que
*define que apenas as classes concretas geram suas respectivas tabelas.
*/

//@MappedSuperclass // Define que os atributos pertencentes a está classe irão ser mapeados por outra classe, ou seja, por uma subclasse.
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long ID;//Atributo criado para a realização de persistência
    @Column(length = 20,nullable = false)
    private String marca;
    private int quantidadeEstoque;
    @Column(length = 15, nullable = false)
    private float valor;
    @Column(length = 100)
    private String nome;
    @Column(length = 255)
    private String caracteristica;
    @Column(length = 10,nullable = false)
    private boolean disponibilidadeEstoque;
    @ManyToOne
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(String marca, int quantidadeEstoque, float valor, String nome, String caracteristica, boolean disponibilidadeEstoque, Fornecedor fornecedor) {
        this.marca = marca;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valor = valor;
        this.nome = nome;
        this.caracteristica = caracteristica;
        this.disponibilidadeEstoque = disponibilidadeEstoque;
        this.fornecedor = fornecedor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public boolean getDisponibilidadeEstoque() {
        return disponibilidadeEstoque;
    }

    public void setDisponibilidadeEstoque(boolean disponibilidadeEstoque) {
        this.disponibilidadeEstoque = disponibilidadeEstoque;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
