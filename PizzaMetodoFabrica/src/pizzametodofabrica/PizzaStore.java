
package pizzametodofabrica;

/**
 *
 * @author Giseli Siqueira - BSI 2017/1
 */
public class PizzaStore {

    public static void main(String[] args) {
        Pizza pizza;
        pizza = PizzaFactory.createPizza();
        pizza.prepare();
        pizza.box();
        pizza.cut();
        pizza.brake();
    }
    
}
