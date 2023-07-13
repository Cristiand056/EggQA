package services;

import Entidades.Rutina;
import java.util.ArrayList;

public class ServicioRutina {

    private ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

    public void crearRutinas(Rutina r) {
        rutinas.add(r);
        System.out.println("Rutina Agregada");

    }

    public void obtenerRutinas() {
        System.out.println("Lista de las Rutinas");
        for (Rutina r : rutinas)
        {
            System.out.println(r.toString());
        }
    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        for (Rutina r : rutinas)
        {
            if (r.getId() == id)
            {
                r.setNombre(nombre);
                r.setDuracion(duracion);
                r.setNivelDificultad(nivelDificultad);
                r.setDescripcion(descripcion);
            }
        }
    }

    public void eliminarRutina(int id) {
        for (int i = 0; i < rutinas.size(); i++)
        {
            if (rutinas.get(i).getId() == id)
            {
                rutinas.remove(i);
            }
        }
    }
}
