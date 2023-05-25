package javaejercicio19;
import java.util.Scanner;

public class JavaEjercicio19 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[][]matrizA = {{0,-2,4},{2,0,2},{-4,-2,0}};
       int[][]matrizB = transpuestaMatriz(matrizA);
       
       System.out.println("Matriz A");
       mostrarMatriz(matrizA);
       System.out.println("Matriz B");
       mostrarMatriz(matrizB);
       
        antisimetrica(matrizA, matrizB);
       
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
    
    public static void antisimetrica(int [][] matrizA, int [][] matrizB){
        boolean bandera=false;
        if(matrizA.length == matrizB.length & matrizA[0].length == matrizB[0].length){
             for(int i = 0; i<matrizA.length ;i++ ){
                for(int j = 0; j < matrizA[i].length; j++){
                    if (-1*(matrizA[i][j]) == matrizB[i][j]){
                        bandera = true;
                    }
                    else{
                        bandera = false;
                        break;
                    }
                }  
                if(!bandera){
                    break;
                }
             }
             if(bandera){
                 System.out.println("Es Anti Simetrica");
             }else{
                  System.out.println("NO es Anti Simetrica");
             }
           
        }
    }
    
}
