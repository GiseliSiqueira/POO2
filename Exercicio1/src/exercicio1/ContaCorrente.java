/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

class ContaCorrente extends Conta implements Tributavel{
    private double saldo;
    
    public double calculaTributos(double saldo){
        double novoValor = this.saldo + ((this.saldo * 10)/100); 
        return novoValor;
     }
}
