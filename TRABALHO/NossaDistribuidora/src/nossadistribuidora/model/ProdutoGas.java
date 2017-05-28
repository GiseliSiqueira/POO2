
package nossadistribuidora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Giseli
 */

/*
*Classe "filha" da classe abstrata Produto que define as características do produto gás.
*Anotações com @ são para configuração da persistência com Hibernate;
*Foi utilizada a estratégia de herança do Hibernate TABLE_PER_CLASS, que
*define que apenas as classes concretas geram suas respectivas tabelas, sendo assim, essa
*classe será uma tabela no banco.
*/
@Entity
@Table (name = "gas")
public class ProdutoGas extends Produto{

    @Column(length = 15,nullable = false)
    private float peso;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
