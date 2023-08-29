/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejer1;

import javaherenciaejer1.entities.Animal;
import javaherenciaejer1.entities.Caballo;
import javaherenciaejer1.entities.Gato;
import javaherenciaejer1.entities.Perro;

/**
 *
 * @author USER
 */
public class JavaHerenciaEjer1 {


    public static void main(String[] args) {
        
        // Perro 1
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        // Perro 2
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        //Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato.alimentarse();
        
        //Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
    }
    
}
