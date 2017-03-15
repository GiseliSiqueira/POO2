/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author Giseli
 */
public class FabricaPadrao extends FabricaAbstrataBotoes{
    private JButton ok;
    private JButton cancel;
    
    @Override
    public JButton criaBotaoOK() {
        ok = new JButton();
        ok.setText("OK");
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        cancel = new JButton();
        cancel.setText("Cancel");
        return cancel;
    }
    
}
