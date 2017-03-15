/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidametodofabrica;

/**
 *
 * @author Giseli
 */
public class FabricaBebida {
    public static Bebida prepararBebida(int tipo){
        Bebida bebida = null;
        switch (tipo) {
            case 1:
                bebida = new Cafe();
                break;
            case 2:
                bebida = new Cha();
                break;
            case 3:
                bebida = new Refrigerante();
                break;
            case 4:
                bebida = new Suco();
                break;
            default:
                break;
        }
        return bebida;
    }
}
