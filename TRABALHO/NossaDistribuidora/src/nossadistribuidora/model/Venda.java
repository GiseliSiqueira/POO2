
package nossadistribuidora.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table (name = "venda")
public class Venda implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    @Column(length = 10)
    private Date data;
    @Column(length = 25)
    private String statusEntrega;
    @Column(length = 10)
    private boolean statusPagamento;
    @Column(length = 10)
    private Date dataRecebimento;
    @Column(length = 15)
    private String formaDePagamento;
    
    @Column(length = 10)
    private float desconto; // Vai estar em ItemVenda
    @Column(length = 10)
    private float valorTotal; // Vai estar em ItemVenda
    @ElementCollection
    private List<Integer> listaQuantidadeProdutos; //vai estar em itemVenda
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToMany
    private List<Produto> listaDeProdutos;

    public Venda() {
    }

    public Venda(int codigo, Date data, String statusEntrega, boolean statusPagamento, 
            Date dataRecebimento, List<Produto> listaDeProdutos, Cliente cliente,
            float desconto, float valorTotal, String formaDePagamento,
            List<Integer> listaQuantidadeProdutos) {
        this.codigo = codigo;
        this.data = data;
        this.statusEntrega = statusEntrega;
        this.statusPagamento = statusPagamento;
        this.dataRecebimento = dataRecebimento;
        this.listaDeProdutos = listaDeProdutos;
        this.cliente = cliente;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
        this.formaDePagamento = formaDePagamento;
        this.listaQuantidadeProdutos = listaQuantidadeProdutos;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(String statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public boolean getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public List<Integer> getListaQuantidadeProdutos() {
        return listaQuantidadeProdutos;
    }

    public void setListaQuantidadeProdutos(List<Integer> listaQuantidadeProdutos) {
        this.listaQuantidadeProdutos = listaQuantidadeProdutos;
    }
}
