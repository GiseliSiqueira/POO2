
package pizzametodofabrica;

/**
 *
 * @author Giseli
 */
public class PizzaFactory extends Pizza{
    public static Pizza createPizza(){
        Pizza pizza;
        pizza = new CheesePizza();
        return pizza;
    }
}
