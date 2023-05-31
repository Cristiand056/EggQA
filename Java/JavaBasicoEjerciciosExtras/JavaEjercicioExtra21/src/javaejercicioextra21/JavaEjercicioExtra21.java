package javaejercicioextra21;
import java.util.Scanner;

public class JavaEjercicioExtra21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3, n4, es, apro=0, despr=0 ;
        double prom;
        es = 10;

        for(int i = 0; i <es; i++ ){
            System.out.println("Estudiante "+(i+1));
            n1 = leer.nextInt();
            n2 = leer.nextInt();
            n3 = leer.nextInt();
            n4 = leer.nextInt();

            prom = n1*.1+n2*.15+n3*.25+n4*.5;

            if(prom < 7){
                despr++;
            }
            else{
                apro++;
            }
            
        }
        System.out.println("la cantidad de aprobados es: "+apro+" y la cantidad reprobados es: "+despr);
    }
    
}
