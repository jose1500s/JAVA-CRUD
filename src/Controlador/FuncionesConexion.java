package Controlador;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FuncionesConexion {

    private static java.sql.Connection cnx = null;
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String jdbc = "jdbc:mysql://localhost:3306/bdcoorsa";
    private final String usuario = "root";
    private final String contra = "";

    public void conexionBD() throws ClassNotFoundException {
        try {
            Class.forName(Driver);
            cnx = (java.sql.Connection) DriverManager.getConnection(jdbc, usuario, contra);
            if (cnx != null) {
                JOptionPane.showMessageDialog(null, "Conexion exitosa", "Base de datos", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida" + e, "Base de datos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cerrarConexion() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

}