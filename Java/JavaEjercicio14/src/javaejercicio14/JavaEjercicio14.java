package javaejercicio14;
import java.util.Scanner;

public class JavaEjercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String moneda;
        float valor;
        
        moneda = leer.nextLine();
        valor = leer.nextFloat();
        conversion(moneda, valor);
    }
    
    public static void conversion(String moneda, float valor){
        if(moneda.equals("lbras")){
            System.out.println(valor+" € son "+(valor*0.86)+" libras");
        }
        if(moneda.equals("$")){
            System.out.println(valor+" € son "+(valor*1.28611)+" $");
        }
        if(moneda.equals("yenes")){
            System.out.println(valor+" € son "+(valor*129.852)+" yenes");
        }
    
    }
    
}
