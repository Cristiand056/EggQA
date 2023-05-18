/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo7switch;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class JavaEjemplo7Switch {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingrese el tipo de motor, que va del 1 al 4");
         int typeEngine = leer.nextInt();
         
         switch(typeEngine){
             case 1:
                 System.out.println("La bomba es una bomba de agua");
                 break;
             case 2:
                  System.out.println("La bomba es una bomba de gasolina");
                  break;
             case 3:
                  System.out.println("La bomba es una bomba de hormigón");
                  break;
             case 4:
                  System.out.println("La bomba es una bomba de pasta alimenticia");
                  break;
             default:
                  System.out.println("Valor no valido");
                 
        }
    }
    
}
