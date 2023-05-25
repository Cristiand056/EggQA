package javaejercicio18;
import java.util.Scanner;

public class JavaEjercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] [] matriz = new int[4][4]; 
        //System.out.println("hola1");
        matriz = crearMatriz(4, 4);
        //System.out.println("hola2");
        mostrarMatriz(matriz);
        matriz =  transpuestaMatriz(matriz);
        System.out.println("Transpuesta");
        mostrarMatriz(matriz);
    }
    public static int[] [] crearMatriz(int N, int M){
        int[][] matriz = new int[N][M]; 
        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz[i].length;j++){
                matriz[i][j] = (int) (Math.random()*10) ;
                //System.out.println("Hoal 3");
            }   
            //System.out.println("hola 4");
        }      
        return matriz;
    }
    public static void mostrarMatriz(int[][] matriz){
        
        for(int i = 0; i<matriz.length ;i++ ){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }  
            System.out.println();
        }
     }
    public static int[] [] transpuestaMatriz(int[][] matriz){
        int[][] matrizAux = new int[matriz.length][matriz[0].length]; 
        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz[i].length;j++){
                matrizAux[j][i] =matriz[i][j] ;
            }   
        }      
        return matrizAux;
    }
}
