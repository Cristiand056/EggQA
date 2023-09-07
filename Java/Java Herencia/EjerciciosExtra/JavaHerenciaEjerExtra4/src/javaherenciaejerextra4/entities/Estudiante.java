/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
package javaherenciaejerextra4.entities;

import java.util.ArrayList;
import javaherenciaejerextra4.emuns.Cursos;

public class Estudiante extends Persona {

    protected ArrayList<Cursos>cursos;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, Integer cc, String estadoCivil, ArrayList<Cursos> Cursos) {
        super(nombre, apellido, cc, estadoCivil);
        this.cursos = Cursos;
    }

    public ArrayList<Cursos>getCursos() {
        return cursos;
    }

    public void setCurso(ArrayList<Cursos> Cursos) {
        this.cursos = Cursos;
    }
    
    public void matricularCurso(Cursos c){
        cursos.add(c);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", CC=" + cc + ", estado civil=" + estadoCivil + " Cursos=" + cursos + '}';
    }

}
