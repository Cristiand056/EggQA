package javaejercicio17;
import static java.lang.Math.round;
import java.util.Scanner;

public class JavaEjercicio17 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        vector = crearVector(n);
        mostrarVector(vector);
        contarDigitos(vector);
    }
    public static int[] crearVector(int longitud){
        int[] vector = new int[longitud]; 
        for(int i = 0; i<longitud;i++ ){
            vector[i] = (int) (Math.random()*100000) ;
        }
        
        return vector;
    }
    public static void mostrarVector(int[] vector){
        
        for(int i = 0; i<vector.length ;i++ ){
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
    public static void contarDigitos(int[] vector){
        int cont, num, aux, cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        
        for(int i = 0; i<vector.length;i++){
            num = vector[i];
            cont = 1;
            while(round(num/10) != 0){
                aux = round(num/10);
                num = aux;
                cont++;
            }
            switch(cont){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                 case 3:
                    cont3++;
                    break;
                 case 4:
                    cont4++;
                    break;
                 case 5:
                    cont5++;
                    break;
            }
            
        }
        System.out.println("La catidad de números con 1 dijito es: "+cont1);
        System.out.println("La catidad de números con 2 dijitos es: "+cont2);
        System.out.println("La catidad de números con 3 dijitos es: "+cont3);
        System.out.println("La catidad de números con 4 dijitos es: "+cont4);
        System.out.println("La catidad de números con 5 dijitos es: "+cont5);
    }
}
