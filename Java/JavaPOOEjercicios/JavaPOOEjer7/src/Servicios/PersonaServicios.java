package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona CrearPersona() {
        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;

        System.out.println("Ingrese el nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro)");
        sexo = leer.nextLine();
        System.out.println("Ingrese la peso");
        peso = leer.nextFloat();
        System.out.println("Ingrese la altura");
        altura = leer.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
}
