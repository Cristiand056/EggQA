package javaejemplo13.arreglos;
import java.util.Scanner;

public class JavaEjemplo13Arreglos {

    
    public static void main(String[] args) {
        
        //Ejemplo 13
        Scanner leer = new Scanner(System.in);
        int cantidad;
        
        cantidad = leer.nextInt();
        
        String [] Estudiantes = new String[cantidad];
        
        //Ejercicio 14
        for (int i = 0; i >cantidad-1;i++){
            Estudiantes[i] = leer.nextLine();
        }
    }
}
