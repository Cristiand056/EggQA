package javaejercicioextra16;
import java.util.Scanner;

public class JavaEjercicioExtra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número de personas");
        int np =leer.nextInt();
        
        edad(np);
    }
    
    public static void edad(int n){
        int edad;
        String nombre, salida;
        Scanner leer = new Scanner(System.in);
        
        for(int i =0; i < n;i++){
            System.out.println("Ingrese el nombre");
            nombre = leer.nextLine();
            
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            
            if(edad < 18){
                System.out.println(nombre+" tiene "+edad+" años y es menor de edad");
            }else{
                System.out.println(nombre+" tiene "+edad+" años y es mayor de edad");
            }
            System.out.println("Desea terminar de ingresar datos ingrese 'NO' ");
            salida = leer.next();
            if(salida.equals("NO")){
                break;
            }
        }
    }
    
}
