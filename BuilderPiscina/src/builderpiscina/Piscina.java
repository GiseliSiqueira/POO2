
package builderpiscina;

/**
 *
 * @author Giseli
 */
public class Piscina {
    private Formato corpo;
    private String cor;
    private boolean tratAntiVazamento;
    private boolean escada;
 
    public Formato getCorpo() {
        return corpo;
    }

    public void setCorpo(Formato corpo) {
        this.corpo = corpo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTratAntiVazamento() {
        return tratAntiVazamento;
    }

    public void setTratAntiVazamento(boolean tratAntiVazamento) {
        this.tratAntiVazamento = tratAntiVazamento;
    }

    public boolean getEscada() {
        return escada;
    }

    public void setEscada(boolean escada) {
        this.escada = escada;
    }
    
}
