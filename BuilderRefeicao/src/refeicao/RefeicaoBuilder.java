

package refeicao;

/**
 *
 * @author felipe
 */
public abstract class RefeicaoBuilder {    
    Refeicao refeicao;        
    
    public void adicionarSuco(String sabor){                                
        refeicao.setBebida(new Suco(sabor));        
    }   
       
    public void adicionarRefrigerante(String sabor){
        refeicao.setBebida(new Refrigerante(sabor));        
    } 
    
    /*Modificada para adicionar a opção batata para o cliente
    Modificado por: Giseli Siqueira em 14/03/2017
    */
    public void preparaBatata(){
        System.out.println("preprara batata");
        refeicao.setBatata(new Batata());
    }
    
}
