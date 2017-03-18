/*
Exercicios que mostra como ler um arquivo e salvar os dados de um arquivo em outro arquivo.
 */
package leitura;

import java.io.*;
import java.util.LinkedList;


public class MainReadCsv {
    
    public static void main(String[] args) throws IOException {                
       LeCsv leitorCsv = new LeCsv();               
       LinkedList<Cliente> clientes = leitorCsv.leCsvClientes();
       TotalCompras compras = new TotalCompras(); 
       System.out.printf("O valor total de compras de todos os clientes é de %.2f\n",
              compras.calculaSomaTotal(clientes));
    }         
}