package javapooactividadextra3.pkg1;

import data.clientesYrutinas;
import services.ServicioCliente;
import services.ServicioRutina;

public class JavaPOOActividadExtra31 {

    public static void main(String[] args) {
        ServicioCliente sc = new ServicioCliente();
        ServicioRutina sr = new ServicioRutina();

        for (int i = 0; i < 5; i++)
        {
            sc.registrarCliente(clientesYrutinas.clientes[i]);
            sr.crearRutinas(clientesYrutinas.rutinas[i]);

        }
        
        sc.obtenerClientes();
        sr.obtenerRutinas();
        
        sc.actualizarCliente(3, "Jose", 52, 1.96, 90, "Mejorar Cardio");
        
        sc.obtenerClientes();
        
        sr.actualizarRutina(1, "burpies", 2, "Alta", "lorem ipsum...");
        sr.obtenerRutinas();
        
        sc.eliminarCliente(2);
        sc.obtenerClientes();
        
        sr.eliminarRutina(4);
        sr.obtenerRutinas();
    }

}
