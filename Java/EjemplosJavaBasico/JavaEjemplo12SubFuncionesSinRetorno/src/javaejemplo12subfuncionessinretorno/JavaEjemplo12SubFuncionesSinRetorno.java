package javaejemplo12subfuncionessinretorno;
import java.util.Scanner;

public class JavaEjemplo12SubFuncionesSinRetorno {

    public static void main(String[] args) {
       int num1, num2;
       Scanner leer = new Scanner(System.in);
       num1 = leer.nextInt();
       num2 = leer.nextInt();
       multiplo(num1, num2);
    }
    
    public static void multiplo(int num1, int num2){
        int modu; 
        
        modu = num1 % num2;
        
        if(modu == 0 ){
            System.out.println("El número "+num1+" es multiplo del número "+num2);
        }
        else{
            System.out.println("El número "+num1+" NO es multiplo del número "+num2);
        }
    }
    
}
