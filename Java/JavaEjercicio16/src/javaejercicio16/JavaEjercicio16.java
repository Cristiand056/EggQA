package javaejercicio16;
import java.util.Scanner;

public class JavaEjercicio16 {

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, busqueda;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
         int[] vector = new int[n];
        vector = crearVector(n);
        mostrarVector(vector);
        System.out.println("Ingrese el número a busacar en el vector");
        busqueda = leer.nextInt();
        buscar(vector, busqueda);
        
    }
     
     public static int[] crearVector(int longitud){
        int[] vector = new int[longitud]; 
        for(int i = 0; i<longitud;i++ ){
            vector[i] = (int) (Math.random()*10) ;
        }
        
        return vector;
    }
     public static void mostrarVector(int[] vector){
        
        for(int i = 0; i<vector.length ;i++ ){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
     public static void buscar(int[] vector, int c){
         boolean bandera = false;
         int cont = 0;
         String donde="";
         
         for(int i = 0; i<vector.length;i++){
             
             if(vector[i] == c){
                 System.out.println("  "+i+" "+vector[i]);
                 bandera = true;
                 cont++;
                 donde += " "+Integer.toString(i)+" ";      
             }
         }
         if(bandera){
             System.out.println("El número "+c+" sí se encuentra dentro del vector");
             System.out.println("El número "+c+" sí se encuentra en el(los) indice(s) "+donde);
             System.out.println("El número "+c+" se encuentra  "+(cont)+" veces");
         }else{
             System.out.println("El número "+c+" NO se encuantra dentro del vector");
         }
     }
    
}
