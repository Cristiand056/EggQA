package javarelacionescalsesejerextra1;

import java.util.Arrays;
import java.util.Scanner;
import javarelacionescalsesejerextra1.data.Data;
import javarelacionescalsesejerextra1.service.Adopcion;

public class JavaRelacionesCalsesEjerExtra1 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        Adopcion adop = new Adopcion();
        
        adop.mostrarPerrosLibres(Data.perros);
        System.out.println("Ingrese el nombre del perro");
        adop.adoptarPerro(Data.perros.get(adop.buscarPerro(Data.perros, leer.next())) , Data.personas[0]);
        System.out.println("Paso 1");
        adop.mostrarDuenios();
         System.out.println("Ingrese el nombre del perro");
        adop.adoptarPerro(Data.perros.get(adop.buscarPerro(Data.perros, leer.next())), Data.personas[1]);
        System.out.println("Paso 2");
        adop.mostrarDuenios();
         System.out.println("Ingrese el nombre del perro");
        adop.adoptarPerro(Data.perros.get(adop.buscarPerro(Data.perros, leer.next())), Data.personas[1]);
        System.out.println("Paso 3");
        adop.mostrarDuenios();
    }
    
}
