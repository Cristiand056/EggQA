package javaejercicio4;
import java.util.Scanner;

public class JavaEjercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float c,f;
        
        System.out.println("Ingrese los grados centigrados");
        c = leer.nextFloat();
        
        f = 32 + (9 * (c/5));
        
        System.out.println("ISu equivalencia en grados Fahrenheit es: "+f+" f");
    }
    
}
