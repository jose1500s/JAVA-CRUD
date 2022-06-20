package examen1erparcial;


import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class accesoPorBaseDeDatos {
    public static void main(String[] args) throws SQLException {
        try {
            Connection conex = null;
            conex = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcoorsa", "root", "");
            Statement s = conex.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM tpermisos");
            System.out.println("USUARIO CLAVE");
            while(rs.next()) {
                System.out.println(rs.getString("Usuario")+" "+rs.getString("Estatus")+"  "+rs.getString("Password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(accesoPorBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
