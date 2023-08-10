/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package javarelacionclasesejer1;

import javarelacionclasesejer1.datos.data;
import javarelacionclasesejer1.entities.Persona;

/**
 *
 * @author USER
 */
public class JavaRelacionClasesEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 1; i++)
        {
            data.personas[i].setPerro(data.perros[1-i]);
        }
         for (Persona persona : data.personas )
        {
            System.out.println( persona.toString());
           
        }
    }
    
}
