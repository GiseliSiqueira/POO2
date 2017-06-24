
package nossadistribuidora.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Giseli
 */

/*
*Classe "filha" da classe abstrata Produto que define as características do produto água.
*Anotações com @ são para configuração da persistência com Hibernate;
*Foi utilizada a estratégia de herança do Hibernate TABLE_PER_CLASS, que
*define que apenas as classes concretas geram suas respectivas tabelas, sendo assim, essa
*classe será uma tabela no banco.
*/
@Entity
@Table (name = "agua")
public class ProdutoAgua extends Produto{

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Column(length = 15,nullable = false)
    private float capacidade;

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        float oldCapacidade = this.capacidade;
        this.capacidade = capacidade;
        changeSupport.firePropertyChange("capacidade", oldCapacidade, capacidade);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    public String toString() {
        return (getNome() + " - " + getMarca() + " - " + getCapacidade()); 
    }
    
    
}
