
package compositemenu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giseli
 */
public class MenuComposto extends Menu{
    private List<Menu> menus;

    public MenuComposto(String opcao, String descricao) {
        super(opcao, descricao, 0);
        menus = new ArrayList<Menu>();
    }
   
    @Override
    public void addMenu(Menu menu){
        menus.add(menu);
    }
    
    @Override
    public Menu[] getMenus(){
       return menus.toArray(new Menu[menus.size()]);
    }
    
    //metodo que imprime o menu composto.
    public String toString(){
        return this.getOpcao() + " - " + this.getDescricao();
    }
   
}