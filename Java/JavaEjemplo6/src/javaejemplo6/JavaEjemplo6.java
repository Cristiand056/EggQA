/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo6;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class JavaEjemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        int num1, num2;
        
        System.out.println("Ingrese el número 1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el número 2: ");
        num2 = leer.nextInt();
        
        if(num1 > 25 & num2 > 25) {
             System.out.println("Los dos son mayores que 25");
        }
        else if(num1 > 25){
            System.out.println("El número 1 es mayor a 25");
        }
        else if(num2 > 25){
            System.out.println("El número 2 es mayor a 25");
        }
        else{
             System.out.println("Ninguno es mayor a 25");
        }
    }
    
}
