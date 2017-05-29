
package nossadistribuidora.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nossadistribuidora.controller.ClienteController;
import nossadistribuidora.controller.EnderecoController;
import nossadistribuidora.model.Cliente;
import nossadistribuidora.model.Endereco;

/**
 *
 * @author Giseli
 */

/*Classe que exibe a tela para receber as informações relativas ao cliente como
*nome, telefone e endereço.
*/
public class ClienteView extends javax.swing.JFrame {

    private ClienteController clienteController;
    private EnderecoController enderecoController;
  
    /*
    *Construtor que cria as instancias dos controllers necessários para as operações
    */
    public ClienteView() {
        clienteController = new ClienteController();
        enderecoController = new EnderecoController();
        initComponents();
    }
    
    /*
    *Get's dos controladores.
    */
    public ClienteController getClienteController() {
        return clienteController;
    }
    
    public EnderecoController getEnderecoController() {
        return enderecoController;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtivaDesativa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jtEnderecoCep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtEnderecoRua = new javax.swing.JTextField();
        jtEnderecoNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEnderecoBairro = new javax.swing.JTextField();
        jtEnderecoCidade = new javax.swing.JTextField();
        jcEnderecoEstado = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtAtivacao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtPagamento = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Cliente");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAtivaDesativa.setText("Ativar/Desativar");
        jbAtivaDesativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtivaDesativaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAtivaDesativa)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir)
                    .addComponent(jbAtivaDesativa))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel4.setText("CEP:");

        jLabel5.setText("Rua:");

        jLabel6.setText("Numero:");

        jtEnderecoRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEnderecoRuaActionPerformed(evt);
            }
        });

        jLabel7.setText("Bairro:");

        jLabel8.setText("Cidade:");

        jLabel9.setText("Estado:");

        jcEnderecoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtEnderecoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jtEnderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtEnderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcEnderecoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtEnderecoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtEnderecoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtEnderecoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtEnderecoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtEnderecoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jcEnderecoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo:");

        jtCodigo.setEditable(false);
        jtCodigo.setEnabled(false);

        jLabel10.setText("Ativação");

        jtAtivacao.setEditable(false);
        jtAtivacao.setEnabled(false);

        jLabel11.setText("Pagamento");

        jtPagamento.setEditable(false);
        jtPagamento.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtAtivacao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtAtivacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /*
    *Metodo que cancela a operação, encerrando a janela.
    */
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtEnderecoRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEnderecoRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEnderecoRuaActionPerformed
    
    /*
    *Metodo para salvar ou atualizar as informações de cliente no banco de dados
    */
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        /*
        *Verifica se o cliente já existe pela busca do código
        *Caso exista: atualiza os dados do cliente;
        *caso nao exista: salva os dados do cliente;
        */
        if(jtCodigo.getText().equalsIgnoreCase("")){
            //Dados de endereço são recebidos primeiro para serem inseridos na tabela cliente
            Endereco endereco = new Endereco();
            endereco.setCep(jtEnderecoCep.getText());
            endereco.setRua(jtEnderecoRua.getText());
            endereco.setNumero(Integer.valueOf(jtEnderecoNumero.getText()));
            endereco.setBairro(jtEnderecoBairro.getText());
            endereco.setCidade(jtEnderecoCidade.getText());
            endereco.setEstado(jcEnderecoEstado.getSelectedItem().toString());

            /*
            *Cria instância de cliente e obtém as informações
            *referentes ao cliente.
            */
            Cliente cliente = new Cliente();

            cliente.setNome(jtNome.getText());
            cliente.setTelefone(jtTelefone.getText());
            cliente.setEndereco(endereco);
            cliente.setStatusAtivacao(true);
            cliente.setStatusPagamento(true);

            /*
            *Envio das informações do endereço e do cliente para o respectivo controlador
            *para que sejam realizadas as operações de inserção no banco de dados.
            */
            try {
                getEnderecoController().inserir(endereco);
                getClienteController().inserir(cliente);
                JOptionPane.showMessageDialog(this, "Cliente inserido com sucesso!", 
                "Inserir cliente",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        }else{
            //RECEBER AS NOVAS INFORMAÇÕES PARA ATUALIZAR
            //Busca o cliente pelo Id para atualização.
            Cliente cliente = getClienteController().buscaClientePorId(Integer.parseInt(jtCodigo.getText()));
            Endereco endereco = cliente.getEndereco();
            
            //Substituição das informações atualizadas na classe Endereço
            endereco.setCep(jtEnderecoCep.getText());
            endereco.setRua(jtEnderecoRua.getText());
            endereco.setNumero(Integer.valueOf(jtEnderecoNumero.getText()));
            endereco.setBairro(jtEnderecoBairro.getText());
            endereco.setCidade(jtEnderecoCidade.getText());
            endereco.setEstado(jcEnderecoEstado.getSelectedItem().toString());
            //Substituição das informações atualizadas na classe Cliente
            cliente.setNome(jtNome.getText());
            cliente.setTelefone(jtTelefone.getText());
            cliente.setEndereco(endereco);
            
            /*
            *Envio das informações do endereço e do cliente para o respectivo controlador
            *para que sejam realizadas as operações de atualização no banco de dados.
            */
            try {
                getEnderecoController().alterar(endereco);
                getClienteController().alterar(cliente);
                JOptionPane.showMessageDialog(this, "Informações de cliente alteradas com "
                + "sucesso!", "Atualizar cliente",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jbSalvarActionPerformed
    
    /*
    *Metodo para buscar as informações de cliente no banco de dados
    */
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        /*Codigo para buscar os dados no banco e mostrar no Frame
        *Busca o Cliente por nome
        */
        Cliente cliente = null;
        
        //Testa se os campos nome ou telefone não estão vazios e busca no banco com operação específica
        if(!(jtNome.getText().equals(""))){
            cliente = getClienteController().buscaClientePorNome(jtNome.getText()); //recebe null caso o cliente não exista
        }else if(!(jtTelefone.getText().equals(""))){
            cliente = getClienteController().buscaClientePorTelefone(jtTelefone.getText());
        } 
        
        /*
        *Exibe as informações do cliente nos jTextField da janela.
        */
        if(cliente != null){
            jtCodigo.setText(Integer.toString(cliente.getCodigo()));
            jtNome.setText(cliente.getNome());
            jtTelefone.setText(cliente.getTelefone());
            jtEnderecoRua.setText(cliente.getEndereco().getRua());
            jtEnderecoNumero.setText(Integer.toString(cliente.getEndereco().getNumero()));
            jtEnderecoBairro.setText(cliente.getEndereco().getBairro());
            jtEnderecoCidade.setText(cliente.getEndereco().getCidade());
            jcEnderecoEstado.setSelectedItem(cliente.getEndereco().getEstado());
            jtEnderecoCep.setText(cliente.getEndereco().getCep());
            if(cliente.getStatusAtivacao() == true){
                jtAtivacao.setText("Ativo");
            }else{
                jtAtivacao.setText("Desativado");
            }
            if(cliente.getStatusPagamento() == true){
                jtPagamento.setText("Ok");
            }else{jtCodigo.setVisible(true);
                jtPagamento.setText("Pendente");
            }
            //configura os campos como ativos (porém nao são editáveis)
            jtCodigo.setEnabled(true);
            jtAtivacao.setEnabled(true);
            jtPagamento.setEnabled(true);
        }
            /*
            *Caso os dados para busca(nome ou telefone) não tenham sido informados
            */
            else if(jtNome.getText().equals("") && jtTelefone.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Informar dados para busca", 
                    "Buscar cliente",JOptionPane.INFORMATION_MESSAGE);
            }
                /*
                *Caso o cliente cujos dados informados não exista, solicita o cadastro
                */
                else if(JOptionPane.showConfirmDialog(this, "Cliente não cadastrado, deseja cadastrar?",
                    "realizar novo cadastro?",JOptionPane.YES_NO_OPTION)==JOptionPane.NO_OPTION){
                    dispose();
                }
        
    }//GEN-LAST:event_jbBuscarActionPerformed
    
    /*
    *Metodo para excluir as informações de cliente no banco de dados
    */
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        /*
        *Recebe o Id do cliente que foi pesquisado e chama o metodo de
        *exclusão do registro do banco da entidade referente.
        */
        Cliente cliente = getClienteController().buscaClientePorId(Integer.parseInt(jtCodigo.getText()));
    
        if(cliente.getStatusPagamento()){
    
            if(JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Confirma a exclusão?", JOptionPane.YES_NO_OPTION) ==
                    JOptionPane.YES_OPTION){
                
                try {
                    getClienteController().deletar(cliente);
                    JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso!", 
                    "Excluir cliente", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Cliente selecionado possui pendência de"
                    + "pagamento, não podendo ser excluído!", 
                    "Excluir cliente", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAtivaDesativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtivaDesativaActionPerformed
        /*
        *Metodo que altera o status de ativação do cliente pelo seu Id após a busca
        *de suas informaçoes no banco.
        *Caso o cliente esteja ativo e caso não possua pendências de pagamento, 
        *será desativado;
        *Caso o cliente esteja desativado, será ativado;
        */
        String mensagem = "";
        Cliente cliente =  getClienteController().buscaClientePorId(Integer.parseInt(jtCodigo.getText()));
            
            if(cliente.getStatusAtivacao()){
                if(cliente.getStatusPagamento()){
                    cliente.setStatusAtivacao(false);
                    mensagem = "Cliente desativado com sucesso!";
                }else{
                    JOptionPane.showMessageDialog(this, "O cliente informado possui pendência de"
                    + "pagamento não podendo ser desativado!", 
                    "Ativar/Desativar cliente", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }else{
                cliente.setStatusAtivacao(true);
                mensagem = "Cliente ativado com sucesso!";
            }
            if(!(mensagem.equals(""))){
                try {
                    getClienteController().alterar(cliente);
                    JOptionPane.showMessageDialog(this, mensagem, 
                        "Ativar/Desativar cliente", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (Exception ex) {
                    Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
               
    }//GEN-LAST:event_jbAtivaDesativaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtivaDesativa;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcEnderecoEstado;
    private javax.swing.JTextField jtAtivacao;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtEnderecoBairro;
    private javax.swing.JTextField jtEnderecoCep;
    private javax.swing.JTextField jtEnderecoCidade;
    private javax.swing.JTextField jtEnderecoNumero;
    private javax.swing.JTextField jtEnderecoRua;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPagamento;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables

}
