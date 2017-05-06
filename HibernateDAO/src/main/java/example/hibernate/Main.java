package example.hibernate;


import example.hibernate.model.Cliente;
import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.ClienteDAO;
import example.hibernate.persistencia.ClienteDAOImpl;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import java.util.List;


public class Main {    		
	public static void main(String[] args) throws Exception {                                    
                        
            
           /*VeiculoDAO veiculoDAO = new VeiculoDAOImpl();            
           Veiculo veiculo = new Veiculo();
           veiculo.setAno("2010");
           veiculo.setMarca("Fiat");
           veiculo.setModelo("Uno");
           veiculo.setQuilometragem("1000");
           veiculo.setTipo("carro");              
           veiculoDAO.inserir(veiculo);           
           List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           
           veiculoDAO.deletar(veiculo);           
           listar = veiculoDAO.listar(Veiculo.class);
           for(Veiculo printVeiculo : listar){
               System.out.println(printVeiculo.toString());
           }
           */
           
            ClienteDAO clienteDAO = new ClienteDAOImpl();
            
            Cliente cliente = new Cliente();
            cliente.setLogin("user");
            cliente.setSenha("1234");
            cliente.setNome("José");
            cliente.setEmail("jose@jose.br");
            
            Cliente cliente2 = new Cliente();
            cliente2.setLogin("User2");
            cliente2.setSenha("4321");
            cliente2.setNome("Maria");
            cliente2.setEmail("maria@maria.br");
            
            clienteDAO.inserir(cliente);
            clienteDAO.inserir(cliente2);
            //List<Cliente> listar = clienteDAO.listar(Cliente.class);
            //for(Cliente printCliente : listar){
            //    System.out.println(printCliente.toString());
            //}
            
            //System.out.println(clienteDAO.buscaUsuarioPorNomeESenha("user", "1234"));
            System.out.println(clienteDAO.buscaUsuarioPorNome("Maria"));
	}                
}
