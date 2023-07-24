package utilidades;

import entities.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarDescendenteHora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarAscendenteHora = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarAscendenteTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
     public static Comparator<Pelicula> ordenarAscendenteDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
