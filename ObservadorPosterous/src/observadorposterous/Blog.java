/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadorposterous;

/**
 *
 * @author Giseli
 */
public class Blog implements Observer{
    
    private String email;
    public Blog(String logintwitter) {
            email = logintwitter;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    @Override
    public void update(Observable obs) {
        System.out.println("Mensagem enviada para a conta " + getEmail() + " no Blog");
    }
    
}
