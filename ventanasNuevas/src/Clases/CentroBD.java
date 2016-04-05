
package Clases;

import ejerciciofase2.EjercicioFase2;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;


public class CentroBD {
    
    public static Centros ce;
    public static String idCentro;
    
    public static ArrayList<String> llenarCb(){
        ArrayList<String> ce = new ArrayList();
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet centro = sentencia.executeQuery("select id from centro");
            while(centro.next()){
                ce.add(centro.getString("ID"));
            }
            GenericoBD.conexion();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return ce;
    }
    
    public static String llenarNombre(String id){
        String n = "";
        String select = "select nombre from centro where id = " + id;
        idCentro = id;
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            ResultSet nombre = sentencia.executeQuery(select);
            nombre.next();
            n = nombre.getString("NOMBRE");
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return n;
    }
    
    public static void insertCentro(String nombre, String calle, String numero, String cp, String ciudad, String provincia, String telefono){
        String secuencia = "INSERT INTO centro (nombre,CALLE,NUMERO,CPOSTAL,CIUDAD,PROVINCIA,TELEFONO) values('" + nombre + "','" + calle + "','" + numero + "','" + cp + "','" + ciudad + "','" + provincia + "','" + telefono + "')";
        
        try{
            GenericoBD.abrirConexion();
            
            Statement sentencia = GenericoBD.conexion().createStatement();
            sentencia.executeUpdate(secuencia);
            sentencia.executeUpdate("COMMIT");
            
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static void borrarCentro(){
        String secuencia1 = "delete from administracion where idcentro = " + idCentro;
        String secuencia2 = "delete from logistica where idcentro = " + idCentro;
        String secuencia3 = "DELETE from centro where id = " + idCentro;
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            sentencia.executeUpdate(secuencia1);
            sentencia.executeUpdate(secuencia2);
            sentencia.executeUpdate(secuencia3);
            sentencia.executeUpdate("COMMIT");
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static void editarCentro(String nombre, String calle, String numero, String cp, String ciudad, String provincia, String telefono){
        String actualizar = "UPDATE CENTRO SET NOMBRE = '" + nombre + "', CALLE = '" + calle + "', NUMERO = '" + numero + "', CPOSTAL = '" + cp + "', CIUDAD = '" + ciudad + "', PROVINCIA = '" + provincia + "', TELEFONO = '" + telefono + "' where ID = " + idCentro;
        
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            
            sentencia.executeUpdate(actualizar);
            sentencia.executeUpdate("COMMIT");
            
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
    
    public static void getCentro(){
        
        try{
            GenericoBD.abrirConexion();
            CallableStatement cs = GenericoBD.conexion().prepareCall("{call sentencias_centro.mostrar_centro(?,?)}");
            int id = Integer.parseInt(idCentro);
            cs.setInt(1, id);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.execute();
            ResultSet sentencia = (ResultSet)cs.getObject(2);
            
            sentencia.next();
            
            ce = new Centros();
            
            ce.setNombre(sentencia.getString("NOMBRE"));
            ce.setCalle(sentencia.getString("CALLE"));
            ce.setNumero(sentencia.getString("NUMERO"));
            ce.setCp(sentencia.getString("CPOSTAL"));
            ce.setCiudad(sentencia.getString("CIUDAD"));
            ce.setProvincia(sentencia.getString("PROVINCIA"));
            ce.setTelefono(sentencia.getString("TELEFONO"));
            
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        } 
    }
    
    public static Centros getCe(){
        return ce;
    }
}
