
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //constroi uma refeicao.
        
        /*
        Modificado para receber batata como opção para o usuário
        modificado por: Giseli Siqueira em 14/03/2017
        */
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", true);                
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", false);       
    }
    
}
