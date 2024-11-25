package models;

/**
 *
 * @author angelsn
 */
import java.util.Date;
import java.util.Objects;

public class Integrante {
    private String id;
    private String nombre;
    private String apellido;
    private String rol;
    private Date fechaIngreso;
    private Date fechaSalida; 
    private boolean estadoActivo;

    public Integrante() {}

    public Integrante(String id, String nombre, String apellido, String rol, Date fechaIngreso, Date fechaSalida, boolean estadoActivo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoActivo = estadoActivo;
    }

    public Integrante(String nombre, String apellido, String rol, Date fechaIngreso, Date fechaSalida, boolean estadoActivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estadoActivo = estadoActivo;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Integrante other = (Integrante) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Integrante{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", rol=" + rol + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", estadoActivo=" + estadoActivo + '}';
    }
}
