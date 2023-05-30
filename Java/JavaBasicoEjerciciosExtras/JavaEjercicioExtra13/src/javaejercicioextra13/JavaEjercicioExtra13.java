package javaejercicioextra13;
import java.util.Scanner;

public class JavaEjercicioExtra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String salida = "", aux;
        int limite;
        
        limite = leer.nextInt();
        
        for(int i=1; i <= limite;i++){
            salida += Integer.toString(i);
            System.out.println(salida);
        }
        
    }
    
}
