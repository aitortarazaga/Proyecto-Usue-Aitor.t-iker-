
package Clases;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import ejerciciofase2.EjercicioFase2;

public class PersonaBD {
    
    private static String cargo;
    private static String dni;
    private static Persona per;
    
    public static Persona comprobarDni(String d){
        dni = d;
        
        if(AdministracionBD.comprobarDniAdm(dni) != null){
            cargo = "administracion";
            per = AdministracionBD.comprobarDniAdm(dni);
        }
        else
            if(LogisticaBD.comprobarDniLog(dni) != null){
                cargo = "logistica";
                per = LogisticaBD.comprobarDniLog(dni);
            }
        else
                cargo = null;
        
        ejerciciofase2.EjercicioFase2.setPersona(per);
        ejerciciofase2.EjercicioFase2.setCargo(cargo);
                
        return per;
    }
    
    public static void guardarPersona(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        
        if(opc.compareToIgnoreCase("administracion") == 0)
            AdministracionBD.guardarAdministracion(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telPers, telMovil, salario, fecha);
        else
            LogisticaBD.guardarLogistica(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telPers, telMovil, salario, fecha);
    }
    
    public static void borrarPersona(){
        
        if(cargo.compareToIgnoreCase("administracion") == 0){
            AdministracionBD.borrarAdministracion(dni);
            per = null;
        }
        else{
            LogisticaBD.borrarLogistica(dni);
            per = null;
        }
    }
    
    public static void editarPersona(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        
        if(opc.compareToIgnoreCase("administracion") == 0)
            AdministracionBD.editarAdministracion(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telPers, telMovil, salario, fecha, opc);
        else
            LogisticaBD.editarLogistica(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telPers, telMovil, salario, fecha, opc);
    }

    public static String cargo(){
        return cargo;
    }
    
    public static Persona getPersona(){
        return per;
    }
    
    public static void resetearPer(){
        per = null;
    }
}
