#  Exercício - Padrão Bridge - Persistência de Arquivos

Implementação do modelo do diagrama abaixo utilizando o padrão Bridge.

![alt tag](https://github.com/GiseliSiqueira/POO2/blob/master/BridgePersistenciaArq/padrao_bridge.png)

Utilização da classe main abaixo:

public class Main {

public static void main(String[] args) {

PersistenceDeDados implementor = null;

if(databaseDriverExists()){

implementor = new Dabatase();

}

else{

implementor = new FileSystem();

}

Persistencia persistenceAPI = new ImplementacaoPersistencia(implementor);

persistenceAPI.save(o);

}



private static boolean databaseDriverExists() {

return false;

}

}

