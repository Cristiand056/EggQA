package javaejercicioextra5;
import java.util.Scanner;

public class JavaEjercicioExtra5 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int cuota;
       String tipo;
       
       System.out.println("Ingrese el tipo de socio: ");
       System.out.println("A");
       System.out.println("B");
       System.out.println("C");
       tipo = leer.nextLine();
       
       System.out.println("Ingrese el valor del tratamiento");
       cuota = leer.nextInt();
       
       switch(tipo){
           case "A":
               System.out.println("El valor bruto a pagar es: "+cuota);
               System.out.println("El total a pagar con descuento es: "+cuota*.5);
               break;
           case "B":
               System.out.println("El valor bruto a pagar es: "+cuota);
               System.out.println("El total a pagar con descuento es: "+(cuota-cuota*.35));
               break;
            case "C":
               System.out.println("El valor bruto a pagar es: "+cuota);
               System.out.println("El total a pagar con descuento es: "+cuota);
               break;
             default:
                 System.out.println("No exixte es clase de socio");
       
       }
       
       
    }
    
}
