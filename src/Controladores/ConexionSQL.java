/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class ConexionSQL {

    Connection conectar = null;

    
    public Connection conexion()
    {    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/nomina","root","Extra12345");
            
            JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage());
            
        }
        return conectar;
    }
}