/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadrespcaixaautomatico;

/**
 *
 * @author Giseli
 */
public interface SaqueHandler {
    public void nextHandler(SaqueHandler handler);
    public void processaHandler(int valor);
}
