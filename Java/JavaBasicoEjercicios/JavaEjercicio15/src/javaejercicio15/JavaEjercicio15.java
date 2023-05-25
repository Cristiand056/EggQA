package javaejercicio15;
import java.util.Scanner;

public class JavaEjercicio15 {

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] arreglo = new int[100];
        
        arreglo = crearVector(100);
        
        mostrarVector(arreglo);
        
       
        
    }
    public static int[] crearVector(int longitud){
        int[] vector = new int[longitud]; 
        for(int i = 0; i<longitud;i++ ){
            vector[i] = i;
        }
        
        return vector;
    }
    
    public static void mostrarVector(int[] vector){
        
        for(int i = vector.length-1; i>=0 ;i-- ){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
}
