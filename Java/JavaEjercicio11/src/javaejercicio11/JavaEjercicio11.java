package javaejercicio11;
import java.util.Scanner;

public class JavaEjercicio11 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1, num2, op;
       boolean bandera = false;
       String out;
       System.out.println("Ingrese el número 1");
       num1 = leer.nextInt();
       
       System.out.println("Ingrese el número 2");
       num2 = leer.nextInt();
       
       while(!bandera){
           System.out.println("MENU");
           System.out.println("1. Sumar");
           System.out.println("2. Restar");
           System.out.println("3. Multiplicar");
           System.out.println("4. Dividir");
           System.out.println("5. Salir");
           System.out.println("Elija opción:");
           op = leer.nextInt();
           switch(op){
               case 1:
                 System.out.println("La suma es: "+(num1+num2));
                 break;
               case 2:
                 System.out.println("La resta es: "+(num1-num2));
                 break;
               case 3:
                 System.out.println("La multiplicación es: "+(num1*num2));
                 break;
               case 4:
                   if (num2 == 0){
                        System.out.println("Error valor incorrecto");
                   }else{
                        System.out.println("La división es: "+(num1/num2));
                   }              
                 break;
               case 5:
                   System.out.println("Desea salir (S/N)");
                   out=leer.nextLine();
                   if(out.equals("S")){
                       System.out.println("Adios!!!!");
                       bandera = true;
                       break;
                   }else{
                       continue;
                   }
                   
               default:
                   System.out.println("Opción incorrecta");
           }
                
       }
    }
    
}
