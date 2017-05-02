/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepersistenciaarq;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giseli
 */
//IMPLEMENTADOR CONCRETO: implementa a interface Implementador.
public class FileSystem implements PersistenciaDeDados  {

    @Override
    public void salva(Object objeto){
        String current = null;
        try {
            current = new java.io.File( "." ).getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Endereço para criar um novo arquivo .txt no sistema de arquivos
        File file = new File(current + "\\src\\Persistencia.txt");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        //serializar objeto e escrever no arquivo.
        System.out.println("Objeto salvo no Sistema de arquivos!");
    }
}
