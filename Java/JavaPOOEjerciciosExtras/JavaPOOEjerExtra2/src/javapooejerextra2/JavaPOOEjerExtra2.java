/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooejerextra2;

import Entidad.Puntos;
import Service.PuntosService;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaPOOEjerExtra2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        PuntosService ps = new PuntosService();

        System.out.println("Punto 1");
        Puntos p1 = ps.CrearPunto(leer.nextInt(), leer.nextInt());
        System.out.println("Punto 2");
        Puntos p2 = ps.CrearPunto(leer.nextInt(), leer.nextInt());

        System.out.println("La distancia entre los puntos es: " + ps.DistanciaPuntos(p1, p2));
    }
    
}
