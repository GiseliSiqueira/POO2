
package padraopesomosca;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class MainSemPadrao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList(); 
        
        for(int i=0; i< 200000; i++){             
            Pedido pedido = new Pedido();
            
            ItemPedido item1 = new ItemPedido();
            item1.setDescricao("lapis de cor modelo xyz");
            item1.setNome("lapis");                        
            item1.setStatus(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            
            ItemPedido item2 = new ItemPedido();
            item2.setDescricao("caneta cor azul");
            item2.setNome("caneta");                                    
            item2.setStatus(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            
            ItemPedido item3 = new ItemPedido();
            item3.setDescricao("caneta cor vermelha");
            item3.setNome("caneta");                        
            item3.setStatus(new StatusItem(StatusItem.Estado.CARRINHO , true, false));
            
            pedido.addItemPedido(item1);
            pedido.addItemPedido(item2);
            pedido.addItemPedido(item3);                                   
            pedidos.add(pedido);
        }
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);        
        System.out.println(pedidos.size());
    }
    
}
