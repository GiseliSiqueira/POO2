
package builderpiscina;

/**
 *
 * @author Giseli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiretorPiscinas criaPiscina = new DiretorPiscinas();
        
        Piscina piscinaRedonda = criaPiscina.fabricaRedonda("azul", true, false);
        Piscina piscinaRetangular = criaPiscina.fabricaRetangular("azul", true, true);
        Piscina piscinaHexagonal = criaPiscina.fabricaHexagonal("azul", true, false);
    }
    
}
