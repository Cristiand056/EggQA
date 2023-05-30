package javaejercicioextra17;
import java.util.Scanner;

public class JavaEjercicioExtra17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int num = leer.nextInt();  
        
        System.out.println(comparar(num));
    }
    public static boolean comparar(int num){
        boolean crit;
        
        if(num == 2 || num == 3 || num==5){
            crit = true;
        }
        else if(num % 2 ==0 || num % 3 == 0 || num % 5 == 0 || num == 1){
            crit = false;
        }
        else{
            crit = true;
        }
        return crit;
    }
}
