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
public class Polideportivo extends Edificio {

    private String nombre;
    private Boolean techado;

    public Polideportivo(){
    }

    public Polideportivo(String nombre, Boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }
    
    public String esTechado(){
        String valor = "";
        if(techado){
            valor = "Sí es techado";
        }else{
            valor = "No es techado";
        }
        return valor;
    }

    @Override
    public Double calcularArea() {
        return super.calcularArea(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double calcularSuperficie() {
        return super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre= " + nombre + ", techado= " + techado + ", ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

}
