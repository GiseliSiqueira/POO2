
package compositemenu;

/**
 *
 * @author Giseli
 */
public abstract class Menu {
    
    private String opcao;
    private String descricao;
    private double preco;

    public Menu(String opcao, String descricao, double preco) {
        this.opcao = opcao;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public String getOpcao(){
        return opcao;
    }
    public String getDescricao(){
        return descricao;
    }
    public double getPreco(){
        return preco;
    }
    
    public abstract void addMenu(Menu menu);
    public abstract Menu[] getMenus();
    
    //Metodo que imprime os itens do menu simples
    public String toString(){ 
        return opcao + " - " + descricao + " - Valor: " + preco;
    }

}
