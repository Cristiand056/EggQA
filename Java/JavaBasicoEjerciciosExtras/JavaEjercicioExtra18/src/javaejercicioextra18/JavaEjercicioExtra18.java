package javaejercicioextra18;
import java.util.Scanner;

public class JavaEjercicioExtra18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int [] vector = new int[n];
        vector = crearVector(n);
        System.out.println("La sumatoria del vector es: "+sumElementosVector(vector));
        
    }
    public static int[] crearVector(int n){
        int[] vector = new int [n];
        Scanner leer = new Scanner(System.in);
        for(int i=0; i < n;i++){
            vector[i] = leer.nextInt();
        }
        return vector;
    }
    public static int sumElementosVector(int[] vector){
        int sum = 0;
        
        for(int i=0; i < vector.length ;i++){
            sum += vector[i];
        }
        return sum;
    }
}
