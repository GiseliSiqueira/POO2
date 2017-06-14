/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciostrategy;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

/**
 *
 * @author Giseli
 */
public class Original implements Filtro{
    
    private BufferedImage bi, biFiltered;
    
    public Original(BufferedImage bi, BufferedImage biFiltered) {
        this.biFiltered = biFiltered;
        this.bi = bi;
    }
    
    @Override
    public BufferedImageOp aplicaFiltro() {
        biFiltered = bi;
        return null;
    }
    
}
