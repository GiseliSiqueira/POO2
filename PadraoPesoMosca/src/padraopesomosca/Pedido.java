
package padraopesomosca;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class Pedido {

    public ArrayList<ItemPedido> itemPedido = new ArrayList();
    
    public void addItemPedido(ItemPedido item) {
        this.itemPedido.add(item);
    }
    
}
