package javaherenciaejerextra4.entities;

import javaherenciaejerextra4.emuns.NumeroDespacho;

public abstract  class Empleado extends Persona {

    protected String anioIncorporacion;
    protected NumeroDespacho numeroDespacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Integer cc, String estadoCivil, String anioIncorporacion, NumeroDespacho numeroDespacho) {
        super(nombre, apellido, cc, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public String getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(String anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public NumeroDespacho getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(NumeroDespacho numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }


}
