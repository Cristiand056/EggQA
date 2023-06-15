package javapooejer8;

import Entidad.Cadena;
import Servicio.ServicioCadena;

public class JavaPOOEjer8 {

    public static void main(String[] args) {
        ServicioCadena sc = new ServicioCadena();
        Cadena c = sc.CrearCadena();

        System.out.println(sc.contiene(c, "a"));
        sc.compararLongitud(c, "fghjk");
        System.out.println("");

        System.out.println("Revrso " + sc.invertirFrase(c));
    }

}
