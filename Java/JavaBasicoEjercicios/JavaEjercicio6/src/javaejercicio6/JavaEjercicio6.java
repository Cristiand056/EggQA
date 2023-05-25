package javaejercicio6;
import java.util.Scanner;

public class JavaEjercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("Es Par");
        }else{
            System.out.println("Es Impar");
        }
        
    }
    
}
