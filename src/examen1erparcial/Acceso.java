/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1erparcial;

import Controlador.FuncionesConexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Acceso extends javax.swing.JFrame {

    public Acceso() {
        initComponents();
        // centrar el jframe
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        field_usuario = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        field_pass = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACCESO AL SISTEMA BD COORSA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gif-coorsa5 (2).gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 211, 169));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 94, -1, -1));
        getContentPane().add(field_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 129, 159, 27));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Conectar a BD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 174, -1, -1));
        getContentPane().add(field_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 160, 30));

        btn_login.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_login.setText("Entrar");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/background2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
       // obtener el texto de los campos field_usuario y field_pass
        String usuario = field_usuario.getText();
        String pass = field_pass.getText();

    try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdcoorsa", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select perfil from tpermisos where Usuario='"+usuario+"' and Password='"+pass+"'");
//          si el resultado es 1 mandar a la ventana Empleados, si es 2 mandar la ventana Supervisores, si es 3 mandar la ventana Administradores
            if(rs.next()){
                if(rs.getString("perfil").equals("1")){
                    Empleados empleados = new Empleados();
                    empleados.setVisible(true);
                    this.dispose();
                }else if(rs.getString("perfil").equals("2")){
                    TablaSupervisor supervisores = new TablaSupervisor();
                    supervisores.setVisible(true);
                    this.dispose();
                }else if(rs.getString("perfil").equals("3")){
                    Administradores administradores = new Administradores();
                    administradores.setVisible(true);
                    this.dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FuncionesConexion fc = new FuncionesConexion();
        try {
            fc.conexionBD();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField field_pass;
    private javax.swing.JTextField field_usuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
