package models;

import java.util.Objects;

/**
 *
 * @author Kevin
 */
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private String imagenPath;

    public Usuario() {}

    public Usuario(String id, String nombre, String apellido, String correo, String contraseña, String imagenPath) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.imagenPath = imagenPath;
    }

    public Usuario(String nombre, String apellido, String correo, String contraseña, String imagenPath) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.imagenPath = imagenPath;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.apellido);
        hash = 41 * hash + Objects.hashCode(this.correo);
        hash = 41 * hash + Objects.hashCode(this.contraseña);
        hash = 41 * hash + Objects.hashCode(this.imagenPath);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        return Objects.equals(this.imagenPath, other.imagenPath);
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" +
                apellido + ", correo=" + correo + ", contrase\u00f1a=" + 
                contraseña + ", imagenPath=" + imagenPath + '}';
    }
}
