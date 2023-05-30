package javaejercicioextra15;
import java.util.Scanner;

public class JavaEjercicioExtra15 {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int num1, num2, op;
         double div ;
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
                 System.out.println("La suma es: "+sumar(num1,num2));
                 break;
               case 2:
                 System.out.println("La resta es: "+restar(num1, num2));
                 break;
               case 3:
                 System.out.println("La multiplicación es: "+multiplicar(num1, num2));
                 break;
               case 4:
                   if (num2 == 0){
                        System.out.println("Error valor incorrecto");
                   }else{
                       div = dividir(num1,num2);
                        System.out.println("La división es: "+div);

                   }              
                 break;
                case 5:
                     
                        System.out.println("Adios!!!!");
                        bandera = true;
                        break;
                     
                   
               default:
                   System.out.println("Opción incorrecta");
            }
                
       }
    }
    public static int sumar(int num1,int num2){
        int sum;
        return sum = num1+num2;
    }
     public static int restar(int num1,int num2){
        int res;
        return res = num1-num2;
    } 
    public static int multiplicar(int num1,int num2){
        int mul;
        return mul = num1*num2;
    }
    public static double dividir(float num1,float num2){
        double div;
        return div = (num1/num2);
    } 
    
}
