/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1erparcial;

import javax.swing.JOptionPane;

/**
 *
 * @author josea
 */
public class Supervisores extends javax.swing.JFrame {

    /**
     * Creates new form Supervisores
     */
    public Supervisores() {
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

        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_guardarCambios = new javax.swing.JButton();
        super_nombre = new javax.swing.JTextField();
        super_id = new javax.swing.JTextField();
        super_area = new javax.swing.JTextField();
        super_empleados = new javax.swing.JTextField();
        super_curp = new javax.swing.JTextField();
        super_nss = new javax.swing.JTextField();
        super_tel = new javax.swing.JTextField();
        super_email = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre: ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 52));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID Supervisor:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 52));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Area:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 52));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Curp:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, 52));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Num Empleados:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 52));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Email:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, 52));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("NSS:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, 52));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Telefono:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, -1, 52));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 75)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Supervisor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, 180));

        btn_guardarCambios.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_guardarCambios.setText("Gurdar Cambios");
        btn_guardarCambios.setEnabled(false);
        btn_guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarCambiosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, 170, -1));

        super_nombre.setEditable(false);
        super_nombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_nombre.setText("Jose Antonio Patiño");
        getContentPane().add(super_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 220, 30));

        super_id.setEditable(false);
        super_id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_id.setText("1234");
        getContentPane().add(super_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 220, 30));

        super_area.setEditable(false);
        super_area.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_area.setText("Ensambles");
        getContentPane().add(super_area, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 220, 30));

        super_empleados.setEditable(false);
        super_empleados.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_empleados.setText("50");
        getContentPane().add(super_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 220, 30));

        super_curp.setEditable(false);
        super_curp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_curp.setText("PAPT020201KSK2");
        getContentPane().add(super_curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 220, 30));

        super_nss.setEditable(false);
        super_nss.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_nss.setText("12312DA");
        getContentPane().add(super_nss, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 220, 30));

        super_tel.setEditable(false);
        super_tel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_tel.setText("4428210339");
        getContentPane().add(super_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, 220, 30));

        super_email.setEditable(false);
        super_email.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        super_email.setText("super@visor.com");
        getContentPane().add(super_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 220, 30));

        btn_salir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 720, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gradient.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // abrrir el jframe Accesso y cerrar este
        this.dispose();
        new Acceso().setVisible(true);

    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarCambiosActionPerformed
        JOptionPane.showMessageDialog(null, "(simulacion!) Se guardaron los cambios correctamente");
    }//GEN-LAST:event_btn_guardarCambiosActionPerformed

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
            java.util.logging.Logger.getLogger(Supervisores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supervisores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supervisores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supervisores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supervisores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_guardarCambios;
    public static javax.swing.JButton btn_salir;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField super_area;
    public static javax.swing.JTextField super_curp;
    public static javax.swing.JTextField super_email;
    public static javax.swing.JTextField super_empleados;
    public static javax.swing.JTextField super_id;
    public static javax.swing.JTextField super_nombre;
    public static javax.swing.JTextField super_nss;
    public static javax.swing.JTextField super_tel;
    // End of variables declaration//GEN-END:variables
}
