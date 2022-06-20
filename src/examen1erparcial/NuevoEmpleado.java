/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1erparcial;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class NuevoEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form NuevoEmpleado
     */
    public NuevoEmpleado() {
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

        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        field_horario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date_chooser = new rojerusan.RSDateChooser();
        jLabel12 = new javax.swing.JLabel();
        field_empresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        field_pago_hora = new javax.swing.JTextField();
        field_empleado_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        field_id_estatus = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Registrar Empleado");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 430, 120));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID Horario");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, 52));

        field_horario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(field_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 220, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, 52));
        getContentPane().add(date_chooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 220, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID Empresa");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, -1, 52));

        field_empresa.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(field_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 220, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID pago/hora");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, 52));

        field_pago_hora.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(field_pago_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 220, 30));

        field_empleado_nombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(field_empleado_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 220, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Registro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 52));

        field_id_estatus.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(field_id_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 220, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Estatus");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, 52));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gradient.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // conectar a la bd
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdcoorsa", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(TablaSupervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        // obtener todos los datos de los textfield
        String nombre = field_empleado_nombre.getText();
        // obtener la fecha de registro
        String fecha_registro = date_chooser.getFechaSeleccionada();
      

         // tomar los valores de los texfields, field_id_estatus, field_horario,field_pago_hora y field_empresa y guardarlos como int en variables
        int id_estatus = Integer.parseInt(field_id_estatus.getText());
        int id_horario = Integer.parseInt(field_horario.getText());
        int id_pago_hora = Integer.parseInt(field_pago_hora.getText());
        int id_empresa = Integer.parseInt(field_empresa.getText());

        // crear una sentencia sql para insertar los datos en la tabla empleado
        String sql = "INSERT INTO templeados (nombre_completo,fecha_registro,id_estatus,id_horario,id_pagohora,id_empresa) VALUES ('" + nombre + "','" + fecha_registro + "'," + id_estatus + "," + id_horario + "," + id_pago_hora + "," + id_empresa + ")";

        // ejecutar la sentencia sql
        try {
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(TablaSupervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        // limpiar los campos
        field_empleado_nombre.setText("");
        field_id_estatus.setText("");
        field_horario.setText("");
        field_pago_hora.setText("");
        field_empresa.setText("");
        




    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSDateChooser date_chooser;
    private javax.swing.JTextField field_empleado_nombre;
    private javax.swing.JTextField field_empresa;
    private javax.swing.JTextField field_horario;
    private javax.swing.JTextField field_id_estatus;
    private javax.swing.JTextField field_pago_hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}