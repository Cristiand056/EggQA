package javaejercicioextra23;
import java.util.Scanner;

public class JavaEjercicioExtra23 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        String [][] matriz = new String[20][20];
        String word;

        matriz = inicializarMatriz(20, 20);
        //mostrarMatriz(matriz);

        for(int i = 0; i<5; i++){
            System.out.println("Ingrese la palabra "+(i+1)+" esta debe ser minimo 3 caracteres maximo 5");
            word = leer.next();
            matriz = ingresarPlabra(matriz, word);
            
        }
        //mostrarMatriz(matriz);
        matriz = terminarMatriz(matriz);
        System.out.println("Sopa de letras Terminada");
        mostrarMatriz(matriz);
    }
    public static String[][] inicializarMatriz(int n, int m){
        String[][] matriz = new String [n][m];

        for(int i=0; i < n;i++){
            for(int j=0; j < m; j++){              
                matriz[i][j] = "*";
            }          
        }
        return matriz;
    }

    public static String[][] ingresarPlabra(String[][] matriz, String word){
        boolean flag = false;
        int i =  (int) (Math.random()*19);
        int j =  (int) (Math.random()*19);
        System.out.println("I: "+i+" J: "+j);
        String aux ;
        while(!flag){
            

            if (word.length() == 3 & j >= 17){
                j = 17;
            }
            if (word.length() == 5 & j >= 15){
                j = 15;
            }

            if(matriz[i][j] == "*" & matriz[i][j+1] == "*" ){
                for(int k=0; k < word.length(); k++){
                    
                        aux = word.substring(k, k+1);
                        System.out.println("Auxiliar "+aux);
                        matriz[i][j+k] = aux;
                    
                }
                System.out.println("Se ingreso la palabra corectamente");
                flag = true;
            }else{
                j =  (int) (Math.random()*19);
                if (word.length() == 3 & j >= 17){
                    j = 17;
                }
                if (word.length() == 5 & j >= 15){
                    j = 15;
                }

            }

        }             
              
        return matriz;
    }

    public static String[][] terminarMatriz(String[][] matriz){
        int aux;

        for(int i=0; i < matriz.length;i++){
            for(int j=0; j < matriz[0].length; j++){
                if(matriz[i][j]=="*"){
                    aux = (int) (Math.random()*10);
                    matriz[i][j] =  Integer.toString(aux);
                }
                
            }          
        }
        return matriz;
    }

    public static void mostrarMatriz(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
