/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejer1.entities;

/**
 *
 * @author USER
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato " +this.nombre+" se alimenta de "+this.alimento); 
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
