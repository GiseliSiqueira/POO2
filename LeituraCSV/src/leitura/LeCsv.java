
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        /*
        Codigo alterado para ler arquivo csv e criar as instancias de cliente.
        Modificado por: Giseli Siqueira em 18/03/2017
        */
        BufferedReader arquivo = new BufferedReader(in);
        
        String linha = arquivo.readLine(); //Lê a primeira linha do arquivo que são os titulos das colunas
        for(linha = arquivo.readLine(); linha != null; linha = arquivo.readLine()){
            String[] dados = linha.split(";"); //separa os dados de cada cadastro no arquivo
            
            Cliente cliente = new Cliente();
            
            cliente.setId(dados[0]);
            cliente.setNome(dados[1]);
            cliente.setEmail(dados[2]);
            cliente.setDataNascimento(dados[3]);
            cliente.setTelefone(dados[4]);
            cliente.setTotalCompras(Double.valueOf(dados[5]));
            
            clientes.add(cliente);//Adiciona o cliente na lista de clientes
        }
        in.close();
  
        return clientes;
     }
}
