
package exercicio2;

public class ContaBancaria {
    private String numero;
    private String dataAbertura;
    private double saldo;
    
    public double debitar(double saldo, double valor){
        double novoSaldo = saldo - valor;
        return novoSaldo;
    }
    
    public double creditar(double saldo, double valor){
        double novoSaldo = saldo + valor;
        return novoSaldo;
        
    }
    
            
}
