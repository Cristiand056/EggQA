/*
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
package javaherenciaejerextra4.entities;

import javaherenciaejerextra4.emuns.Departamento;
import javaherenciaejerextra4.emuns.NumeroDespacho;
import javaherenciaejerextra4.emuns.Seccion;

public class PersonalServicio extends Empleado {

    protected Seccion seccion;

    public PersonalServicio() {

    }

    public PersonalServicio(String nombre, String apellido, Integer cc, String estadoCivil, String anioIncorporacion, NumeroDespacho numeroDespacho, Departamento departamento, Seccion seccion) {
        super(nombre, apellido, cc, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "personal de servicio{" + "nombre=" + nombre + ", apellido=" + apellido + ", cc=" + cc + ", estadoCivil=" + estadoCivil + " anioIncorporacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho.mumero + " departamento=" + " seccion=" + seccion + '}';
    }

}
