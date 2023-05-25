package javaejercicioextra10;
import java.util.Scanner;

public class JavaEjercicioExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        num1 = (int) (Math.random()*10);
        System.out.println(num1);
        while(true){
            
            System.out.println("Ingrese el número");
            num2= leer.nextInt();
            if(num1 == num2){
                System.out.println("Adivino felicidades");
                break;
            }
            else{
                if(num1>num2){
                    System.out.println("El numero ingresado es menor");
                }else{
                    System.out.println("El numero ingresado es mayor");
                }
            }
            
        }
    }
    
}
