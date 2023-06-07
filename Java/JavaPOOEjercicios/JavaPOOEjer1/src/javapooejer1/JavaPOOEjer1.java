package javapooejer1;
import java.util.Scanner;
 
import Entidad.Libro;

public class JavaPOOEjer1 {
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        Libro l1 = new Libro("123654", "El Quijote", "Servantes", "462");
        
        System.out.println("Ingrese el nombre del usuario");
        l1.CargarLibro(leer.next());

    }
    
}
