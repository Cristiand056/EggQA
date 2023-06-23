package javapooejer14;

import Entidad.Movil;
import Servicios.MovilServicio;

public class JavaPOOEjer14 {

    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();

        Movil m1 = ms.cargarCelular();
    }

}
