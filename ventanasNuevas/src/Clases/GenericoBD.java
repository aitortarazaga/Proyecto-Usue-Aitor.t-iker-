
package Clases;

import java.sql.*;
import oracle.jdbc.OracleTypes;

public class GenericoBD {
    
    private static Connection con;
    
    public static void abrirConexion(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            
            String login = "daw07";
            String password = "daw07";
            String url = "jdbc:oracle:thin:@SrvOracle:1521:orcl";
            con = DriverManager.getConnection(url, login, password);
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
    }
    
    public static void cerrarConexion(){
        try{
            con.close();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
    }
    
    public static Connection conexion(){
        Connection c = con;
        return c;
    }
    
    
}
