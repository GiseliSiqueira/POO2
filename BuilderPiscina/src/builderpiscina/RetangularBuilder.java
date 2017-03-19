
package builderpiscina;

/**
 *
 * @author Giseli
 */
public class RetangularBuilder extends PiscinaBuilder{

    public RetangularBuilder(Piscina novaPiscina) {
        this.piscina = novaPiscina;
    }
    
    public void fabricaPiscinaRetangular(){
        System.out.println("********************************");
        System.out.println("Fabricando piscina retangular...");
        this.piscina.setCorpo(new Retangulares());
    }
}
