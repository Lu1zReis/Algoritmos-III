import animais.loja.Estoque.Produto.ProdutoDAO;
import animais.loja.Estoque.Produto.Produto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Pichau
 */
public class ProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioView
     */
    public ProdutoView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoView = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idProduto = new javax.swing.JTextField();
        btn_idRemoveFuncionario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AdicionarFuncionario = new javax.swing.JMenuItem();
        VoltarMenu = new javax.swing.JMenuItem();
        EditarFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        produtoView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Tipo", "Validade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        produtoView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                produtoViewAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                produtoViewAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(produtoView);

        jLabel1.setText("Ação por Id:");

        idProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProdutoActionPerformed(evt);
            }
        });

        btn_idRemoveFuncionario.setText("Remover");
        btn_idRemoveFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idRemoveFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btn_idRemoveFuncionario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btn_idRemoveFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        AdicionarFuncionario.setText("Adicionar");
        AdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(AdicionarFuncionario);

        VoltarMenu.setText("Voltar");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        jMenu1.add(VoltarMenu);

        EditarFuncionario.setText("Atualizar");
        EditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(EditarFuncionario);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProdutoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn_idRemoveFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idRemoveFuncionarioActionPerformed
        // TODO add your handling code here:
        String idSemFiltro = idProduto.getText();
        if (idSemFiltro.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, adicione um id");
        } else {
            int idN = Integer.parseInt(idSemFiltro);
            ProdutoDAO fDAO = new ProdutoDAO();
            try {
                if (fDAO.deletarProduto(idN)) {
                    JOptionPane.showMessageDialog(this, "Funcionário deletado!");
                    this.dispose();
                    ProdutoView f = new ProdutoView();
                    f.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_idRemoveFuncionarioActionPerformed

    private void AdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarFuncionarioActionPerformed
            // TODO add your handling code here:
        this.dispose();
        ProdutoCadastrar f = new ProdutoCadastrar();
        f.setVisible(true);
        
    }//GEN-LAST:event_AdicionarFuncionarioActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Interface i = new Interface();
        i.setVisible(true);
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void carregarProdutos() {
        // Obtém o modelo da tabela
        DefaultTableModel modeloTabela = (DefaultTableModel) produtoView.getModel();
        modeloTabela.setRowCount(0); // Limpa a tabela

        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            for (Produto produto : produtoDAO.listarProdutos()) {
                modeloTabela.addRow(new Object[]{
                    produto.getId(),
                    produto.getNome(),
                    produto.getValidade(),
                    produto.getTipo(),
                    produto.getValor(),
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar funcionários: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    private void produtoViewAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_produtoViewAncestorAdded
        // TODO add your handling code here:
        carregarProdutos();

    }//GEN-LAST:event_produtoViewAncestorAdded

    private void EditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarFuncionarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ProdutoEditar f = new ProdutoEditar();
        f.setVisible(true);
    }//GEN-LAST:event_EditarFuncionarioActionPerformed

    
    
    private void produtoViewAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_produtoViewAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoViewAncestorRemoved

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
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdicionarFuncionario;
    private javax.swing.JMenuItem EditarFuncionario;
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JButton btn_idRemoveFuncionario;
    private javax.swing.JTextField idProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable produtoView;
    // End of variables declaration//GEN-END:variables
}
