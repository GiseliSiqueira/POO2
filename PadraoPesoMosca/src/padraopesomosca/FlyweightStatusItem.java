
package padraopesomosca;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class FlyweightStatusItem {

    protected ArrayList<StatusItem> flyweights;

    public FlyweightStatusItem() {
        flyweights = new ArrayList<StatusItem>();
        flyweights.add(new StatusItem(StatusItem.Estado.CARRINHO, true, false));
        flyweights.add(new StatusItem(StatusItem.Estado.FECHADO, true, false));
        flyweights.add(new StatusItem(StatusItem.Estado.PAGO, true, true));
        flyweights.add(new StatusItem(StatusItem.Estado.ENVIADO, false, true));
        flyweights.add(new StatusItem(StatusItem.Estado.ENTREGUE, false, true));
        
    }
    
    public StatusItem get(StatusItem.Estado std){
        switch (std){
            case CARRINHO: 
                return flyweights.get(0);
            case FECHADO:
                return flyweights.get(1);
            case PAGO:
                return flyweights.get(2);
            case ENVIADO:
                return flyweights.get(3);
            case ENTREGUE:
                return flyweights.get(4);
        }
        return null;
    }
    
}
