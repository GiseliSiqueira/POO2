
package compositemenu;

/**
 *
 * @author Giseli
 */
public class ExibeMenu {

    public void ExibirMenu(Menu mc) {
        Menu[] menu = mc.getMenus();
        for (Menu item : menu){
            System.out.println(item.toString()); //item pode ser um menu simples ou um menu composto (ambos implementam toString)
            if (item instanceof MenuComposto) {
                    ExibirMenu(item);
            }
        }
    }
  
}
