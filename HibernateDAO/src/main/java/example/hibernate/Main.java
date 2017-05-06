package example.hibernate;


import example.hibernate.model.Usuario;
import example.hibernate.model.Veiculo;
import example.hibernate.persistencia.UsuarioDAOImpl;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import java.util.List;
import example.hibernate.persistencia.UsuarioDAO;


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
           
            UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
            
            Usuario usuario = new Usuario();
            usuario.setLogin("user");
            usuario.setSenha("1234");
            usuario.setNome("José");
            usuario.setEmail("jose@jose.br");
            
            Usuario usuario2 = new Usuario();
            usuario2.setLogin("User2");
            usuario2.setSenha("4321");
            usuario2.setNome("Maria");
            usuario2.setEmail("maria@maria.br");
            
            usuarioDAO.inserir(usuario);
            usuarioDAO.inserir(usuario2);
            //List<Cliente> listar = clienteDAO.listar(Usuario.class);
            //for(Usuario printCliente : listar){
            //    System.out.println(printCliente.toString());
            //}
            
            //System.out.println(clienteDAO.buscaUsuarioPorNomeESenha("user", "1234"));
            System.out.println(usuarioDAO.buscaUsuarioPorNome("Maria"));
	}                
}
