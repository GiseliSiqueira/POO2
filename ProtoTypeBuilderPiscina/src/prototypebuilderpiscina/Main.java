
package prototypebuilderpiscina;

import java.util.HashMap;

/**
 *
 * @author Giseli
 */
public class Main {
    
    static HashMap<String, Piscina>  piscinas = new HashMap<>();
    
    public static void main(String[] args) {
        DiretorPiscinas criaPiscina = new DiretorPiscinas();
        
        Piscina piscinaRedonda = criaPiscina.fabricaRedonda("azul", true, false);
        piscinas.put("azul/true/false",piscinaRedonda);
        Piscina piscinaRetangular = criaPiscina.fabricaRetangular("azul", true, true);
        piscinas.put("azul/true/true", piscinaRetangular);
        Piscina piscinaHexagonal = criaPiscina.fabricaHexagonal("azul", true, false);
        piscinas.put("azul/true/false", piscinaHexagonal);
        
        Piscina redondaClone1 = (Piscina) piscinas.get("azul/true/false").clone();
        Piscina retangularClone1 = (Piscina) piscinas.get("azul/true/true").clone();
        
        System.out.println("Dados da Piscina redonda: \n"
                + "cor: " + piscinaRedonda.getCor()
                + "\nTratamento anti vazamento: " + piscinaRedonda.getTratAntiVazamento()
                + "\nEscada: " + piscinaRedonda.getEscada());
        
        System.out.println("\nAdicionando escada na piscina redonda...\n");
        piscinaRedonda.setEscada(true);
        
        System.out.println("Dados da Piscina redonda: \n"
                + "cor: " + piscinaRedonda.getCor()
                + "\nTratamento anti vazamento: " + piscinaRedonda.getTratAntiVazamento()
                + "\nEscada: " + piscinaRedonda.getEscada());
        
        System.out.println("\nDados do clone da Piscina redonda: \n"
                + "cor: " + redondaClone1.getCor()
                + "\nTratamento anti vazamento: " + redondaClone1.getTratAntiVazamento()
                + "\nEscada: " + redondaClone1.getEscada());
    }
    
}
