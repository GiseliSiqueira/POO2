
package mementoexamplo;


public class ConfigSOMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
  public static void main(String[] args) throws CloneNotSupportedException {

       
       ConfiguracaoSO configuracao = new ConfiguracaoSO();
       configuracao.setUsb(false);
       configuracao.setVersaoSO(1.0);
       configuracao.setWifi(false);
       System.out.printf("USB: %b\nVersão: %.1f\nWifi: %b\n", configuracao.isUsb(), configuracao.getVersaoSO(), configuracao.isWifi());
       
       MementoArmazenaConfiguracao lembranca = new MementoArmazenaConfiguracao(configuracao);
       
       //utilize o padrão memento para restaurar as configurações do sistema
       //após realizada uma modificação

       System.out.println("\nATUALIZANDO O SISTEMA...\n");
       configuracao.setVersaoSO(2.0);
       configuracao.setUsb(true);
       System.out.printf("USB: %b\nVersão: %.1f\nWifi: %b\n", configuracao.isUsb(), configuracao.getVersaoSO(), configuracao.isWifi());
       
       System.out.println("\nRESTAURANDO SISTEMA...\n");
       lembranca.restoreState();       
       System.out.printf("USB: %b\nVersão: %.1f\nWifi: %b", configuracao.isUsb(), configuracao.getVersaoSO(), configuracao.isWifi());
       
     
   }
    
}
