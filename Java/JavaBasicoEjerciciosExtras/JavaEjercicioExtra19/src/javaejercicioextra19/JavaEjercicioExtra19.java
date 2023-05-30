package javaejercicioextra19;
import java.util.Scanner;

public class JavaEjercicioExtra19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int [] vector1 = new int[n];
        int [] vector2 = new int[n];
        
        vector1 = crearVector(n);
        vector2 = crearVector(n);
        System.out.println(comparar(vector1, vector2));
        
    }
    public static int[] crearVector(int n){
        int[] vector = new int [n];
        Scanner leer = new Scanner(System.in);
        for(int i=0; i < n;i++){
            vector[i] = leer.nextInt();
        }
        return vector;
    }
    public static boolean comparar(int[] v1, int[] v2){
        boolean b=false;
        
        for(int i=0; i < v1.length ;i++){
            if(v1[i] == v2[i] ){
                b = true;
            }
            else{
                b = false;
                break;
            }
             
        }
        return b;
    }
}
