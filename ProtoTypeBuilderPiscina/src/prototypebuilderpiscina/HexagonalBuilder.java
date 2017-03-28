
package prototypebuilderpiscina;

/**
 *
 * @author Giseli
 */
public class HexagonalBuilder extends PiscinaBuilder{
    public HexagonalBuilder(Piscina novaPiscina) {
        this.piscina = novaPiscina;
    }
    
    public void fabricaPiscinaHexagonal(){
        System.out.println("*******************************");
        System.out.println("Fabricando piscina hexagonal...");
        this.piscina.setCorpo(new Hexagonais());
    }
}
