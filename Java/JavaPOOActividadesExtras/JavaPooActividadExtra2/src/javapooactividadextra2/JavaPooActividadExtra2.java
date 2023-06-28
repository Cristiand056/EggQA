package javapooactividadextra2;

import Data.ListaAlquiler;
import Data.ListaPeliculas;
import Entidades.Alquiler;
import Entidades.Pelicula;
import Servicios.AlquilerService;
import Servicios.PeliculaService;
import java.time.LocalDate;
import java.util.Scanner;

public class JavaPooActividadExtra2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    static PeliculaService ps = new PeliculaService();
    static AlquilerService as = new AlquilerService();

    public static void main(String[] args) {
        boolean bandera = false;
        while (!bandera)
        {
            System.out.println("Ingrese 1: para cargar peliculas");
            System.out.println("Ingrese 2: para listar las peliculas disponibles");
            System.out.println("Ingrese 3: para crear un alquiler");
            System.out.println("Ingrese 4: para listar los alquileres");
            System.out.println("Ingrese 5: para buscar peliculas por titulo");
            System.out.println("Ingrese 6: para buscar peliculas por genero");
            System.out.println("Ingrese 7: para buscar alquileres por fecha");
            System.out.println("Ingrese 8: para saber el total a pagar por el alquiler");
            System.out.println("Ingrese 9: para salir");
            int op = leer.nextInt();

            switch (op)
            {
                case 1:
                    Pelicula p = ps.CrearPelicula();
                    break;
                case 2:
                    ps.listarPeliculas(ListaPeliculas.listaPeliculas);
                case 3:
                    Alquiler a = as.CrearAlquiler();
                case 4:
                    as.ListarAlquileres(ListaAlquiler.listaAlquileres);
                case 5:
                    System.out.println("Ingrese el titulo");
                    ps.buscarPeliculaTitulo(leer.next(), ListaPeliculas.listaPeliculas);
                case 6:
                    System.out.println("Ingrese el genero");
                    ps.buscarPeliculaGenero(leer.next(), ListaPeliculas.listaPeliculas);
                case 7:

                    System.out.println("Ingrese el año");
                    int anio = leer.nextInt();
                    System.out.println("Ingrse el mes");
                    int mes = leer.nextInt();
                    System.out.println("Ingrese el dia");
                    int dia = leer.nextInt();
                    LocalDate d = LocalDate.of(anio, mes, dia);
                    as.AlquilerPorFecha(d, ListaAlquiler.listaAlquileres);

                case 8:
                    System.out.println("Ingrese el id del alquiler");
                    as.totalDelservicio(ListaAlquiler.listaAlquileres[leer.nextInt()]);

                case 9:
                    System.out.println("Adios");
                    bandera = true;
            }
        }
    }

}
