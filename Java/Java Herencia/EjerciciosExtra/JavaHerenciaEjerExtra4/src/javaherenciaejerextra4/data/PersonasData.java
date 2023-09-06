/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejerextra4.data;

import java.util.ArrayList;
import java.util.Arrays;
import javaherenciaejerextra4.emuns.Cursos;
import javaherenciaejerextra4.emuns.Departamento;
import javaherenciaejerextra4.emuns.NumeroDespacho;
import javaherenciaejerextra4.emuns.Seccion;
import javaherenciaejerextra4.entities.Estudiante;
import javaherenciaejerextra4.entities.Persona;
import javaherenciaejerextra4.entities.PersonalServicio;
import javaherenciaejerextra4.entities.Profesor;

public class PersonasData {

    public static ArrayList<Persona> Data = new ArrayList<>(
            Arrays.asList(
                    new Estudiante("Jose", "Espinoza", 123456, "Soltero", new ArrayList<Cursos>(Arrays.asList(Cursos.Lengua_1))),
                    new Profesor("Romina", "Salazar", 45678, "Casada", "1998", NumeroDespacho.B, Departamento.Ingenieria),
                    new PersonalServicio("Felipe", "Saénz", 1246645, "Soltero", "2003", NumeroDespacho.A, Departamento.Quimica, Seccion.biblioteca)
            )
    );
}
