
package compositemenu;

/**
 *
 * @author Giseli
 */
public class CompositeMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Menu menuSimples = new ItemMenu("2.3.1", "Torta", 2.00);
        Menu menuSimples2 = new ItemMenu("2.3.2", "bolo", 2.00);
        
        Menu menuSobremesa = new MenuComposto("2.3","Menu Sobremesa");
        menuSobremesa.addMenu(menuSimples);
        menuSobremesa.addMenu(menuSimples2);
        
        
        Menu menuSimples3 = new ItemMenu("2.1", "Pizza", 10.00);
        Menu menuSimples4 = new ItemMenu("2.2", "Hamburger", 5.00);
 
        Menu menuJantar = new MenuComposto("2", "Menu Jantar");
        menuJantar.addMenu(menuSimples3);
        menuJantar.addMenu(menuSimples4);
        menuJantar.addMenu(menuSobremesa);
        
        Menu menuSimples5 = new ItemMenu("1.1", "Café expresso", 3.00);
        Menu menuSimples6 = new ItemMenu("1.2", "Café com leite", 2.00);
        Menu menuSimples7 = new ItemMenu("1.3", "Café simples", 1.00);
        
        Menu menuCafe = new MenuComposto("1", "Menu Café");
        menuCafe.addMenu(menuSimples5);
        menuCafe.addMenu(menuSimples6);
        menuCafe.addMenu(menuSimples7);
        
        Menu menu = new MenuComposto(null, "Menu");
        menu.addMenu(menuCafe);
        menu.addMenu(menuJantar);
        
        ExibeMenu exibe = new ExibeMenu(); // exibe o menu
        exibe.ExibirMenu(menu);
        
    }
    
}
