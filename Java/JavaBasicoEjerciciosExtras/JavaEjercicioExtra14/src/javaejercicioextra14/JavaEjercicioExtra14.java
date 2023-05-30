package javaejercicioextra14;
import java.util.Scanner;

public class JavaEjercicioExtra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m, sum=0, cont=0;
        float prom;
        n=leer.nextInt();
        
        for(int i=0; i < n;i++){
            m = leer.nextInt();
            for(int j=0; j < m;j++){
                System.out.println("Ingrese edad");
                sum += leer.nextInt();
                cont++;
            }
        }
        prom = sum/cont;
        System.out.println("El promedio es: "+prom);
    }     
}
