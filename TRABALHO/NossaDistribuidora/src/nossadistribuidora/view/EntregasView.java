
package nossadistribuidora.view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nossadistribuidora.controller.ClienteController;
import nossadistribuidora.controller.VendaController;
import nossadistribuidora.model.Venda;

/**
 *
 * @author Giseli
 */

/*
*Classe que gerencia as entregas das vendas realizadas.
*/
public class EntregasView extends javax.swing.JFrame {

    private ClienteController clienteController;
    private VendaController vendaController;
    
    /*
    *Construtor que cria as instancias dos controllers necessários para as operações
    */
    public EntregasView() {
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
        jtbEntregas = new javax.swing.JTable();
        jbBuscarEntregas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbCancelar = new javax.swing.JButton();
        jbFazerEntrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 360));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbEntregas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código venda", "Nome Cliente", "Endereço", "Valor a receber", "Num. Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbEntregas);

        jbBuscarEntregas.setText("Buscar");
        jbBuscarEntregas.setAlignmentY(0.0F);
        jbBuscarEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarEntregasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jbBuscarEntregas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbBuscarEntregas)
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

        jbFazerEntrega.setText("Fazer entrega");
        jbFazerEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFazerEntregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jbFazerEntrega)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbFazerEntrega))
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

    private void jbFazerEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFazerEntregaActionPerformed
        int selecionada = jtbEntregas.getSelectedRow(); //recebe a linha que foi selecionada na tabela
        int codigoVenda = (int) jtbEntregas.getValueAt(selecionada, 0);//Recebe o codigo da venda que está na linha selecionada
        
        Venda venda = getVendaController().buscaVendaPorCodigo(codigoVenda);
        
        //Muda o status da entrega da venda selecionada.
        if(venda.getStatusEntrega().equalsIgnoreCase("Pendente")){
            venda.setStatusEntrega("Em andamento");
            JOptionPane.showMessageDialog(this, "Venda em andamento...", 
                "Fazer Entregas",JOptionPane.INFORMATION_MESSAGE);
        }else if(venda.getStatusEntrega().equalsIgnoreCase("Em andamento")){
            venda.setStatusEntrega("Concluida");
            JOptionPane.showMessageDialog(this, "Venda concluída com sucesso!", 
                "Fazer Entregas",JOptionPane.INFORMATION_MESSAGE);
        }
        
        try {
            //Atualiza a venda no banco de dados com o novo status de entrega
            getVendaController().alterar(venda);
        } catch (Exception ex) {
            Logger.getLogger(EntregasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jbFazerEntregaActionPerformed

    /*
    *Metodo para buscar as informações de vendas com entregas pendentes no banco de dados
    */
    private void jbBuscarEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarEntregasActionPerformed
        int cont = 0; //Contador que controla a inclusao de vendas na tabela
        
        List<Venda> lstVendas = new ArrayList<>();
        try {
            //Lista todas as vendas do banco de dados
            lstVendas = getVendaController().listar(Venda.class);
        } catch (Exception ex) {
            Logger.getLogger(EntregasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Venda venda : lstVendas){
            if(!(venda.getStatusEntrega().equalsIgnoreCase("Concluida"))){
                /*
                *Seta os dados das vendas com entrega pendente na tabela para ser exibida
                */ 
                jtbEntregas.setValueAt(venda.getCodigo(), cont , 0);
                jtbEntregas.setValueAt(venda.getCliente().getNome(), cont, 1);
                jtbEntregas.setValueAt(venda.getCliente().getEndereco().toString(), cont, 2);
                jtbEntregas.setValueAt(venda.getValorTotal(), cont, 3);
                jtbEntregas.setValueAt(cont + 1, cont, 4); //seta a ordem de entrega;
            }
        } 
    }//GEN-LAST:event_jbBuscarEntregasActionPerformed

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
            java.util.logging.Logger.getLogger(EntregasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntregasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarEntregas;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFazerEntrega;
    private javax.swing.JTable jtbEntregas;
    // End of variables declaration//GEN-END:variables
}
