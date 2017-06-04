
package comandocanaltelevisao;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class ControleCanal {
    
    private ArrayList listaCanais = new ArrayList();
    private Command aumentaCommand, diminuiCommand;
    
    public ArrayList getListaComandos(){
        return this.getListaComandos();
    }
    
    public void setComandos(Command aumentaCommand, Command diminuiCommand){
        this.aumentaCommand = aumentaCommand;
        this.diminuiCommand = diminuiCommand;
    }
    
    public void aumentarCanal(){
        this.listaCanais.add(aumentaCommand);
        this.aumentaCommand.execute();
    }
    
    public void diminuirCanal(){
        this.listaCanais.add(diminuiCommand);
        this.diminuiCommand.execute();
    }
}
