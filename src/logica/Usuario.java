/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author leonardo dibiagi
 */
public class Usuario {

    String nombreUsuario = "";
    String apellidoUsuario = "";
    String edadUsuario = "";
    String contraseña = "";
    boolean estadoActivo;
    String emailUsuario ="";
    String dniUsuario="";

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }
    
    
 

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getEdadUsuario() {
        return edadUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setEdadUsuario(String edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", edadUsuario=" + edadUsuario + ", contrase\u00f1a=" + contraseña + ", estadoActivo=" + estadoActivo + '}';
    }

}
