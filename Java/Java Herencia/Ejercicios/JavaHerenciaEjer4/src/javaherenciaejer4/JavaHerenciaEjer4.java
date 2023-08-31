package javaherenciaejer4;

import javaherenciaejer4.interfaces.Circulo;
import javaherenciaejer4.interfaces.Rectangulo;


public class JavaHerenciaEjer4 {


    public static void main(String[] args) {
        Circulo c1 = new Circulo(1.8);
        Rectangulo r1 = new Rectangulo(10d, 15d);
        System.out.println("Area Circulo: " + c1.area());
        System.out.println("perimetro Circulo: " + c1.perimetro());
        System.out.println("Area Rectangulo: "+r1.area());
        System.out.println("perimetro Rectangulo: "+r1.perimetro());
    }

}
