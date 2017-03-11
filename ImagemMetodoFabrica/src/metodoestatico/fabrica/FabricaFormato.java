
package metodoestatico.fabrica;

public class FabricaFormato {
    public static Formato geraFormato(String classe){
        Formato formato; //tipo de formato é Formato que é a interface implementada
        Object classeReflection = null;
	try {
            classeReflection = Class.forName(classe).newInstance();            
	    } catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        formato = (Formato) classeReflection; //Conversao do tipo Object para o tipo Formato.
        return formato;
    }
    
    
}
