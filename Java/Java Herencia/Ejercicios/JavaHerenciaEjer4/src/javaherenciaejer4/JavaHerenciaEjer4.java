/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejer4;

import javaherenciaejer4.interfaces.Circulo;
import javaherenciaejer4.interfaces.Rectangulo;

/**
 *
 * @author USER
 */
public class JavaHerenciaEjer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c1 = new Circulo(1.8);
        Rectangulo r1 = new Rectangulo(10d, 15d);
        System.out.println("Area Circulo: " + c1.area());
        System.out.println("perimetro Circulo: " + c1.perimetro());
        System.out.println("Area Rectangulo: "+r1.area());
        System.out.println("perimetro Rectangulo: "+r1.perimetro());
    }

}
