/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepersistenciaarq;

/**
 *
 * @author Giseli
 */
//ABSTRAÇÃO: define a interface abstrata; mantém a referência Implementador.
public abstract class Persistencia {
    private Object objeto;
    protected PersistenciaDeDados persistDados;

    public Persistencia(PersistenciaDeDados persistDados) {
        this.persistDados = persistDados;
    }
    
    public abstract void salva();
        
}
