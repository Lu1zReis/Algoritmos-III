/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import animais.loja.Estoque.Animal.Animal;
import animais.loja.Estoque.Animal.AnimalDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class AnimalEditar extends javax.swing.JFrame {

    /**
     * Creates new form FuncionarioEditar
     */
    
    public AnimalEditar() {
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        editarAnimalRaca = new javax.swing.JTextField();
        editarProdutoDataAdocao = new javax.swing.JTextField();
        editarAnimalAnos = new javax.swing.JTextField();
        editarAnimalCastrado = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btn_cancelar = new javax.swing.JButton();
        editarAnimalId = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btn_buscar_animal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel19.setText("Editar Animal");

        jLabel20.setText("Idade");

        jLabel21.setText("Raça");

        jLabel22.setText("Data de Adoção");

        jLabel23.setText("Castrado");

        editarAnimalRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAnimalRacaActionPerformed(evt);
            }
        });

        editarProdutoDataAdocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarProdutoDataAdocaoActionPerformed(evt);
            }
        });

        editarAnimalAnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAnimalAnosActionPerformed(evt);
            }
        });

        editarAnimalCastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAnimalCastradoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        editarAnimalId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAnimalIdActionPerformed(evt);
            }
        });

        jLabel25.setText("Buscar funcionário por Id");

        btn_buscar_animal.setText("Ok");
        btn_buscar_animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_animalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(57, 57, 57)
                .addComponent(btn_editar)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(editarAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btn_buscar_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(editarProdutoDataAdocao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(27, 27, 27)
                        .addComponent(editarAnimalCastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarAnimalAnos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarAnimalRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarAnimalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar_animal)
                .addGap(29, 142, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarAnimalRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarProdutoDataAdocao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarAnimalCastrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarAnimalAnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_editar))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editarAnimalIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAnimalIdActionPerformed

    }//GEN-LAST:event_editarAnimalIdActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Interface i = new Interface();
        i.setVisible(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        String raca = editarAnimalRaca.getText();
        String dataAdocao = editarProdutoDataAdocao.getText();
        String anosSemFiltro = editarAnimalAnos.getText();
        String castrado = editarAnimalCastrado.getText();
        String idSemFiltro = editarAnimalId.getText();
        
        if (raca.equals("") || dataAdocao.equals("") || anosSemFiltro.equals("") || castrado.equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        } 
        else if (idSemFiltro.equals("")) {
            JOptionPane.showMessageDialog(this, "Adicione um id válido.");
            return; // Saia do método se o funcionário não for encontrado
        }
        else {
            try {
                AnimalView fView = new AnimalView();

                // pegar de view o id

                int anos = Integer.parseInt(anosSemFiltro);
                
                int id = Integer.parseInt(idSemFiltro);

                Animal f = new Animal();
                AnimalDAO fDAO = new AnimalDAO();

                f.setId(id);
                f.setRaca(raca);
                f.setDataAdocao(dataAdocao);
                f.setAnos(anos);
                f.setCastrado(castrado.toLowerCase().charAt(0) == 's' ? true : false);

                if (fDAO.atualizarAnimal(f)) JOptionPane.showMessageDialog(this, "Animal editado!");
                else JOptionPane.showMessageDialog(this, "Não foi possível editar animal!");

                this.dispose();

                fView.setVisible(true);

            } catch (SQLException ex) {
                Logger.getLogger(AnimalCadastrar.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscar_animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_animalActionPerformed
        // TODO add your handling code here:
        Animal f = null;
        try {
            // TODO add your handling code here:
            AnimalDAO fDao = new AnimalDAO();
            String idS = editarAnimalId.getText();
            int id = Integer.parseInt(idS);

            f = fDao.buscarPorId(id);
            
        } catch (SQLException ex) {
            Logger.getLogger(AnimalEditar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (f == null) {
            JOptionPane.showMessageDialog(this, "Animal não encontrado.");
            return; // Saia do método se o funcionário não for encontrado
        } 
            
        editarAnimalRaca.setText(f.getRaca());
        editarProdutoDataAdocao.setText(f.getDataAdocao());
        editarAnimalCastrado.setText(f.isCastrado() == true ? "Sim" : "Não");
        editarAnimalAnos.setText(String.valueOf(f.getAnos()));
    }//GEN-LAST:event_btn_buscar_animalActionPerformed

    private void editarAnimalCastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAnimalCastradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarAnimalCastradoActionPerformed

    private void editarProdutoDataAdocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarProdutoDataAdocaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarProdutoDataAdocaoActionPerformed

    private void editarAnimalAnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAnimalAnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarAnimalAnosActionPerformed

    private void editarAnimalRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAnimalRacaActionPerformed
        //your handling code here:

    }//GEN-LAST:event_editarAnimalRacaActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(AnimalEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_animal;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JTextField editarAnimalAnos;
    private javax.swing.JTextField editarAnimalCastrado;
    private javax.swing.JTextField editarAnimalId;
    private javax.swing.JTextField editarAnimalRaca;
    private javax.swing.JTextField editarProdutoDataAdocao;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}