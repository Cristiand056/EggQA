package Servicios;

import Data.ListaAlquiler;
import Data.ListaPeliculas;
import Entidades.Alquiler;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class AlquilerService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private float pf;

    public Alquiler CrearAlquiler() {
        Alquiler a = new Alquiler();
        System.out.println("Ingrese el id de la pelicula");
        a.setPeliculaAlquilada(ListaPeliculas.listaPeliculas[leer.nextInt() - 1]);
        System.out.println("ingrese los numeros de dias a alquilar");
        a.setFechaInicio(LocalDate.now());
        a.setFechaFin(LocalDate.now().plusDays(leer.nextInt()));
        a.setPrecio(ListaAlquiler.precio);
        return a;
    }

    public void ListarAlquileres(Alquiler[] al) {
        System.out.println("Alquileres realizados");
        for (int i = 0; i < ListaAlquiler.maxListaAlquiler; i++)
        {
            System.out.println("al[i].toString()");
        }
    }

    public void AlquilerPorFecha(LocalDate fb, Alquiler[] la) {

        for (Alquiler a : la)
        {
            if (a.getFechaInicio() == fb)
            {
                System.out.println("El alquiler sí se encuentra ");
            } else
            {
                System.out.println("El alquiler no se encuentra");
            }
        }
        /*if (Arrays.asList(la).contains(fb))
        {
            System.out.println("El alquiler sí se encuentra ");
        } else
        {
            System.out.println("El alquiler no se encuentra");
        }*/
    }

    public float totalDelservicio(Alquiler a) {
        int d = a.getFechaFin().getDayOfMonth() - a.getFechaInicio().getDayOfMonth();
        pf = (float) a.getPrecio() / d;

        if (d <= 3 & d > 0)
        {
            return pf;
        } else
        {
            if (d != 0)
            {
                return (float) (pf + pf * 0.1);
            } else
            {
                return 0;
            }
        }

    }
}
/*
public void buscarTituloPelicula(){
    System.out.println("Escribe el titulo para buscar: ");
    String buscar = leer.nextLine();
    if (Arrays.asList(ListaPeliculas.listaPeliculas).contains(buscar)) {
        System.out.println("La pelicula está en el catálogo");
    }
    else {
        System.out.println("No se encontró en el catálogo");
    }
    
}

public void buscarGeneroPelicula(){
    System.out.println("Escribe el genero de la pelicula: ");
    String buscar = leer.nextLine();
    if (Arrays.asList(ListaPeliculas.listaPeliculas).contains(buscar)) {
        System.out.println("Sí hay peliculas del genero "+buscar);
    }
    else {
        System.out.println("No hay peliculas del genero"+buscar);
    }
    
}
 */
