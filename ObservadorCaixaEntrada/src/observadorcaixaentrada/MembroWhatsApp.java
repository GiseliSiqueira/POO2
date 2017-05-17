/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadorcaixaentrada;

/**
 *
 * @author Giseli
 */
public class MembroWhatsApp implements Observer {
    
    private int numero;
    
    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo cxEntradaGp = (CaixaEntradaGrupo)obs;
        
        System.out.println("WhatsApp: Você tem uma nova mensagem!\n" + cxEntradaGp.getMensagem());
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
