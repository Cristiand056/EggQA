package Servicios;

import Entidad.Movil;
import Recursos.Constantes;
import java.util.Scanner;

public class MovilServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {
        Movil m = new Movil();
        System.out.println("Marca");
        m.setMarca(leer.next());
        System.out.println("precio");
        m.setPrecio(leer.nextFloat());
        System.out.println("modelo");
        m.setModelo(leer.next());
        System.out.println("memoria ram");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("almacenamiento");
        m.setAlmacenamiento(leer.nextInt());
        System.out.println("código");
        m.setCodigo(ingresarCodigo());

        return m;

    }

    private int[] ingresarCodigo() {
        int[] l = new int[Constantes.MaximoLista];

        System.out.println("Ingrese los códigos de los móviles");
        for (int i = 0; i < 5; i++)
        {
            System.out.println("móvil " + (i + 1));
            l[i] = leer.nextInt();
        }
        return l;
    }
}
