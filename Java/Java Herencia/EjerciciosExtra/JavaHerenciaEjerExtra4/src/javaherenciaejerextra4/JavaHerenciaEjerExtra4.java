package javaherenciaejerextra4;

import javaherenciaejerextra4.data.PersonasData;
import javaherenciaejerextra4.emuns.Cursos;
import javaherenciaejerextra4.entities.Estudiante;

public class JavaHerenciaEjerExtra4 {

    public static void main(String[] args) {
        System.out.println("Lista normal: ");
        mostrar();

        System.out.println("Cambio Estado civil: ");
        PersonasData.Data.get(1).setEstadoCivil("Divorciado");
        mostrar();

        System.out.println("Agragar curso: ");
        Estudiante aux = (Estudiante) PersonasData.Data.get(0);
        aux.matricularCurso(Cursos.Matemtica_2);
        mostrar();

    }

    public static void mostrar() {
        PersonasData.Data.forEach((e)
                -> System.out.println(e.toString())
        );
    }

}
