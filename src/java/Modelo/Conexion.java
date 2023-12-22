
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  
    Connection conexion = null;

    public String base = "crud?serverTimezone=UTC";
    public String url = "jdbc:mysql://localhost:3306/" + base; 
    public String user = "root";
    public String password = "root";
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
