package javaejercicio9;
import java.util.Scanner;

public class JavaEjercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        
        if(frase.startsWith("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
