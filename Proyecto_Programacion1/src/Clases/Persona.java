
package Clases;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Persona {
    private String nombre;
    private String apellido;
    private String contraseña;
    private String usuario;
    private String correo;
    private boolean condicion;
    private boolean error;
    private boolean acceso;
    
    //Variables de conexion
    Conexion con1 = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel model;
    String sql;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.contraseña = "";
        this.usuario = "";
        this.correo = "";
        this.condicion = false;
        this.error = false;
        this.acceso= false;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }
    
    
    public void verificar(){
        String valor, reserva, contra = null;
        
        sql = "Select * from usuario where usuario = '"+usuario+"';";
        
        try{
            cn= con1.getConnection();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            
        
            while(rs.next()){

                valor = rs.getString("usuario");
                if(this.usuario.equals(valor)){
                    error = true;
                }
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        if(error == true){
            
            try{
                cn= con1.getConnection();
                st= cn.createStatement();
                rs= st.executeQuery(sql);
                while(rs.next()){
                contra = rs.getString("contraseña");
                }
                if(contra.equals(contraseña)){
                    acceso = true;
                }else{
                    JOptionPane.showMessageDialog(null, "La contraseña para "+usuario+" es incorrecta");
                }
                
            }catch(Exception ex){
                System.out.println(ex); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "El usuario ingresado no existe");
        }
            
        
        
    }
    
    public void ejecutar(){
        
        sql = "Select usuario from usuario";
        try{
            cn= con1.getConnection();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            String valor, reserva;
        
            while(rs.next()){

                valor = rs.getString("usuario");
                if(this.usuario.equals(valor)){
                    reserva = valor;
                    error = true;
                }

            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        if(error == true){
            JOptionPane.showMessageDialog(null, "El usuario ingresado ya existe");
        }else{
            enviar();
        }
        
        
        
    }
    
    
    private void enviar(){
        
        
        if(nombre.equals("")||apellido.equals("")||contraseña.equals("")||usuario.equals("")||correo.equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar todo lo solicitado, es de caracter obligatorio");
        }else{
            sql = "insert into usuario(usuario, contraseña, nombre, apellido, correo)values('"+usuario+"', '"+contraseña+"', '"+nombre+"', '"+apellido+"', '"+correo+"');";
            
            try{
            
                cn = con1.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Usuario Agregado");    
            
            this.condicion = true;
            
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        
    }
    
    
    
    
    
}
