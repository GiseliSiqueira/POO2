
package comandocanaltelevisao;

/**
 *
 * @author Giseli
 */
public class DiminuiCanalCommand implements Command{

    private Televisao televisao;

    public DiminuiCanalCommand(Televisao televisao) {
        this.televisao = televisao;
    }
    
    @Override
    public void execute() {
        this.televisao.diminuirCanal();
    }
    
}
