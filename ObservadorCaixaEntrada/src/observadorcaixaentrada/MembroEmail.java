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
public class MembroEmail implements Observer {
    
    private String email;
    
    
    @Override
    public void update(Observable obs) {
        CaixaEntradaGrupo cxEntradaGp = (CaixaEntradaGrupo)obs;
        System.out.println("Email: Você tem uma nova mensagem!\n" + cxEntradaGp.getMensagem());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
