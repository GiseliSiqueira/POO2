
package nossadistribuidora.view;

import Patterns.FabricaProdutoComboBox;
import Util.ConverteDatas;
import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nossadistribuidora.controller.CompraController;
import nossadistribuidora.controller.ProdutoAguaController;
import nossadistribuidora.model.Compra;
import nossadistribuidora.model.Produto;
import nossadistribuidora.model.ProdutoAgua;

/**
 *
 * @author Giseli
 */

/*Classe que exibe a tela para receber as informações relativas a compras como
*lista de produtos, data e valor.
*/
public class CompraAguaView extends javax.swing.JFrame {

    private CompraController compraController;
    private int cont = 0; //Contador que controla a inserção de itens na tabela de compras.
    
    /*
    *Construtor que cria a instancia do controller necessário para as operações no banco e
    *criação do botao com os produtos cadastrados no banco de dados.
    */
    public CompraAguaView() {
        compraController = new CompraController();
        initComponents();
        FabricaProdutoComboBox.criaJComboBoxProduto("Água", jcMarca); //Cria JComboBox com os produtos do tipo água cadastrados
        jcMarca.requestFocus();
    }

    /*
    *Get do controlador.
    */
    public CompraController getCompraController() {
        return compraController;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstProdutosCompraAgua = new LinkedList<ProdutoAgua>();
        jPanel1 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtNumeroCompra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtValorCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcMarca = new javax.swing.JComboBox<>();
        jbAdicionarProduto = new javax.swing.JButton();
        jftDataCompra = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbListaProdutos = new javax.swing.JTable();
        jbBuscarCompra = new javax.swing.JButton();

        lstProdutosCompraAgua = org.jdesktop.observablecollections.ObservableCollections.observableList(lstProdutosCompraAgua);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Compra - Água");
        setSize(new java.awt.Dimension(0, 0));

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
                .addGap(97, 97, 97)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addContainerGap(125, Short.MAX_VALUE))
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

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setText("Número:");

        jLabel11.setText("Valor:");

        jtValorCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtValorCompraActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca:");

        jcMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMarcaActionPerformed(evt);
            }
        });

        jbAdicionarProduto.setText("Adicionar");
        jbAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarProdutoActionPerformed(evt);
            }
        });

        jftDataCompra.setColumns(1);
        jftDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        try{ 
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            jftDataCompra = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jftDataCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftDataCompraActionPerformed(evt);
            }
        });

        jLabel5.setText("Data:");

        jtbListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Capacidade", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbListaProdutos);

        jbBuscarCompra.setText("Buscar");
        jbBuscarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jftDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNumeroCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jcMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAdicionarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbBuscarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNumeroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdicionarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jftDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26))
        );

        jbBuscarCompra.getAccessibleContext().setAccessibleParent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        /*
        *Verifica se a compra já existe pela busca do código
        *Caso exista: atualiza os dados da compra;
        *caso nao exista: salva os dados da compra;
        */
        if(jtNumeroCompra.getText().equals("")){
            Compra compra = new Compra();
            
            ConverteDatas converterData = new ConverteDatas();
            
            compra.setListaDeProdutosAgua(lstProdutosCompraAgua);
            //Converte a String recebida referente a data para o tipo Date e armazena na compra
            try {
                compra.setData(converterData.converteData((String) jftDataCompra.getValue()));
            } catch (ParseException ex) {
                Logger.getLogger(CompraAguaView.class.getName()).log(Level.SEVERE, null, ex);
            }
            compra.setValorCompra(Float.parseFloat(jtValorCompra.getText()));
            compra.setQuantidadeProduto(lstProdutosCompraAgua.size());
            /*
            *Envio das informações da compra para o respectivo controlador
            *para que sejam realizadas as operações de inserção no banco de dados.
            */
            try {
                getCompraController().inserir(compra);
                /*
                *Percorre a lista de produtos adicionados na compra e atualiza a quantidade em estoque
                *do produto de acordo com a quantidade adquirida do produto.
                */
                for(ProdutoAgua agua : compra.getListaDeProdutosAgua()){
                    ProdutoAguaController aguaController = new ProdutoAguaController();
                    //Atualiza a quantidade em estoque do produto comprado 
                    agua.setQuantidadeEstoque(agua.getQuantidadeEstoque() + (Integer.parseInt((String) jtbListaProdutos.
                            getValueAt(compra.getListaDeProdutosAgua().indexOf(agua), 4))));
                    //Atualiza o status de disponibilidade em estoque caso este esteja zerado.
                    if(agua.getDisponibilidadeEstoque()==false){
                        agua.setDisponibilidadeEstoque(true);
                    }
                    //Altera o produto para registrar a nova quantidade em estoque.
                    aguaController.alterar(agua);
                    
                }
                JOptionPane.showMessageDialog(this, "Compra inserida com sucesso!", 
                "Inserir compra",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (Exception ex) {
                Logger.getLogger(CompraAguaView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "O campo 'numero' da venda deve estar vazio para inserção de nova venda. "
                    + "Verifique essa informação e tente novamente!", "Inserir compra",JOptionPane.INFORMATION_MESSAGE);
                
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        /*Verifica se o numero da compra a ser excluída foi informado.
        *Caso informado: exclui a compra
        *Caso não informado: informa que nao é possível excluir.
        */
        if(!(jtNumeroCompra.getText().equals(""))){
            /*
            *Recebe o numero da compra e chama o metodo de
            *exclusão do registro do banco da entidade referente.
            */
            Compra compra = getCompraController().buscaCompraPorNumero(Integer.parseInt(jtNumeroCompra.getText()));

            if(JOptionPane.showConfirmDialog(this, "Confirma a exclusão?", "Confirma a exclusão?", JOptionPane.YES_NO_OPTION) ==
                        JOptionPane.YES_OPTION){
                try {
                    getCompraController().deletar(compra);
                    JOptionPane.showMessageDialog(this, "Compra excluída com sucesso!", 
                        "Excluir compra", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                } catch (Exception ex) {
                    Logger.getLogger(CompraAguaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
           JOptionPane.showMessageDialog(this, "Informe o numero da compra para realizar a exclusão! Tente novamente.", 
                        "Excluir compra", JOptionPane.INFORMATION_MESSAGE);
                        dispose(); 
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jcMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMarcaActionPerformed
        
    }//GEN-LAST:event_jcMarcaActionPerformed

    private void jftDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftDataCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftDataCompraActionPerformed

    private void jbAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarProdutoActionPerformed
        
        /*
        *Recebe os valores selecionados para cada produto e adiciona os valores em cada linha da tabela de produtos
        */
        ProdutoAgua selecionado = (ProdutoAgua)jcMarca.getSelectedItem();

        jtbListaProdutos.setValueAt(selecionado.getID(), cont, 0);
        jtbListaProdutos.setValueAt(selecionado.getNome(), cont, 1);
        jtbListaProdutos.setValueAt(selecionado.getMarca(), cont, 2);
        jtbListaProdutos.setValueAt(selecionado.getCapacidade(), cont, 3);
        lstProdutosCompraAgua.add(selecionado); //Adiciona o produto selecionado à lista de produtos da compra
        cont++;
        
    }//GEN-LAST:event_jbAdicionarProdutoActionPerformed

    private void jtValorCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtValorCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtValorCompraActionPerformed

    private void jbBuscarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarCompraActionPerformed
        /*Codigo para buscar os dados no banco e mostrar no Frame
        *Busca a compra por numero
        */
        Compra compra = null;
        
        //Verifica se o numero da compra que se deseja buscar foi informado
        if(!(jtNumeroCompra.getText().equals(""))){
            compra = getCompraController().buscaCompraPorNumero(Integer.parseInt(jtNumeroCompra.getText()));
        }
        /*
        *Exibe as informações da compra nos jTextField da janela.
        */
        if(compra != null){
            lstProdutosCompraAgua = compra.getListaDeProdutosAgua(); // Carrega a lista dos produtos da compra
            
            //Exibe as informações por produto na tabela
            for(ProdutoAgua agua : lstProdutosCompraAgua){
                int linha = lstProdutosCompraAgua.indexOf(agua);
                jtbListaProdutos.setValueAt(agua.getID(), linha, 0);
                jtbListaProdutos.setValueAt(agua.getNome(), linha, 1);
                jtbListaProdutos.setValueAt(agua.getMarca(), linha, 2);
                jtbListaProdutos.setValueAt(agua.getCapacidade(), linha, 3);
                
            }
            jftDataCompra.setValue(compra.getData()); //Exibe informação de data da compra
            jtValorCompra.setText(Float.toString(compra.getValorCompra()));//Exibe informação de valor total da compra
        }/*
        *Caso não seja informado o numero da compra para busca:
        */
        else if(jtNumeroCompra.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Informar numero da compra para busca!", 
                    "Buscar compra",JOptionPane.INFORMATION_MESSAGE);
            }
                /*
                *Caso a compra cujo numero informados não exista, informa o nao cadastramento
                */
                else{
                    JOptionPane.showMessageDialog(this, "Compra não cadastrada!", 
                    "Buscar compra",JOptionPane.INFORMATION_MESSAGE);
                }
    }//GEN-LAST:event_jbBuscarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(CompraAguaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraAguaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraAguaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraAguaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompraAguaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionarProduto;
    private javax.swing.JButton jbBuscarCompra;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<ProdutoAgua> jcMarca;
    private javax.swing.JFormattedTextField jftDataCompra;
    private javax.swing.JTextField jtNumeroCompra;
    private javax.swing.JTextField jtValorCompra;
    private javax.swing.JTable jtbListaProdutos;
    private java.util.List<ProdutoAgua> lstProdutosCompraAgua;
    // End of variables declaration//GEN-END:variables
}
