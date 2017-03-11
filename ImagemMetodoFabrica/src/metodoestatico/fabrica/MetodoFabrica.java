
package metodoestatico.fabrica;


public class MetodoFabrica {

    public static void main(String[] args) {
        Formato formato;
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoPng");
        formato.gera(); //formato aqui já tem o nome da instância que quero criar (nome da classe),
        //nesse caso: FormatoPng, e chama o metodo gera que imprime a mensagem na tela.
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoJpeg");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoGif");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("metodoestatico.fabrica.FormatoBmp");
        formato.gera();
    }    
}

