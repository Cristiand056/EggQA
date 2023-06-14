/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author USER
 */
public class Circulo {
    int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    
     public double perimetro() {
        return (double) 2 * Math.PI * radio;
    }

    public double area() {
        return (double)  Math.PI * Math.pow(radio, 2);
    }
    
}
