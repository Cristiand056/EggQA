package javaejercicioextra1;
import java.util.Scanner;

public class JavaEjercicioExtra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int input, horas, dias;
        
        input = leer.nextInt();
        
        convertir(input);
        
    }
    public static void convertir(int a){
         int  horas, dias;
        dias =Math.round( a/(60*24));
        horas =Math.round(( a % (60*24))/60);
        
        System.out.println("Los "+a+" segundos, serian, "+dias+" días y "+horas+" horas");
    } 
  
    
}
