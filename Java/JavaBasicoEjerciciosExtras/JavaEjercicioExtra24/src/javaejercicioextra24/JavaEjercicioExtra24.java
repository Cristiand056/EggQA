package javaejercicioextra24;
import java.util.Scanner;

public class JavaEjercicioExtra24 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int n, f;
        n = leer.nextInt();

        for(int i=0; i < n;i++){
            f = fibonacci(i);
            System.out.println("n = "+i+":  "+f);
        }
    }
    public static int fibonacci(int n){
        int salida;

        if(n == 1 || n == 0){
            salida = 1;
            return salida;
        }
        else{
            salida = fibonacci(n-1) + fibonacci(n-2);
            return salida;
        }
           
    }
}
