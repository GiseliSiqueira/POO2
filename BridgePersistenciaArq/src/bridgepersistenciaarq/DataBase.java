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
//IMPLEMENTADOR CONCRETO: implementa a interface Implementador.
public class DataBase implements PersistenciaDeDados {
    
    public void salva(Object objeto){
        //conexão com banco de dados
        //criar registros
        System.out.println("Objeto salvo no banco de dados!");
    }
}
