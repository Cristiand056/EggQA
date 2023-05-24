package javaejercicioextra3;
import java.util.Scanner;

public class JavaEjercicioExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        

        String letra = leer.nextLine();
           
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("Es vocal");
        }else{
            System.out.println("NO es vocal");
        }
    
    }
    
}
