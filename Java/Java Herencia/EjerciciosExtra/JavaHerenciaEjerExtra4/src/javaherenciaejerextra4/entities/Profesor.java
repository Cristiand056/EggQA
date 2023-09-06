/*
Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
package javaherenciaejerextra4.entities;

import javaherenciaejerextra4.emuns.Departamento;
import javaherenciaejerextra4.emuns.NumeroDespacho;

public class Profesor extends Empleado {

    protected Departamento departamento;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, Integer cc, String estadoCivil, String anioIncorporacion, NumeroDespacho numeroDespacho, Departamento departamento) {
        super(nombre, apellido, cc, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", cc=" + cc + ", estado civil=" + estadoCivil + " año incorparacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho + "departamento=" + departamento + '}';
    }
    
    
}
