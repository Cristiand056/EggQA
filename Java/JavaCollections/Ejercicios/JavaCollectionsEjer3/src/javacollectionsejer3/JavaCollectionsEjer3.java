package javacollectionsejer3;

import services.AlumnoService;

public class JavaCollectionsEjer3 {

    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();

        as.crearAlumnos();

        System.out.println("La nota final del alumno es: " + as.notaFinal());

    }

}
