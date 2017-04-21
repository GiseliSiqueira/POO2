
package compositemenu;

/**
 *
 * @author Giseli
 */
public class ItemMenu extends Menu {

    public ItemMenu(String opcao, String descricao, double preco) {
        super(opcao, descricao, preco);
    }

    @Override
    public void addMenu(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Menu[] getMenus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
