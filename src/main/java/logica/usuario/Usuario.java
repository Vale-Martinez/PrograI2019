/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.usuario;

/**
 *
 * @author Dell
 */
public class Usuario implements Comparable<Usuario> {
    
    private int cedula, telefono, edad;
    private String FechaNacimiento, nombre, direccion, email;
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario(int cedula, int telefono, int edad, String FechaNacimiento, String nombre, String direccion, String email) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.edad = edad;
        this.FechaNacimiento = FechaNacimiento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    @Override
    public int compareTo(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
