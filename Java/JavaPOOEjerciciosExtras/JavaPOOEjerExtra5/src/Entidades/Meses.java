package Entidades;

import static Datos.Meses.mesesAnio;
import java.util.Scanner;

public class Meses {

    static private final int I = (int) (Math.random() * 11 + 0);
    public static String mesSecreto = mesesAnio[I];

    public static void adivinarMesSecreto() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (true)
        {
            System.out.println("Ingrese el mes en minusculas");
            System.out.println("mes secreto: " + mesSecreto);
            String mesInput = leer.next();
            mesInput = mesInput.toLowerCase();
            if (mesSecreto.equals(mesInput))
            {
                System.out.println("¡Ha acertado!");
                break;
            } else
            {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo");
            }
        }

    }
}
