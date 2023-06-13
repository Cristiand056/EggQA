package javapooejer6;

import Entidad.Cafetera;


public class JavaPOOEjer6 {

    public static void main(String[] args) {
        Cafetera c = new Cafetera(50, 20);
        
        c.agregarCafe(50);
        System.out.println(c.getCapacidadActual());
    }
    
}
