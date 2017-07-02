
package nossadistribuidora.view;

import Util.ConverteDatas;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nossadistribuidora.controller.ClienteController;
import nossadistribuidora.controller.VendaController;
import nossadistribuidora.model.Cliente;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */

/*
*Classe que gerencia a verificação de Vencimentos de Prazos para Pagamento das vendas realizadas.
*/
public class PagamentosView extends javax.swing.JFrame {

    private ClienteController clienteController;
    private VendaController vendaController;
    
    /*
    *Construtor que cria as instancias dos controllers necessários para as operações
    */
    public PagamentosView() {
        clienteController = new ClienteController();
        vendaController = new VendaController();
        initComponents();
    }
    
    /*
    *Get's dos controladores.
    */
    public ClienteController getClienteController() {
        return clienteController;
    }
    
    public VendaController getVendaController(){
        return vendaController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPagPendentes = new javax.swing.JTable();
        jbBuscarPagPendentes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbRegistrarPagamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbPagPendentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código venda", "Nome Cliente", "Telefone", "Valor a receber", "Data Recebimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbPagPendentes);

        jbBuscarPagPendentes.setText("Buscar");
        jbBuscarPagPendentes.setAlignmentY(0.0F);
        jbBuscarPagPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPagPendentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jbBuscarPagPendentes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbBuscarPagPendentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbRegistrarPagamento.setText("Registrar Pagamento");
        jbRegistrarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jbRegistrarPagamento)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbRegistrarPagamento))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbRegistrarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarPagamentoActionPerformed
        int selecionada = jtbPagPendentes.getSelectedRow(); //recebe a linha que foi selecionada na tabela
        int codigoVenda = (int) jtbPagPendentes.getValueAt(selecionada, 0);//Recebe o codigo da venda que está na linha selecionada
        
        Venda venda = getVendaController().buscaVendaPorCodigo(codigoVenda);
        Cliente cliente = venda.getCliente();
        
        //Altera o status de pagamento do cliente e o status de recebimento da venda
        venda.setStatusPagamento(true);
        cliente.setStatusPagamento(true);
        
        try {
            //Atualiza a venda e o cliente no banco de dados com os novos status de pagamento
            getVendaController().alterar(venda);
            getClienteController().alterar(cliente);
            JOptionPane.showMessageDialog(this, "Pagamento registrado com sucesso!", 
                "Registrar Pagamentos",JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(PagamentosView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbRegistrarPagamentoActionPerformed

    /*
    *Metodo para buscar as informações de vendas com pagamentos pendentes no banco de dados
    */
    private void jbBuscarPagPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPagPendentesActionPerformed
        int cont = 0; //Contador que controla a inclusao de vendas na tabela
        
        List<Venda> lstVendas = new ArrayList<>();
        try {
            //Lista todas as vendas do banco de dados
            lstVendas = getVendaController().listar(Venda.class);
        } catch (Exception ex) {
            Logger.getLogger(PagamentosView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Venda venda : lstVendas){
            if(venda.getStatusPagamento() == false){
                /*
                *Seta os dados das vendas com pagamento pendente na tabela para ser exibida
                */ 
                jtbPagPendentes.setValueAt(venda.getCodigo(), cont , 0);
                jtbPagPendentes.setValueAt(venda.getCliente().getNome(), cont, 1);
                jtbPagPendentes.setValueAt(venda.getCliente().getTelefone(), cont, 2);
                jtbPagPendentes.setValueAt(venda.getValorTotal(), cont, 3);
                
                ConverteDatas converterData = new ConverteDatas();
                jtbPagPendentes.setValueAt(converterData.converteDataParaString(venda.getDataRecebimento()), cont, 4);
            }
        } 
    }//GEN-LAST:event_jbBuscarPagPendentesActionPerformed

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
            java.util.logging.Logger.getLogger(PagamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagamentosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagamentosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarPagPendentes;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbRegistrarPagamento;
    private javax.swing.JTable jtbPagPendentes;
    // End of variables declaration//GEN-END:variables
}