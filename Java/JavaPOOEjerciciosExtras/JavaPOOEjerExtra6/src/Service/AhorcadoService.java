package Service;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private Ahorcado crearJuego() {
        Ahorcado a = new Ahorcado();
        System.out.println("Ingrese la palabra a buscar");
        String palabraABuscarS = leer.next();
        String[] palabraABuscarP = palabraABuscarS.split("");
        a.setPalabraABuscar(palabraABuscarP);
        System.out.println("Ingrese el número de intentos maximos");
        a.setCantJuagdasMax(leer.nextInt());
        return a;
    }

    private int longitud(Ahorcado a) {
        return a.palabraABuscar.length;
    }

    private boolean buscar(String letra, Ahorcado a) {
        return Arrays.asList(a.palabraABuscar).contains(letra);
    }

    private void encontradas(String letra, Ahorcado a) {
        int cont = 0;
        if (buscar(letra, a))
        {
            for (String l : a.palabraABuscar)
            {
                if (l.equals(letra))
                {
                    cont++;
                }
            }

            a.setCantLetrasEncotradas(a.getCantLetrasEncotradas() + cont);
            System.out.println("La letra pertenece a la palabra");
            System.out.println("Número de letras (encontradas, faltantes): " + "(" + a.getCantLetrasEncotradas() + "," + (a.getPalabraABuscar().length - a.getCantLetrasEncotradas()) + ")");
        } else
        {
            System.out.println("La letra NO pertenece a la palabra");
            intentos(letra, a);
        }

    }

    private void intentos(String letra, Ahorcado a) {
        int intentos = a.getCantJuagdasMax();
        if (!buscar(letra, a))
        {
            intentos--;
        }
        a.setCantJuagdasMax(intentos);
    }

    public void juego() {

        Ahorcado a = crearJuego();
        String letra;
        while (a.getCantJuagdasMax() > 0 & a.getCantLetrasEncotradas() < a.getPalabraABuscar().length)
        {
            System.out.println("Ingrese la letra");
            letra = leer.next();

            System.out.println("Longitud de la palabra: " + longitud(a));
            encontradas(letra, a);

            System.out.println("Número de oportunidades restantes: " + a.cantJuagdasMax);
        }

        if (a.cantJuagdasMax == 0)
        {
            System.out.println("Perdio el juego");
        } else
        {
            System.out.println("!Feliciadades¡");

        }

    }
}
