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

    private void dibujarCuadrado(int xi, int xf, int yi, int yf) {

        for (int i = 0; i <= xf; i++)
        {
            for (int j = 0; j <= yf; j++)
            {
                if (i >= xi & i <= xf & j >= yi & j <= yf)
                {
                    System.out.print(" * ");
                } else
                {
                    System.out.print("   ");
                }
            }
            System.out.println("");

        }
    }

    private void dibujarLinea(int xi, int xf, int yi, int yf) {
        if (xi == xf)
        {
            for (int i = xi; i < 15; i++)
            {
                for (int j = 0; j < 15; j++)
                {
                    if (j >= yi & j <= yf & i == xf)
                    {
                        System.out.print(" * ");
                    } else
                    {
                        System.out.print("   ");
                    }

                }
            }
        }
        if (yi == yf)
        {
            for (int i = xi; i <= xf; i++)
            {
                for (int j = 0; j <= yf; j++)
                {
                    if (yf == j)
                    {
                        System.out.println(" * ");
                    } else
                    {
                        System.out.print("   ");
                    }
                }

            }

        }

    }

    private void dibujarAhorcado(int intentos, int aux) {
        boolean bandera = false;

        if (!bandera)
        {
            int intentosAux = intentos;
            bandera = true;
        }
        //System.out.println("hola entre, intento " + intentos);

        int por = Math.round(((float) intentos / aux) * 100);

        //System.out.println("por " + por);
        if (por >= 80)
        {
            dibujarLinea(0, 1, 6, 6);
        } else if (por < 80 & por >= 70)
        {
            dibujarLinea(0, 1, 6, 6);
            dibujarCuadrado(1, 4, 5, 7);
        } else if (por < 75 & por >= 55)
        {
            dibujarLinea(0, 1, 6, 6);
            dibujarCuadrado(1, 4, 5, 7);
            dibujarLinea(4, 9, 6, 6);
        } else if (por < 55 & por >= 35)
        {
            dibujarLinea(0, 1, 6, 6);
            dibujarCuadrado(1, 4, 5, 7);
            dibujarLinea(4, 6, 6, 6);
            dibujarLinea(6, 6, 4, 8);
        } else if (por < 35 & por > 0)
        {
            dibujarLinea(0, 1, 6, 6);
            dibujarCuadrado(1, 4, 5, 7);
            dibujarLinea(4, 6, 6, 6);
            dibujarLinea(6, 6, 4, 8);
            dibujarLinea(7, 9, 6, 6);
        } else
        {
            dibujarLinea(0, 1, 6, 6);
            dibujarCuadrado(1, 4, 5, 7);
            dibujarLinea(4, 6, 6, 6);
            dibujarLinea(6, 6, 4, 8);
            dibujarLinea(7, 9, 6, 6);
            dibujarLinea(9, 9, 4, 8);
            System.out.println("");
        }

    }

    private void inicializarLetras(int l, Ahorcado a) {
        String[] s = new String[l];
        for (int i = 0; i < l; i++)
        {
            s[i] = " _ ";
        }
        a.setMostrar(s);
    }

    private void llenarLetras(Ahorcado ah, String letra) {
        String[] salida = ah.getMostrar();
        if (ah.cantLetrasEncotradas >= 1)
        {
            for (int i = 0; i < ah.palabraABuscar.length; i++)
            {
                if (ah.palabraABuscar[i].equals(letra))
                {
                    salida[i] = ah.palabraABuscar[i];
                }

            }
            
        }    else{
            inicializarLetras(ah.palabraABuscar.length,ah);
        }     
    }

    private void mostrarLetras(Ahorcado a, String letra) {
        llenarLetras(a, letra);
        
        for(String l : a.getMostrar()){
            System.out.print(l);
        }
        System.out.println("");
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
        int auxIntentos = a.getCantJuagdasMax();
        String letra;
        dibujarAhorcado(a.cantJuagdasMax, auxIntentos);
        mostrarLetras(a, "");
        while (a.getCantJuagdasMax() > 0 & a.getCantLetrasEncotradas() < a.getPalabraABuscar().length)
        {

            System.out.println("Ingrese la letra");
            letra = leer.next();

            System.out.println("Longitud de la palabra: " + longitud(a));
            encontradas(letra, a);

            System.out.println("Número de oportunidades restantes: " + a.cantJuagdasMax);
            dibujarAhorcado(a.cantJuagdasMax, auxIntentos);
            System.out.println("");
            mostrarLetras(a, letra);
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
