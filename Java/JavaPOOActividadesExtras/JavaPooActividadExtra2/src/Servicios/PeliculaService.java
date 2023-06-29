package Servicios;

import Data.ListaPeliculas;
import Entidades.Pelicula;
import java.util.Arrays;
import java.util.Scanner;

public class PeliculaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula CrearPelicula() {
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el título");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el genero");
        p.setGenero(leer.next());
        System.out.println("ingrese el año");
        p.setAnio(leer.nextInt());
        System.out.println("Ingrese la duración");
        p.setDuracion(leer.nextInt());

        return p;
    }

    public void listarPeliculas(Pelicula[] lp) {
        System.out.println("Las peliculas disponibles son: ");
        for (int i = 0; i < ListaPeliculas.maxLista; i++)
        {
            System.out.println(lp[i].toString());

        }
    }

    public void buscarPeliculaTitulo(String pb, Pelicula[] lp) {
        System.out.println("Contiene: " + Arrays.asList(lp).contains(pb));
        for (Pelicula p : lp)
        {
            if (p.getTitulo().equals(p))
            {
                System.out.println("La pelicula sí se encuentra  en el catalogo");
                break;
            } else
            {
                System.out.println("La pelicula no se encuentra  en el catalogo");
            }

        }
        /*if (Arrays.asList(lp).contains(pb))
        {
            System.out.println("La pelicula sí se encuentra  en el catalogo");
        } else
        {
            System.out.println("La pelicula no se encuentra  en el catalogo");
        }*/
    }

    public void buscarPeliculaGenero(String pb, Pelicula[] lp) {
        for (Pelicula p : lp)
        {
            if (p.getGenero().equals(p))
            {
                System.out.println("El genero sí se encuentra  en el catalogo");
                break;
            } else
            {
                System.out.println("El genero no se encuentra  en el catalogo");
            }

        }
        /*System.out.println("Contiene: " + Arrays.asList(lp).contains(pb));
        if (Arrays.asList(lp).contains(pb))
        {
            System.out.println("La pelicula sí se encuentra  en el catalogo");
        } else
        {
            System.out.println("La pelicula no se encuentra  en el catalogo");
        }*/
    }
}
