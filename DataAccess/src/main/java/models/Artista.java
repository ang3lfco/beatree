package models;

import java.util.Objects;

/**
 *
 * @author Kevin
 */
public class Artista {
    private String id;
    private String nombre;
    private String tipo;
    private String imagenPath;
    private String genero;
    private List<Integrante> integrantes;

    
    public Artista() {
    
    }

    public Artista(String id, String nombre, String tipo, String imagenPath, String genero, List<Integrante> integrantes) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenPath = imagenPath;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    public Artista(String nombre, String tipo, String imagenPath, String genero, <any> integrantes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagenPath = imagenPath;
        this.genero = genero;
        this.integrantes = integrantes;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagenPath() {
        return imagenPath;
    }

    public void setImagenPath(String imagenPath) {
        this.imagenPath = imagenPath;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + Objects.hashCode(this.tipo);
        hash = 79 * hash + Objects.hashCode(this.imagenPath);
        hash = 79 * hash + Objects.hashCode(this.genero);
        hash = 79 * hash + Objects.hashCode(this.integrantes);
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
        final Artista other = (Artista) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.imagenPath, other.imagenPath)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        return Objects.equals(this.integrantes, other.integrantes);
    }

    @Override
    public String toString() {
        return "Artista{" + "id=" + id + ", nombre=" + nombre + ", tipo=" +
                tipo + ", imagenPath=" + imagenPath + ", genero=" + genero + 
                ", integrantes=" + integrantes + '}';
    }
    
    
}
