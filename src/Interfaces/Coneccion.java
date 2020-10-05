/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author IDEAPAD 330
 */
public class Coneccion {
    private final String base = "factura";
    private final String user = "root";
    private final String password = "fabycabrera09";
    private final String url = "jdbc:mysql://Localhost:3306/" + base;
    PreparedStatement ps;

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Conexion exitosa");

        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
