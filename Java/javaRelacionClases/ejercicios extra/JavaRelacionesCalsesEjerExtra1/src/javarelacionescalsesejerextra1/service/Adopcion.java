/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionescalsesejerextra1.service;

import java.util.ArrayList;

import javarelacionescalsesejerextra1.entities.Perro;
import javarelacionescalsesejerextra1.entities.Persona;

/**
 *
 * @author USER
 */
public class Adopcion {
    
    private ArrayList<Perro> perrosAdoptados = new ArrayList<>();
    private ArrayList<Persona> duenios = new ArrayList<>();
    
    public void adoptarPerro(Perro p, Persona per){
        if(!perrosAdoptados.contains(p)){
            per.setPerro(p);
            perrosAdoptados.add(p);
            duenios.add(per);
        }else{
            System.out.println("El perro ya tiene dueño");
        }
    }
    
    public void mostrarDuenios(){
        duenios.forEach((e)->
                System.out.println(e.toString())
        );
    }
    
    public void mostrarPerrosLibres(ArrayList<Perro> p){
        System.out.println("Perros libres");
        for (Perro perro : p)
        {
            if(!perrosAdoptados.contains(perro)){
                System.out.println(perro.toString());
            }
        }
    }
    
    public int buscarPerro(ArrayList<Perro> p, String nombre){
        int salida=0;
        for (Perro perro : p)
        {
            if(perro.getNombre().equals(nombre)){
                salida = p.indexOf(perro);
            }
        }
        return salida;
    }
}
