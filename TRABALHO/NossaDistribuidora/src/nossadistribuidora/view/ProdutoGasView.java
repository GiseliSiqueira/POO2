
package nossadistribuidora.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nossadistribuidora.controller.ProdutoGasController;
import nossadistribuidora.model.Fornecedor;
import nossadistribuidora.model.ProdutoGas;
/**
 *
 * @author Giseli
 */

/*Classe que exibe a tela para receber as informações relativas ao produto gás como
*nome, marca, caracteristica, valor, peso, quantidade em estoque e fornecedor.
*/
public class ProdutoGasView extends javax.swing.JFrame {

    private ProdutoGasController gasController;
    
    
    /*
    *Construtor que cria a instancia do controller necessário para as operações
    */
    public ProdutoGasView() {
        gasController = new ProdutoGasController();
        initComponents();
    }

    /*
    *Get do controlador.
    */
    public ProdutoGasController getGasController() {
        return gasController;
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
        jPainel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtCaracteristicas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtQuantEstoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcListaFornecedores = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Produto");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPainel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setText("Nome:");

        jLabel2.setText("Marca:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Característica: ");

        jLabel12.setText("Valor:");

        jLabel4.setText("Quantidade em Estoque:");

        jtQuantEstoque.setEditable(false);

        jLabel6.setText("Peso:");

        jLabel5.setText("Fornecedor:");

        jcListaFornecedores.setModel(new Util.FornecedorComboBox());
        jcListaFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListaFornecedoresActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        jtId.setEditable(false);
        jtId.setEnabled(false);

        javax.swing.GroupLayout jPainel2Layout = new javax.swing.GroupLayout(jPainel2);
        jPainel2.setLayout(jPainel2Layout);
        jPainel2Layout.setHorizontalGroup(
            jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(55, 55, 55)))
                    .addGroup(jPainel2Layout.createSequentialGroup()
                        .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(51, 51, 51)))
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCaracteristicas)
                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPainel2Layout.createSequentialGroup()
                        .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPainel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcListaFornecedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPainel2Layout.createSequentialGroup()
                        .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jbBuscar)))
                .addContainerGap())
        );
        jPainel2Layout.setVerticalGroup(
            jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcListaFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPainel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    /*
    *Metodo para salvar ou atualizar as informações de produto gás no banco de dados
    */
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        /*
        *Verifica se o gás já existe pela busca do nome
        *Caso exista: atualiza os dados do produto;
        *caso nao exista: salva os dados do produto;
        */
        if(jtId.getText().equals("")){
            
            /*
            *Cria instância de produto gás e obtém as informações
            *referentes ao mesmo, obtendo as entradas de dados.
            */
        
            ProdutoGas gas = new ProdutoGas();
            gas.setNome(jtNome.getText());
            gas.setMarca(jtMarca.getText());
            gas.setCaracteristica(jtCaracteristicas.getText());
            gas.setValor(Float.parseFloat(jtValor.getText()));
            gas.setQuantidadeEstoque(0);
            gas.setPeso(Float.parseFloat(jtPeso.getText()));
            if(gas.getQuantidadeEstoque()>0){
                gas.setDisponibilidadeEstoque(true);
            }else{
                gas.setDisponibilidadeEstoque(false);
            }
            //Cria instância do Fornecedor selecionado no ComboBox e o seta no produto
            Fornecedor fornecedorSelecionado = (Fornecedor) jcListaFornecedores.getSelectedItem();
            gas.setFornecedor(fornecedorSelecionado);
            
            /*
            *Envio das informações do produto para o respectivo controlador
            *para que sejam realizadas as operações de inserção no banco de dados.
            */
            try {
                getGasController().inserir(gas);
                JOptionPane.showMessageDialog(this, "Produto inserido com sucesso!", 
                "Inserir Produto",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception ex) {
                Logger.getLogger(ProdutoGasView.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else{
            //RECEBER AS NOVAS INFORMAÇÕES PARA ATUALIZAR
            //Busca o produto pelo Id para atualização.
            ProdutoGas gas = getGasController().buscaGasPorId(Integer.parseInt(jtId.getText()));
            //Substituição das informações atualizadas na classe ProdutoGas
            gas.setNome(jtNome.getText());
            gas.setMarca(jtMarca.getText());
            gas.setCaracteristica(jtCaracteristicas.getText());
            gas.setPeso(Float.parseFloat(jtPeso.getText()));
            gas.setValor(Float.parseFloat(jtValor.getText()));
            gas.setQuantidadeEstoque(Integer.parseInt(jtQuantEstoque.getText()));
            if(gas.getQuantidadeEstoque()>0){
                gas.setDisponibilidadeEstoque(true);
            }else{
                gas.setDisponibilidadeEstoque(false);
            }
            //Cria instância do Fornecedor selecionado no ComboBox e o seta no produto
            Fornecedor fornecedorSelecionado = (Fornecedor) jcListaFornecedores.getSelectedItem();
            gas.setFornecedor(fornecedorSelecionado);
            
            /*
            *Envio das informações do produto para o respectivo controlador
            *para que sejam realizadas as operações de atualização no banco de dados.
            */
            try {    
                getGasController().alterar(gas);
                JOptionPane.showMessageDialog(this, "Informações de produto alteradas com "
                + "sucesso!", "Atualizar produto",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception ex) {
                Logger.getLogger(ProdutoGasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_jbSalvarActionPerformed

    /*
    *Metodo para excluir as informações de produto no banco de dados
    */
    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        /*
        *Recebe o Id do produto que foi pesquisado e chama o metodo de
        *exclusão do registro do banco da entidade referente.
        */
        ProdutoGas gas = getGasController().buscaGasPorId(Integer.parseInt(jtId.getText()));
        //exibe mensagem de confirmação de exclusão
        if(JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Confirma a exclusão?", JOptionPane.YES_NO_OPTION) ==
                    JOptionPane.YES_OPTION){
            try {
                getGasController().deletar(gas);
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", 
                    "Excluir Produto", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
            } catch (Exception ex) {
                Logger.getLogger(ProdutoGasView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    /*
    *Metodo para buscar as informações de produto no banco de dados
    */
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        /*Codigo para buscar os dados no banco e mostrar no Frame
        *Busca o produto por nome
        */
        if(!(jtNome.getText().equals(""))){
            ProdutoGas gas = getGasController().buscaGasPorNome(jtNome.getText());
            if(gas != null){
                jtId.setText(Long.toString(gas.getID()));
                jtNome.setText(gas.getNome());
                jtMarca.setText(gas.getMarca());
                jtCaracteristicas.setText(gas.getCaracteristica());
                jtPeso.setText(Float.toString(gas.getPeso()));
                jtValor.setText(Float.toString(gas.getValor()));
                jtQuantEstoque.setText(Integer.toString(gas.getQuantidadeEstoque()));
                jcListaFornecedores.setSelectedItem(gas.getFornecedor());
                //Configura o campo Id como ativo
                jtId.setEnabled(true);
            }else if(JOptionPane.showConfirmDialog(this, "Produto não cadastrado, deseja cadastrar?",
                    "realizar novo cadastro?",JOptionPane.YES_NO_OPTION)==JOptionPane.NO_OPTION){
                    dispose();
            }
        }else{
                JOptionPane.showMessageDialog(this, "Informar dados para busca", 
                "Buscar cliente",JOptionPane.INFORMATION_MESSAGE);
            }    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcListaFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListaFornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcListaFornecedoresActionPerformed

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
            java.util.logging.Logger.getLogger(ProdutoGasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoGasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoGasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoGasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoGasView().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPainel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<Fornecedor> jcListaFornecedores;
    private javax.swing.JTextField jtCaracteristicas;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPeso;
    private javax.swing.JTextField jtQuantEstoque;
    private javax.swing.JTextField jtValor;
    // End of variables declaration//GEN-END:variables
}
