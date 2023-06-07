package javaejercico21;
import java.util.Scanner;

public class JavaEjercico21 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] Grande = new int[10][10];
        int[][] Pequenia = new int[3][3];
        
        Grande = crearMatrizG(10,10);
        Pequenia = crearMatriz(3,3);
        
        System.out.println("Matriz 10x10");
        mostrarMatriz(Grande);
        System.out.println("Matriz 3x3");
        mostrarMatriz(Pequenia);
        encontrar(Grande,Pequenia);
        
    }
    public static int[][] crearMatriz(int N, int M) {
        int[][] matriz = new int[N][M];
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.println("Item " + i + ", " + j);
                matriz[i][j] = leer.nextInt();
                
            }
            //System.out.println("hola 4");
        }
        return matriz;
    }
    public static int[][] crearMatrizG(int N, int M) {
        int[][] matriz = new int[N][M];
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if(i>=4 & i<=6 & j>=4 & j<=6){
                    System.out.println("Item " + i + ", " + j);
                    matriz[i][j] = leer.nextInt();
                }else{
                    matriz[i][j] =(int)(Math.random()*100);
                }
                            
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
     public static void encontrar(int[][] matrizG, int[][] matrizP){
         int contH,contV,f,c,mCont,iAux, jAux ;
         boolean b;
         contH = 0;
         contV = 0;
         mCont = 0;
         f = 0;
         c = 0;
         b = false;
         
          for (int i = 0; i < matrizG.length; i++)
           {
               System.out.println("I: "+i);
            for (int j = 0; j < matrizG[i].length; j++)
            {
                  if(matrizG[i][j]==matrizP[0][0] & i < 8 & j < 8){
                      System.out.println("J: "+j);
                      iAux = i;
                      jAux = j;
                      if(mCont==0){
                            f = i;
                            c = j;
                      }
                    
                      for(contH=0; contH < 3;contH++){
                          System.out.println("I auxiliar: "+(iAux+contH));
                          
                          for(contV=0; contV < 3; contV++){
                              System.out.println("J auxiliar: "+(jAux+contV));
                              System.out.println("matrizG[iAux][jAux] "+matrizG[iAux+contH][jAux+contV]);
                              System.out.println("matrizP[contH][contV] "+matrizP[contH][contV]);
                             if(matrizG[iAux+contH][jAux+contV]==matrizP[contH][contV]){
                                 b=true;
                             }else{
                                 b=false;
                                 break;
                             }
                          }
                          
                          if(contH==2 & b){
                              mCont++;
                              b = false;
                          }
                          else if (!b){
                              break;
                          }
                      }
                  }
            }
            
        }
          
          if(mCont>=1){
              System.out.println("La matriz 3x3 se encuentra "+mCont+" veces en la matriz 10x10 y la primer concidencia esta en los indices "+f+", "+c);
          }else{
              System.out.println("No hubo considencia");
          }
     
     }
}
