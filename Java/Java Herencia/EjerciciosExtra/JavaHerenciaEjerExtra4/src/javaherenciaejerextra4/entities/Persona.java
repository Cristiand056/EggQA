package javaherenciaejerextra4.entities;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer cc;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer cc, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cc = cc;
        this.estadoCivil = estadoCivil;
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

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

}
