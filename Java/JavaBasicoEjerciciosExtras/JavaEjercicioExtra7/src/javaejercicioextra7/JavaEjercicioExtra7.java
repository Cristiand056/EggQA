package javaejercicioextra7;
import java.util.Scanner;

public class JavaEjercicioExtra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);      
        int cant, max=0, min=0, cont=0, sum=0, num;
        float prom;
        
        System.out.println("Ingrese la cantidad de numeros");
        cant = leer.nextInt();
        
        while(cont < cant){
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            sum += num;
            if (max < num){
                max = num;
            }
             if (num < min || num == 0 || cont==0){
                min = num;
            }
            cont++;
        }
        
        /*do{
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            sum += num;
            if (max < num){
                max = num;
            }
            if (num < min || num == 0 || cont==0){
                min = num;
            }
            cont++;
        }while(cont < cant);*/
        if(cant != 0){
            prom = sum/cant;
            System.out.println("El promedio es: "+prom);
            System.out.println("El mayor es: "+max);
            System.out.println("El menor es: "+min);
        }else{
            System.out.println("La cantidad es incorrecta ");
        }     
    }
    
}
