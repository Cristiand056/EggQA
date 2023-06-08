package javapooejer4;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

public class JavaPOOEjer4 {

    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r = rs.crearRectngulo();

        System.out.println(rs.calcularS(r));
        System.out.println(rs.calcularP(r));

        rs.dibujarR(r);
    }

}
