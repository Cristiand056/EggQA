package javaejercicioextra11;
import java.util.Scanner;

public class JavaEjercicioExtra11 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num, cont = 1, aux;
         num = leer.nextInt();
         while(true){
             
             aux = Math.round(num / 10);
             System.out.println(aux);
             cont++;
             num = aux;
             if(Math.round(num/10) % 10 ==0){
                 break;
             }
         }
         System.out.println("El número de digitos es: "+cont);
    }
    
}
