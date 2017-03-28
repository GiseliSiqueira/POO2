
package prototypebuilderpiscina;

/**
 *
 * @author Giseli
 */
public class Piscina implements Cloneable {
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
    
    public Object clone(){
        Piscina obj = null;
        try {
          obj = (Piscina)super.clone();
          obj.setCorpo(corpo);
          obj.setCor(cor);
          obj.setTratAntiVazamento(tratAntiVazamento);
          obj.setEscada(escada);
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }        
        return obj;
    }
}
