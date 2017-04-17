
package cafeteria.dominio.adicionais;

import cafeteria.dominio.Adicionais;
import cafeteria.dominio.Bebida;

/**
 *
 * @author giseli
 */
public class Chocolate extends Adicionais {

    public Chocolate(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Chocolate";
    }
    public double cost() {
        return 2 + bebida.cost();
    }
}
