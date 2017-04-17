
package cafeteria.dominio;

/**
 *
 * @author giseli
 */
public abstract class Bebida {
   
    String description = "Bebida";
    
    public String getDescription() {
        return description;
    }
    
     public Bebida() {              
    }

    public abstract double cost();
}
