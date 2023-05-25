package javaejercicio5;
import java.util.Scanner;

public class JavaEjercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        num = leer.nextInt();
        
        System.out.println("El doble del numero es: "+num*2+" el triple del numero es: "+num*3+" y su raíz cuadrada es: "+Math.sqrt(num));
    }
    
}
