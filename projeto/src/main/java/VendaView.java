import animais.loja.Clientes.Cliente;
import animais.loja.Clientes.ClienteDAO;

import animais.loja.Funcionarios.Funcionario;
import animais.loja.Funcionarios.FuncionarioDAO;

import animais.loja.Estoque.Produto.Produto;
import animais.loja.Estoque.Produto.ProdutoDAO;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import animais.loja.Vendas.VendaDAO;
import animais.loja.Vendas.Venda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Pichau
 */
public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioView
     */
    public VendaView() {
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
        vendaView = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cpfFuncionario = new javax.swing.JTextField();
        btn_ExecutarVenda = new javax.swing.JButton();
        idProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JTextField();
        idVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_RemoverVenda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        VoltarMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vendaView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Funcionário", "Cliente", "Produto", "Data", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendaView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                vendaViewAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                vendaViewAncestorRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(vendaView);

        jLabel1.setText("CPF do funcionário:");

        cpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFuncionarioActionPerformed(evt);
            }
        });

        btn_ExecutarVenda.setText("Executar venda");
        btn_ExecutarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExecutarVendaActionPerformed(evt);
            }
        });

        idProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF do Cliente:");

        jLabel3.setText("Id do Produto:");

        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        idVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idVendaActionPerformed(evt);
            }
        });

        jLabel4.setText("Id da Venda:");

        btn_RemoverVenda.setText("Remover venda");
        btn_RemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_ExecutarVenda)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(52, 52, 52)
                            .addComponent(jLabel2))))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_RemoverVenda)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_RemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btn_ExecutarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        VoltarMenu.setText("Voltar");
        VoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMenuActionPerformed(evt);
            }
        });
        jMenu1.add(VoltarMenu);

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

    private void cpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfFuncionarioActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handlingcpfFuncionarioe:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btn_ExecutarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExecutarVendaActionPerformed
        // TODO add your handling code here:
        String idSemFiltro = idProduto.getText();
        String cpfC = cpfCliente.getText();
        String cpfF = cpfFuncionario.getText();

        if (idSemFiltro.equals("") || cpfC.equals("") || cpfF.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos");
        } else {
            int idN = Integer.parseInt(idSemFiltro);
            VendaDAO vDAO = new VendaDAO();
            try {
                int erros = 0;
                Cliente dadosC = vDAO.buscarClientePorCpf(cpfC);
                Funcionario dadosF = vDAO.buscarFuncionarioPorCpf(cpfF);
                Produto dadosP = vDAO.buscarProdutoPorId(idN);
                
                if (dadosC == null) {
                    JOptionPane.showMessageDialog(this, "Cliente não encontrado.");
                    erros += 1;
                }
                if (dadosF == null) {
                    JOptionPane.showMessageDialog(this, "Funcionario não encontrado.");
                    erros += 1;
                }
                if (dadosP == null) {
                    JOptionPane.showMessageDialog(this, "Produto não encontrado.");
                    erros += 1;
                }
                if (erros == 0) {
                    Venda venda = new Venda();
                    venda.setClienteId(dadosC.getId());
                    venda.setfuncionarioId(dadosF.getId());
                    venda.setProdutoId(idN);
                    venda.setDataVenda(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                    venda.setValorTotal(dadosP.getValor());
                    if (vDAO.adicionarVenda(venda)) {
                        JOptionPane.showMessageDialog(this, "Venda adicionada com sucesso.");
                        this.dispose();
                        VendaView f = new VendaView();
                        f.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Não foi possível adicionar venda.");
                    }
                }
            } catch (SQLException ex) {
                    // Exibe a mensagem de erro no console para depuração
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Erro ao processar a venda: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btn_ExecutarVendaActionPerformed

private void carregarProdutos() {
    // Obtém o modelo da tabela
    DefaultTableModel modeloTabela = (DefaultTableModel) vendaView.getModel();
    modeloTabela.setRowCount(0); // Limpa a tabela

    VendaDAO vendaDAO = new VendaDAO();
    try {
        for (Venda venda : vendaDAO.listarVendas()) {
            modeloTabela.addRow(new Object[]{
                venda.getId(),
                venda.getNomeFuncionario(),  // Nome do Funcionario
                venda.getNomeCliente(),      // Nome do Cliente
                venda.getNomeProduto(),      // Nome do Produto
                venda.getDataVenda(),
                venda.getValorTotal(),
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar vendas: " + e.getMessage());
        e.printStackTrace();
    }
}


    
    private void vendaViewAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vendaViewAncestorAdded
        // TODO add your handling code here:
        carregarProdutos();

    }//GEN-LAST:event_vendaViewAncestorAdded

    
    
    private void vendaViewAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vendaViewAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaViewAncestorRemoved

    private void idProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idProdutoActionPerformed

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteActionPerformed

    private void VoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Interface i = new Interface();
        i.setVisible(true);
    }//GEN-LAST:event_VoltarMenuActionPerformed

    private void idVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idVendaActionPerformed

    private void btn_RemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverVendaActionPerformed
        // TODO add your handling code here:
        String idSemFiltro = idVenda.getText();
        if (idSemFiltro.equals("")) {
            JOptionPane.showMessageDialog(this,"Por favor, adicione um id");
        } else {
            int id = Integer.parseInt(idSemFiltro);
            VendaDAO vDAO = new VendaDAO();
            
            try {
                if (vDAO.deletarVenda(id)) {
                    JOptionPane.showMessageDialog(this,"Venda removida com sucesso.");
                    this.dispose();
                    VendaView f = new VendaView();
                    f.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this,"Erro ao remover venda.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_RemoverVendaActionPerformed

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
                new VendaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem VoltarMenu;
    private javax.swing.JButton btn_ExecutarVenda;
    private javax.swing.JButton btn_RemoverVenda;
    private javax.swing.JTextField cpfCliente;
    private javax.swing.JTextField cpfFuncionario;
    private javax.swing.JTextField idProduto;
    private javax.swing.JTextField idVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable vendaView;
    // End of variables declaration//GEN-END:variables
}
