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

    String nombreUsuario = "Pedro";
    String apellidoUsuario = "Fulano";
    String edadUsuario = "32";
    String contraseña = "contraseña";
    boolean estadoActivo;

 

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

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", edadUsuario=" + edadUsuario + ", contrase\u00f1a=" + contraseña + ", estadoActivo=" + estadoActivo + '}';
    }

}
