
package prototypebuilderpiscina;

/**
 *
 * @author Giseli
 */
public class DiretorPiscinas {

    public Piscina fabricaRedonda(String cor, boolean tratAntiVazamento, boolean escada) {
        Piscina novaPiscina = new Piscina ();
        
        RedondaBuilder piscinaBuilder = new RedondaBuilder(novaPiscina);
        piscinaBuilder.fabricaPiscinaRedonda();
        System.out.println("aplicando cor azul...");
        piscinaBuilder.aplicarCor(cor);
        System.out.println("aplicando tratamento anti vazamento...");
        piscinaBuilder.AplicarTratamentoAntiVazamento(tratAntiVazamento);
        if (escada == true){
            System.out.println("adicionando escada...");
            piscinaBuilder.AdicionarEscada(escada);
        }
        System.out.println("*****************************");
        return novaPiscina;
    }

    public Piscina fabricaRetangular(String cor, boolean tratAntiVazamento, boolean escada) {
        Piscina novaPiscina = new Piscina ();
        
        RetangularBuilder piscinaBuilder = new RetangularBuilder(novaPiscina);
        piscinaBuilder.fabricaPiscinaRetangular();
        System.out.println("aplicando cor "+ cor + "...");
        piscinaBuilder.aplicarCor(cor);
        System.out.println("aplicando tratamento anti vazamento...");
        piscinaBuilder.AplicarTratamentoAntiVazamento(tratAntiVazamento);
        if (escada == true){
            System.out.println("adicionando escada...");
            piscinaBuilder.AdicionarEscada(escada);
        }
        System.out.println("*******************************");
        return novaPiscina;
    }

    public Piscina fabricaHexagonal(String cor, boolean tratAntiVazamento, boolean escada) {
        Piscina novaPiscina = new Piscina();
        
        HexagonalBuilder piscinaBuilder = new HexagonalBuilder(novaPiscina);
        piscinaBuilder.fabricaPiscinaHexagonal();
        System.out.println("aplicando cor "+ cor + "...");
        piscinaBuilder.aplicarCor(cor);
        System.out.println("aplicando tratamento anti vazamento...");
        piscinaBuilder.AplicarTratamentoAntiVazamento(tratAntiVazamento);
        if (escada == true){
            System.out.println("adicionando escada...");
            piscinaBuilder.AdicionarEscada(escada);
        }
        System.out.println("*******************************");
        return novaPiscina;
    }
    
}
