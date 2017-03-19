
package builderpiscina;

/**
 *
 * @author Giseli
 */
public class RedondaBuilder extends PiscinaBuilder{

    public RedondaBuilder(Piscina novaPiscina){
        this.piscina = novaPiscina;
    }
    public void fabricaPiscinaRedonda(){
        System.out.println("*****************************");
        System.out.println("Fabricando piscina redonda...");
        this.piscina.setCorpo(new Redonda());
        
    }
    
}
