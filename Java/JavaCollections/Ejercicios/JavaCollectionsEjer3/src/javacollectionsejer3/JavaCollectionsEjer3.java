/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsejer3;

import services.AlumnoService;

/**
 *
 * @author USER
 */
public class JavaCollectionsEjer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();

        as.crearAlumnos();

        System.out.println("La nota final del alumno es: " + as.notaFinal());

    }

}
