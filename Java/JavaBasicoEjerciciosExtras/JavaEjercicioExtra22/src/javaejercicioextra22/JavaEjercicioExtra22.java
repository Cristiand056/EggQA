package javaejercicioextra22;
import java.util.Scanner;


public class JavaEjercicioExtra22 {
    static Scanner  leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n, m;
        n = leer.nextInt();
        m = leer.nextInt();
        int [][] matriz = new int[n][m];

        matriz = crearMatriz(n, m);

        System.out.println("La suma de los elementos de la matriz es: "+sumElementosVector(matriz));
    }
    public static int[][] crearMatriz(int n, int m){
        int[][] matriz = new int [n][m];
        
        for(int i=0; i < n;i++){
            for(int j=0; j < m; j++){
              matriz[i][j] =(int) (Math.random()*100);  
            }          
        }
        return matriz;
    }
    public static int sumElementosVector(int[][] matriz){
        int sum = 0;
        
        for(int i=0; i < matriz.length ;i++){
            for(int j = 0; j< matriz[0].length; j++){
                sum += matriz[i][j];
            }     
        }
        return sum;
    }
}
