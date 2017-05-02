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
//ABSTRAÇÃO REFINADA: estende a interface definida pela abstracção
public class ImplementacaoPersistencia extends Persistencia{

    private Object objeto;
   public ImplementacaoPersistencia(PersistenciaDeDados persistDados) {
        super(persistDados);
        this.objeto = objeto;
    }

    @Override
    public void salva() {
        persistDados.salva(objeto);
    }
    
}
