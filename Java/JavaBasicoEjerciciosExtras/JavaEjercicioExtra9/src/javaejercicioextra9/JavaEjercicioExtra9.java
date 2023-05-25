package javaejercicioextra9;
import java.util.Scanner;

public class JavaEjercicioExtra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int divisor, dividendo, residuo, cosiente=0;
         
         dividendo = leer.nextInt();
        divisor = leer.nextInt();
         
        residuo = dividendo - divisor; 
        while(divisor >1 & dividendo >1 & residuo > divisor ){
            
            residuo = dividendo - divisor; 
            cosiente++;
            dividendo = residuo;
           
        }
        System.out.println("El residuo es "+residuo+" y el cosiente es: "+cosiente);
    }
    
}
