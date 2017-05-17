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
public class ObservadorCaixaEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criação dos Observadores
        MembroEmail membroEmail = new MembroEmail();
        MembroWhatsApp membroWhats = new MembroWhatsApp();
        
        //Cria a caixa de entrada e adiciona os observadores
        CaixaEntradaGrupo cxEntradaGp = new CaixaEntradaGrupo();
        cxEntradaGp.addObserver(membroEmail);
        cxEntradaGp.addObserver(membroWhats);
        
        //Recebe uma nova mensagem
        cxEntradaGp.setNovaMensagem("Essa é a mensagem!");
    }
    
}
