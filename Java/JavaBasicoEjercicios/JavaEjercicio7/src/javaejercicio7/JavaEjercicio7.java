package javaejercicio7;
import java.util.Scanner;

public class JavaEjercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase=leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
