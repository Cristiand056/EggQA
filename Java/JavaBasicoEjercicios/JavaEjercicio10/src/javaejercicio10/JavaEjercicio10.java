package javaejercicio10;
import java.util.Scanner;

public class JavaEjercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, sum, input;
        
        limite = leer.nextInt();
        sum = 0;
        
        while(limite > sum){
            System.out.println("La sumatoria esta en: "+sum+" ingrese un número para pasar el limite");
            input = leer.nextInt();
            sum += input;
        }
        System.out.println("Limite pasado");
    }
    
}
