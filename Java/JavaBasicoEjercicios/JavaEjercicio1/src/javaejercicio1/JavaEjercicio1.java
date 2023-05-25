package javaejercicio1;
import java.util.Scanner;

public class JavaEjercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese el numero 1");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el numero 2");
        num2 = leer.nextInt();
        
        System.out.println("La suma es: "+(num1+num2));
    }
    
}
