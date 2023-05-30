package javaejercicioextra20;
import java.util.Scanner;

public class JavaEjercicioExtra20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 10;
        int [] v = new int[n];
        
        v = crearVector(v);
        
        mostrarVector(v);
        
        
    }
    public static int[] crearVector(int [] v){
        //System.out.println(v.length);
        int[] ve = new int [v.length];
        Scanner leer = new Scanner(System.in);
        for(int i=0; i < v.length ;i++){
            ve[i] = (int) (Math.random()*100);
        }
        return ve;
    }
    public static void mostrarVector(int [] v){
        //System.out.println(v.length);
        for(int i=0; i < v.length ;i++){
            System.out.print(v[i]+"  "); 
        }
        System.out.println();

    }
}
