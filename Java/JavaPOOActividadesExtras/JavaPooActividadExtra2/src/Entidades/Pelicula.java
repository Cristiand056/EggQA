package Entidades;

public class Pelicula {

    private int id;
    private String titulo;
    private String genero;
    private int anio;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String genero, int anio, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + '}';
    }
    
    

}
