/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.dominio.adicionais;

import cafeteria.dominio.Adicionais;
import cafeteria.dominio.Bebida;

/**
 *
 * @author Giseli
 */
public class Creme extends Adicionais {

    public Creme(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription() + ", Creme";
    }

    public double cost() {
        return 1 + bebida.cost();
    }
    
}
