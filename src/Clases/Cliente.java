
package Clases;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String Direccion;
    private String Dni;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String apellido, String Direccion, String Dni, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Direccion = Direccion;
        this.Dni = Dni;
        this.telefono = telefono;
        this.correo = correo;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void incluir(){
        
    }
    public void modificar(){
        
    }
    public void eliminar(){
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
