package data;

import Entidades.Cliente;
import Entidades.Rutina;

public class clientesYrutinas {

    public static final Cliente[] clientes =
    {
        new Cliente(0, "a", 19, 1.76, 85.2, "Masa muscular"),
        new Cliente(1, "b", 45, 1.50, 150.2, "bajar peso"),
        new Cliente(2, "c", 25, 1.90, 100.0, "definición"),
        new Cliente(3, "d", 32, 1.85, 79.2, "fuerza"),
        new Cliente(4, "e", 19, 1.50, 150.2, "bajar peso")
    };
    public static final Rutina[] rutinas =
    {
        new Rutina(0, "a", 2, "Media", "Ipsum lorent..."),
        new Rutina(1, "b", 3, "Alta", "Ipsum lorent..."),
        new Rutina(2, "c", 1, "baja", "Ipsum lorent..."),
        new Rutina(3, "d", 2, "Media", "Ipsum lorent..."),
        new Rutina(4, "e", 1, "Baja", "Ipsum lorent..."),
    };
}
