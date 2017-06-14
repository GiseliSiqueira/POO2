/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciostrategy;

import static exerciciostrategy.SaveImage.SHARPEN3x3;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

/**
 *
 * @author Giseli
 */
public class Sharpen implements Filtro{
    
    BufferedImageOp op;
    
    public Sharpen(BufferedImageOp op) {
        this.op = op;
    }

    @Override
    public BufferedImageOp aplicaFiltro() {
        float[] data =  SHARPEN3x3;
            op = new ConvolveOp(new Kernel(3, 3, data),
                                ConvolveOp.EDGE_NO_OP,
                                null);
            return op;
    }

    
    
}
