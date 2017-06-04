
package comandocanaltelevisao;

/**
 *
 * @author Giseli
 */
public class AumentaCanalCommand implements Command{

    private Televisao televisao;

    public AumentaCanalCommand(Televisao televisao) {
        this.televisao = televisao;
    }
    
    @Override
    public void execute() {
        this.televisao.aumentarCanal();
    }
    
}
