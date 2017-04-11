
package fachadatelevisao;

/**
 *
 * @author Giseli
 */
public class TelevisaoFachada {
    private Sintonizador sintonizador;
    private Video video;
    private Som som;
    
    public void ligarTelevisao(){
        video = new Video();
        som = new Som();
        video.ligar();
        video.exibirImagem();
        som.ligar();
        som.emitirSom();
    }
    public void desligarTelevisao(){
        
        som.desligar();
        video.desligar();
    }
    public void aumentarVolume(){
        som.aumentar();
    }
    public void diminuirVolume(){
        som.diminuir();
    }
    public void sintonizarCanal(){
        sintonizador = new Sintonizador();
        sintonizador.sintonizarCanal();
    }
}
