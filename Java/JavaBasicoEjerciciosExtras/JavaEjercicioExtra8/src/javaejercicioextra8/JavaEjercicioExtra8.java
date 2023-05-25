package javaejercicioextra8;
import java.util.Scanner;

public class JavaEjercicioExtra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant=0, par=0, imp=0, num;
        
        while(true){
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            
            if (num % 2 == 0){
                par++;
            }else{
                imp++;
            }
            if(num % 5 == 0){
                cant++;
                break;
            }
            cant++;
        }
        System.out.println("La cantidad de pares es: "+par);
        System.out.println("La cantidad de impares es: "+imp);
        System.out.println("La cantidad de números es: "+cant);
    }
    
}
