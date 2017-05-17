/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadorposterous;

import java.util.ArrayList;

/**
 *
 * @author Giseli
 */
public class Observable {
    
    private ArrayList<Observer> monitores = new ArrayList();
    
    public void addObserver(Observer ob){
        this.monitores.add(ob);
    }
    public void deleteObserver(Observer ob){
        monitores.remove(ob);
    }
    public void notifyObserver(){ //Atualiza o observador
        for(Observer ob : monitores){
            ob.update(this);
        }
    }
}
