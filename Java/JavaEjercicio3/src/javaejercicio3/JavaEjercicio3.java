package javaejercicio3;
import java.util.Scanner;

public class JavaEjercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        
        frase = leer.nextLine();
        
        System.out.println("La frase en mayúsculas: "+frase.toUpperCase());
        System.out.println("La frase en minusculas: "+frase.toLowerCase());
    }
    
}
