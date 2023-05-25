/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo8ciclos;
import java.util.Scanner;

public class JavaEjemplo8Ciclos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont, sum;
        String asteriscos;
        
        //Ejemplo 8
        /*while (true) {
             System.out.println("Ingrese la nota de 0 a 10");
             num = leer.nextInt();
             if(num >= 0 & num <= 10){
                 break;
             }
             else{
                 System.out.println("Valor incorrecto ingreselo de nuevo");
             }
        }*/
        
         //Ejemplo 9
        cont = 0;
        sum = 0;
        /*do{
            System.out.println("Ingrese un número, con el número 0 se finalizara el ciclo");
             num = leer.nextInt();
             if(num >= 0){
                 sum = sum + num;
             }
             cont++;
             if(num==0){
                 System.out.println("Se capturo un cero");
             }
        } while(num != 0 & cont < 20);
        System.out.println("La suma total fue: "+sum);*/
        
         //Ejemplo 10
        asteriscos = "";
        for(int i = 0;  i < 4; i++){
            System.out.println("Ingrese un número");
             num = leer.nextInt();
             for(int j = 0; j < num; j++){
                 asteriscos = asteriscos+"*";
             }
             System.out.println(num+" "+asteriscos);
             asteriscos = "";
        }
    }
    
}
