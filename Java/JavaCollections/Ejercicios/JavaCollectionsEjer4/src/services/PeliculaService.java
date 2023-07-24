package services;

import entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

public class PeliculaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas;
    
    public PeliculaService() {
        this.peliculas = new ArrayList();
    }
    
    public void crearPeliculas() {
        while (true)
        {
            Pelicula p = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula: ");
            p.setTitulo(leer.next());
            System.out.println("Ingrese nombre del director");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duración");
            p.setDuracion(leer.nextDouble());
            
            peliculas.add(p);
            
            System.out.println("Desea ingresar otra pelicula ingrese 's', de lo contrario ingrese cúalquier otra letra ");
            if (!leer.next().equals("s"))
            {
                break;
            }
        }
        System.out.println("Peliculas: ");
        mostrarPeliculas();
        System.out.println("Peliculas mayores a una hora");
        mostrarPeliculasMayorUnaHora();
        System.out.println("Ordenadas de mayor a menor por hora");
        mostrarPeliculasMayoraMenorHora();
        System.out.println("Ordenadas de menor a mayor por hora");
        mostrarPeliculasMenoraMayorHora();
        System.out.println("Ordenadas por titulo orden ascendete ");
        mostrarPeliculasTituloAlpha();
        System.out.println("Ordenadas por director orden ascendete");
        mostrarPeliculasDirectorAlpha();
    }
    
    private void mostrarPeliculas() {
        peliculas.forEach((e) -> System.out.println(e.toString()));
    }
    
    private void mostrarPeliculasMayorUnaHora() {
        for (Pelicula pelicula : peliculas)
        {
            if (pelicula.getDuracion() > 1.0)
            {
                System.out.println(pelicula.toString());
            }
        }
    }
    
    private void mostrarPeliculasMayoraMenorHora() {
        Collections.sort(peliculas, Comparadores.ordenarDescendenteHora);
        peliculas.forEach((e) -> System.out.println(e.toString()));
    }
    
    private void mostrarPeliculasMenoraMayorHora() {
        Collections.sort(peliculas, Comparadores.ordenarAscendenteHora);
        peliculas.forEach((e) -> System.out.println(e.toString()));
    }
    
     private void mostrarPeliculasTituloAlpha(){
         Collections.sort(peliculas, Comparadores.ordenarAscendenteTitulo);
         peliculas.forEach((e) -> System.out.println(e.toString()));
     }
      private void mostrarPeliculasDirectorAlpha(){
         Collections.sort(peliculas, Comparadores.ordenarAscendenteDirector);
         peliculas.forEach((e) -> System.out.println(e.toString()));
     }
     
}
