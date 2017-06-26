
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

    @ManyToMany
    private List<Object> listaDeProdutos;

    public Venda() {
    }

    public Venda(int codigo, Date data, String statusEntrega, boolean statusPagamento, Date dataRecebimento, List<Object> listaDeProdutos) {
        this.codigo = codigo;
        this.data = data;
        this.statusEntrega = statusEntrega;
        this.statusPagamento = statusPagamento;
        this.dataRecebimento = dataRecebimento;
        this.listaDeProdutos = listaDeProdutos;
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

    public boolean isStatusPagamento() {
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

    public List<Object> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Object> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
