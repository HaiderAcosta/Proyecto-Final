/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.SqlUsuarios;
import Clases.Usuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Registro extends javax.swing.JFrame {
private int intentos;
    public Registro() {
     initComponents();
     this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXcontra2 = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TXcontra = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        TXcorreo = new javax.swing.JTextField();
        TXusuario = new javax.swing.JTextField();
        TXnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Roles = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo2.jpg"))); // NOI18N

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 0));
        jLabel2.setText("Contraseña :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        TXcontra2.setBackground(new java.awt.Color(0, 0, 0));
        TXcontra2.setForeground(new java.awt.Color(255, 255, 255));
        TXcontra2.setBorder(null);
        TXcontra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXcontra2ActionPerformed(evt);
            }
        });
        jPanel1.add(TXcontra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 160, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 190, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 0));
        jLabel5.setText("Confirmar Contra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 190, 20));

        TXcontra.setBackground(new java.awt.Color(0, 0, 0));
        TXcontra.setForeground(new java.awt.Color(255, 255, 255));
        TXcontra.setBorder(null);
        TXcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXcontraActionPerformed(evt);
            }
        });
        jPanel1.add(TXcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 190, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 0));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 160, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 0));
        jLabel7.setText("Correo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 190, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/GuardarTodo.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 100, -1));

        TXcorreo.setBackground(new java.awt.Color(0, 0, 0));
        TXcorreo.setForeground(new java.awt.Color(255, 255, 255));
        TXcorreo.setBorder(null);
        jPanel1.add(TXcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 190, 20));

        TXusuario.setBackground(new java.awt.Color(0, 0, 0));
        TXusuario.setForeground(new java.awt.Color(255, 255, 255));
        TXusuario.setBorder(null);
        TXusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TXusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 20));

        TXnombre.setBackground(new java.awt.Color(0, 0, 0));
        TXnombre.setForeground(new java.awt.Color(255, 255, 255));
        TXnombre.setBorder(null);
        TXnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXnombreActionPerformed(evt);
            }
        });
        jPanel1.add(TXnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 190, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 0));
        jLabel9.setText("Rol:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        Roles.setBackground(new java.awt.Color(0, 0, 0));
        Roles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Roles.setForeground(new java.awt.Color(153, 153, 0));
        Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));
        Roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolesActionPerformed(evt);
            }
        });
        jPanel1.add(Roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Logo Registro.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 130, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Fondo2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setDoubleBuffered(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 370, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         Inicio.frmReg = null; 
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void TXcontra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXcontra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXcontra2ActionPerformed

    private void TXcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXcontraActionPerformed

    private void TXusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXusuarioActionPerformed

    private void TXnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        String pass = new String(TXcontra.getPassword());
        String passCon = new String(TXcontra2.getPassword());
        int rol =1+ Roles.getSelectedIndex();

        if (TXusuario.getText().equals("") || pass.equals("") || passCon.equals("") || TXnombre.getText().equals("") || TXcorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

        } else {
            // Comprueba si las dos contraseñas son iguales.
            if (pass.equals(passCon)) {

                if (modSql.existeUsuario(TXusuario.getText())== 0) {

                    if (modSql.esEmail(TXcorreo.getText())) {

                        // Registra el nuevo usuario.
                        mod.setUsuario(TXusuario.getText());
                        mod.setContraseña(passCon);
                        // mod.setContraseña(hash.sha1(pass));
                        mod.setNombre(TXnombre.getText());
                        mod.setCorreo(TXcorreo.getText());
                        mod.setId_tipo(rol);
                        

                        if (modSql.registrar(mod)) {
                            JOptionPane.showMessageDialog(null, "Registro Usuario");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se Registro el Usuario");
                        }
                        

                    } else {
                        JOptionPane.showMessageDialog(null, "El Correo electronico no es valido ");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "El Usuario ya existe ");
                }
            } else {
                // Muestra un mensaje de error.
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolesActionPerformed
        // TODO add your handling code here:
        int rol = Roles.getSelectedIndex();
        
    }//GEN-LAST:event_RolesActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Roles;
    private javax.swing.JPasswordField TXcontra;
    private javax.swing.JPasswordField TXcontra2;
    private javax.swing.JTextField TXcorreo;
    private javax.swing.JTextField TXnombre;
    private javax.swing.JTextField TXusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
