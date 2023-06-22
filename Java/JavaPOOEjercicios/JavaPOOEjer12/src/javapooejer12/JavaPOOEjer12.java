package javapooejer12;

import Entidad.Persona;
import Servicios.PersonaServicio;
import java.time.LocalDate;

public class JavaPOOEjer12 {

    public static void main(String[] args) {
        LocalDate cd = LocalDate.now();
        System.out.println("Current date: " + cd);
        PersonaServicio ps = new PersonaServicio();
        Persona p = ps.crearPersona();

        int edad = ps.calcularEdad(p, cd.getYear());

        System.out.println("La persona es menor de edad " + ps.menorQue(edad));

        ps.mostrarPersona(p);
    }

}
