package javaejercicio8;
import java.util.Scanner;

public class JavaEjercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase=leer.nextLine();
        
        if (frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
