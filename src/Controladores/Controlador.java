
package Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Controlador 
    {
    private static Connection conectar;
    private static final String driver = "con.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "Extra12345";
    private static final String url = "jdbc:mysql://localhost:3307/nomina";
    
public Controlador ()
{  
    conectar = null;
    try{
        Class.forName(driver);
        conectar = DriverManager.getConnection(driver, user, pass);
        if(conectar != null)
        {
            System.out.println("Conexion establecida!!");
        }
        
    } catch (ClassNotFoundException | SQLException e)
    {
        System.out.println("Errore al conectar " + e);
    }
}

public Connection getConnection()
{
    return conectar;
}

public void desconectar()
{
    conectar = null;
    if (conectar == null)
    {
        System.out.println("Conexion terminada...");
    }
}

    }