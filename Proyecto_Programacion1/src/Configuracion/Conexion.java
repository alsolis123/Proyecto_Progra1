
package Configuracion;

import java.sql.*;


public class Conexion {
    protected Connection con = null;
    
    public Conexion(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "1234");
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public Connection getConnection(){
            return con;
    }
}
