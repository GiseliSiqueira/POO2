/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciostrategy;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

/**
 *
 * @author Giseli
 */
public class Lookup implements Filtro {
    
    BufferedImageOp op;
    
    public Lookup(BufferedImageOp op) {
        this.op = op;
    }

    @Override
    public BufferedImageOp aplicaFiltro() {
        byte lut[] = new byte[256];
            for (int j=0; j<256; j++) {
                lut[j] = (byte)(256-j); 
            }
            ByteLookupTable blut = new ByteLookupTable(0, lut); 
            op = new LookupOp(blut, null);
            return op;
    }
    
    
    
}
