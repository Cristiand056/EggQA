package javaejercicioextra6;
import java.util.Scanner;

public class JavaEjercicioExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cant, cont1, cont2;
        float estatura, sum1, prom1, sum2, prom2;
        
        sum1 = 0;
        cont1 = 0;
        sum2 = 0;
        cont2 = 0;
        
        System.out.println("Ingrese la cantidad de personas");
        cant = leer.nextInt();
        
        for(int i=1; i<=cant;i++){
            System.out.println("Ingrese la altura de la persona");
            estatura = leer.nextFloat();
            if (estatura < 1.6){
                sum1 += estatura;
                cont1++;
            }else{
                sum2 += estatura;
                cont2++;
            }
        }
        prom1 = sum1/cont1;
        prom2 = sum2/cont2;
        
        System.out.println("El promedio de las personas menores de 1.6 mts es: "+prom1);
        System.out.println("El promedio de las personas iguales o mayores de 1.6 mts es: "+prom2);
    }
    
}
