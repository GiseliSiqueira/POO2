
package nossadistribuidora.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 *
 * @author Giseli
 */

/*
* Anotações com @ são para configuração da persistência com Hibernate;
*/
@Entity
@Table (name = "compra")
public class Compra implements Serializable {
    @Id
    @GeneratedValue
    private int numero;
    @Column(length = 10)
    private Date data;
    @Column(length = 10)
    private float valorCompra;
    @Column(length = 10)
    private int quantidadeProduto;
    
    @ManyToMany //(cascade = CascadeType.REMOVE)
    //@Cascade (org.hibernate.annotations.CascadeType.DELETE)
    private List<ProdutoAgua> listaDeProdutosAgua;

    @ManyToMany //(cascade = CascadeType.REMOVE)
    //@Cascade (org.hibernate.annotations.CascadeType.DELETE)
    private List<ProdutoGas> listaDeProdutosGas;
    
    public Compra() {
    }

    public Compra(int numero, Date data, float valor, int quantidadeProduto,
            List<ProdutoAgua> listaDeProdutosAgua, List<ProdutoGas> listaDeProdutosGas){/* Produto produtoCompra) {*/
        this.numero = numero;
        this.data = data;
        this.valorCompra = valor;
        this.quantidadeProduto = quantidadeProduto;
        this.listaDeProdutosAgua = listaDeProdutosAgua;
        this.listaDeProdutosGas = listaDeProdutosGas;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public List<ProdutoAgua> getListaDeProdutosAgua() {
        return listaDeProdutosAgua;
    }

    public void setListaDeProdutosAgua(List<ProdutoAgua> listaDeProdutos) {
        this.listaDeProdutosAgua = listaDeProdutos;
    }

    public List<ProdutoGas> getListaDeProdutosGas() {
        return listaDeProdutosGas;
    }

    public void setListaDeProdutosGas(List<ProdutoGas> listaDeProdutosGas) {
        this.listaDeProdutosGas = listaDeProdutosGas;
    }
    
    
    
}
