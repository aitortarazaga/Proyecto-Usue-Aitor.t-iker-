

package ejerciciofase2;

import Clases.*;
import Vistas.*;
import java.util.ArrayList;
import java.util.Calendar;

public class EjercicioFase2 {

    private static Cambio ca;
    private static Centro ce;
    private static NuevaPersona np;
    private static boolean nuevo;
    private static int id;
    private static Opcion op;
    private static boolean opc;
    private static String Dni;
    private static boolean visualizar;
    private static NuevoCentro nc;
    private static Persona per;
    private static String cargo;
    private static String centro;
    private static boolean nm;
    private static Menu menu;
    private static Parte parte;
    
    public static void main(String[] args) {
        
        crearCentro();
        
    }
    
    public static void crearCentro(){
        ce = new Centro();
        ce.setLocationRelativeTo(null);
        ce.setVisible(true);
    }
    
    public static void cerrarCentro(){
        ce.dispose();
    }
    
    public static void mostrarCambio(){
        ca = new Cambio();
        ca.setVisible(true);
        ca.setLocationRelativeTo(null);
    }
    
    public static void mostrarNuevo(){
        np = new NuevaPersona(ca,true);
        np.setLocationRelativeTo(null);
        np.setVisible(true);
    }
    
    public static void nuevoTrabajador(){
    nuevo = true;
    np.dispose();
    }
    
    public static boolean crearNuevo(){
        return nuevo;
    }
    
    public static void limpiarDni(){
    nuevo = false;
    np.dispose();
    }
    
    public static void idCentro(int n){
        id = n;
    }
    
    public static int guardarCentro(){
        return id;
    }
    
    public static void mostrarOpcion(){
        op = new Opcion(ca,true);
        op.setLocationRelativeTo(null);
        op.setVisible(true);
    }
    
    public static void cerrarOpcion(){
        op.dispose();
    }
    
    public static void guardarBoolean(boolean o){
        opc = o;
    }
    
    public static boolean o(){
        return opc;
    }
    
    public static void reiniciarCambio(){
        ca.dispose();
        ca = new Cambio();
        ca.setLocationRelativeTo(null);
        ca.setVisible(true);
    }
    
    public static void reiniciarBoolean(){
        opc = false;
    }
    
    public static void cerrarCambio(){
        ca.dispose();
        ce = new Centro();
        ce.setLocationRelativeTo(null);
        ce.setVisible(true);
    }
    
    public static void guardarDni(String dni) {
        Dni = dni;
    }
    
    public static String recogerDni(){
        return Dni;
    }
    
    public static java.util.Calendar getFechaNac(){
         // java.util.Date a Calendar
        java.util.Calendar cal = Calendar.getInstance();
        cal.setTime(PersonaBD.getPersona().getFecha_nac());
        return cal;
     }
    
    public static void visualizar(boolean a){
        visualizar = a;
    }
    
    public static boolean getVisualizar(){
        return visualizar;
    }
    
    public static void crearNc(){
        nc = new NuevoCentro();
        nc.setLocationRelativeTo(null);
        nc.setVisible(true);
    }
    
    public static void cerrarNc(){
        nc.dispose();
    }
    
    public static void setPersona(Persona p){
        per = p;
    }
    
    public static Persona getPersona(){
        return per;
    }
    
    public static void setCargo(String c){
        cargo = c;
    }
    
    public static String getCargo(){
        return cargo;
    }
    
    public static Persona compDni(String dni){
        return PersonaBD.comprobarDni(dni);
    }
    
    public static ArrayList<String> llenarCb(){
        return CentroBD.llenarCb();
    }
    
    public static String llenarNombre(String i){
        return CentroBD.llenarNombre(i);
    }
    
    public static void insertCentro(String nombre, String calle, String numero, String cp, String ciudad, String provincia, String telefono){
        CentroBD.insertCentro(nombre, calle, numero, cp, ciudad, provincia, telefono);
    }
    
    public static void borrarCentro(){
        CentroBD.borrarCentro();
    }
    
    public static void guardarPersona(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        PersonaBD.guardarPersona(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telPers, telMovil, salario, fecha, opc);
    }
    
    public static void editarPersona(String dni, String nombre, String apellido1, String apellido2, String calle, String portal, String piso, String mano, String telPers, String telMovil, String salario, Calendar fecha, String opc){
        PersonaBD.editarPersona(dni, nombre, apellido1, apellido2, calle, portal, piso, mano, telPers, telMovil, salario, fecha, opc);
    }
    
    public static void setCentro(java.lang.Object id){
        String cen = id.toString();
        centro = cen;
    }
    
    public static int getCentro(){
        int cen = Integer.parseInt(centro);
        return cen;
    }
    
    public static void resetearPer(){
        PersonaBD.resetearPer();
    }
    
    public static void editarCentro(String nombre, String calle, String numero, String cp, String ciudad, String provincia, String telefono){
        CentroBD.editarCentro(nombre, calle, numero, cp, ciudad, provincia, telefono);
    }
    
    public static void setNm(boolean o){
        nm = o;
    }
    
    public static boolean getNm(){
        return nm;
    }
    
    public static Centros mostrarCentro(){
        CentroBD.getCentro();
        return CentroBD.getCe();
    }
    
    public static void crearMenu(){
        ca.setVisible(false);
        menu=new Menu();
        menu.setVisible(true);
    }
    
    public static void cerrarMenu(){
        menu.dispose();
        
    }
    
    public static void crearParte(){
        parte=new Parte();
        parte.setVisible(true);
    }
    
    public static void cerrarParte(){
        parte.dispose();
    }
}
