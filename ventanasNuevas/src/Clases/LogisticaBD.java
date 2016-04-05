package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import ejerciciofase2.EjercicioFase2;
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;

public class LogisticaBD {
    
    private static Persona per;
    
    public static Persona comprobarDniLog(String dni){
        
        try{
            GenericoBD.abrirConexion();
            CallableStatement cs = GenericoBD.conexion().prepareCall("{call sentencias_centro.mostrar_administracion(?,?,?)}");
            cs.setInt(1, EjercicioFase2.getCentro());
            cs.setString(2, dni);
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.execute();
            ResultSet sentencia = (ResultSet)cs.getObject(3);
            
            if(sentencia.next()){
                per = new Logistica();
                
                per.setDni(sentencia.getString("DNI"));
                per.setNombre(sentencia.getString("NOMBRE"));
                per.setApellido1(sentencia.getString("APELLIDO1"));
                per.setApellido2(sentencia.getString("APELLIDO2"));
                per.setCalle(sentencia.getString("CALLE"));
                per.setPiso(sentencia.getInt("PISO"));
                per.setMano(sentencia.getString("MANO"));
                per.setPortal(sentencia.getString("PORTAL"));
                per.setTelMovil(sentencia.getString("TELEMPRESA"));
                per.setTelPers(sentencia.getString("TELPERSONAL"));
                per.setSalario(sentencia.getFloat("SALARIO"));
                if(sentencia.getDate("FECHANAC") == null)
                    per.setFecha_nac(null);
                else
                    per.setFecha_nac(new java.util.Date(sentencia.getDate("FECHANAC").getTime()));
            }
            else
                per = null;
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
        javax.swing.JOptionPane.showMessageDialog(null ,"Problemas"+e.getMessage());
        }
        return per;
    }
    
    public static void guardarLogistica(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha){
        if(salario.isEmpty())
            salario = null;
        if(telPers.isEmpty())
            telPers = null;
        else
            telPers = "'" + telPers + "'";
        
        java.sql.Date fechasql = new java.sql.Date(fecha.getTime().getTime());
        
        String secuencia = "INSERT INTO logistica (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) " + "VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "'," + telPers + ",TO_DATE('" + fechasql + "','YYYY-MM-DD')," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
        
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
    
    public static void borrarLogistica(String dni){
        
        String secuencia = "delete from logistica where dni = '" + ejerciciofase2.EjercicioFase2.recogerDni() + "'";
        
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
        per = null;
    }
    
    public static void editarLogistica(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        if(salario.isEmpty())
            salario = null;
        if(telPers.isEmpty())
            telPers = null;
        
        
        java.sql.Date fechasql = new java.sql.Date(fecha.getTime().getTime());
        
        String actualizar = "UPDATE logistica SET NOMBRE = '" + nombre + "', APELLIDO1 = '" + apellido1 + "', APELLIDO2 = '" + apellido2 + "', CALLE = '" + calle + "', PORTAL = " + portal + ", PISO = " + piso + ", MANO = '" + mano + "', TELEMPRESA = '" + telMovil + "', TELPERSONAL = " + telPers + ", SALARIO = " + salario + ", FECHANAC = TO_DATE('" + fechasql + "','YYYY-MM-DD')";
        String borrar = "DELETE FROM administracion WHERE DNI = '" + dni + "'";
        String crear = "INSERT INTO logistica (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) VALUES('" + dni + "','" + nombre + "','" + apellido1 + "','" + apellido2 + "','" + calle + "'," + portal + "," + piso + ",'" + mano + "','" + telMovil + "'," + telPers + ",TO_DATE('" + fechasql + "','YYYY-MM-DD')," + salario + "," + ejerciciofase2.EjercicioFase2.guardarCentro() + ")";
                
        try{
            GenericoBD.abrirConexion();
            Statement sentencia = GenericoBD.conexion().createStatement();
            if(PersonaBD.cargo().compareToIgnoreCase(opc) == 0){
                sentencia.executeUpdate(actualizar);
                sentencia.executeUpdate("COMMIT");
            }
            else{
                sentencia.executeUpdate(crear);
                sentencia.executeUpdate(borrar);
                sentencia.executeUpdate("COMMIT");
            }
            GenericoBD.cerrarConexion();
        }
        catch(Exception e){
            javax.swing. JOptionPane . showMessageDialog (null ," Problemas"+e. getMessage ());
        }
    }
}
