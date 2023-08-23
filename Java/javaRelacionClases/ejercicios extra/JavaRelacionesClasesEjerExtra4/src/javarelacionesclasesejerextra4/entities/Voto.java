/*
Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
package javarelacionesclasesejerextra4.entities;

import java.util.HashSet;

public class Voto {

    private Alumno alumno;
    private HashSet<Alumno> votoAlumno;

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> votoAlumno) {
        this.alumno = alumno;
        this.votoAlumno = votoAlumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotoAlumno() {
        return votoAlumno;
    }

    public void setVotoAlumno(HashSet<Alumno> votoAlumno) {
        this.votoAlumno = votoAlumno;
    }

    @Override
    public String toString() {
        return "alumno={" + alumno + ", "
                + "Alumnos votados= \n" +   
                (votoAlumno.toString())+
                '}';
    }

}
