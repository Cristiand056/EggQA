package javaejercicio20;

import java.util.Scanner;

public class JavaEjercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        matriz = crearMatriz(3, 3);
        mostrarMatriz(matriz);
        magico(matriz);
    }

    public static int[][] crearMatriz(int N, int M) {
        int[][] matriz = new int[N][M];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.println("Item " + i + ", " + j);
                matriz[i][j] = leer.nextInt();
                //System.out.println("Hoal 3");
            }
            //System.out.println("hola 4");
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void magico(int[][] matriz) {
        int contH, contV, contD, base;
        boolean bandera = false;
        contH = 0;
        contV = 0;
        contD = 0;
        base = 0;
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if(i==j){
                    contD += matriz[i][j];
                }
                contH += matriz[i][j];
                contV += matriz[j][i];
            }
            if( i ==0)
            {
                if(contH == contV){
                    base = contH;
                    bandera = true;
                        
                }        
            }else{
                if(i == matriz.length-1){
                    if(base == contD){
                        bandera = true;
                    }else{
                        if(base == contH & base == contV){
                            bandera = true;                        
                        }else{
                            bandera = false;
                            break;
                        }
                    
                    }
                }
            }
            contH = 0;
            contV = 0; 
        }
        
        if(bandera){
            System.out.println("Tiene magia");
        }else{
            System.out.println("NO Tiene magia");
        }
    }

}
