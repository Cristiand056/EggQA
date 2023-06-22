package Servicios;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        Curso c = new Curso();
        System.out.println("nombre");
        c.setNombreCurso(leer.next());
        System.out.println("cant horas");
        c.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("cant dias semana");
        c.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("turno");
        c.setTurno(leer.next());
        System.out.println("precio hora");
        c.setPrecioPorHora(leer.nextFloat());

        c.setAlumnos(cargarAlumnos());

        return c;
    }

    public float calcularGananciaSemanal(Curso c) {
        return c.getCantidadHorasPorDia() * (float) c.getPrecioPorHora() * c.getAlumnos().length * c.getCantidadDiasPorSemana();
    }

    private String[] cargarAlumnos() {
        String[] l = new String[5];

        System.out.println("Ingrese los nombres de los alumnos");
        for (int i = 0; i < 5; i++)
        {
            l[i] = leer.next();
        }
        return l;
    }

}
