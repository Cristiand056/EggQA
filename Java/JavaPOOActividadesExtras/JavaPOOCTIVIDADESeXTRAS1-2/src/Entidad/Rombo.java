/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Rombo {

    private double diaMay;
    private double diaMen;
    private double lado;

    public Rombo(double diaMay, double diaMen, double lado) {
        this.diaMay = diaMay;
        this.diaMen = diaMen;
        this.lado = lado;
    }

    public double perimetro() {
        return lado * 4;
    }

    public double area() {
        return (double) (diaMay * diaMen) / 2;
    }
}
