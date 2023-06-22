package Servicios;

import Entidad.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la fecha de nacimiento en el orden que se pedira a continuación");
        System.out.println("Ingrese el día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int anio = leer.nextInt();

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        return new Persona(nombre, fecha);
    }

    public int calcularEdad(Persona p, int f) {
        System.out.println("La edad de la persona " + p.getNombre() + " es: " + (f - p.getFechaNacimiento().getYear()));
        return f - p.getFechaNacimiento().getYear();
    }

    public boolean menorQue(int e) {
        if (e < 18)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public void mostrarPersona(Persona p) {
        System.out.println("La persona tiene el nombre de:  " + p.toString());

    }
}
