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
public class Triangulo {

    private int base;
    private int altura;
    private float hipotemusa;

    public Triangulo(int base, int altura, float hipotemusa) {
        this.base = base;
        this.altura = altura;
        this.hipotemusa = hipotemusa;
    }

    public float perimetro() {
        return (float) base + altura + hipotemusa;
    }

    public float area() {
        return (float) (base * altura) / 2;
    }
}
