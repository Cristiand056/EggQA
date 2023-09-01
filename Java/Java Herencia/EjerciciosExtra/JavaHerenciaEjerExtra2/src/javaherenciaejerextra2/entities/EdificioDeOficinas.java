/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejerextra2.entities;

/**
 *
 * @author USER
 */
public class EdificioDeOficinas extends Edificio {

    private Integer numeroOficinas;
    private Integer cantidadDePersonas;
    private Integer numeroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroOficinas, Integer cantidadDePersonas, Integer numeroPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadDePersonas = cantidadDePersonas;
        this.numeroPisos = numeroPisos;
    }

    public Integer getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(Integer numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(Integer cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public Integer getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(Integer numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public Double calcularArea() {
        return super.calcularArea(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double calcularSuperficie() {
        return super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    public void cantPersonas() {
        int valor;
        valor = numeroOficinas * cantidadDePersonas;
        System.out.println("Hay " + valor + " personas por piso");
        System.out.println("Hay " + (valor * numeroPisos) + " de personas en todo el edificio");

    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numero de oficinas= " + numeroOficinas + ", cantidad de personas= " + cantidadDePersonas + ", numeroPisos=" + numeroPisos + ", ancho= " + ancho + ", alto= " + alto + ", largo= " + largo + '}';
    }

}
