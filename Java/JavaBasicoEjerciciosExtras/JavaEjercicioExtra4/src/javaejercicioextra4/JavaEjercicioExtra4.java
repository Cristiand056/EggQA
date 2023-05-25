package javaejercicioextra4;
import java.util.Scanner;

public class JavaEjercicioExtra4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op = leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("El número "+op+" en romano sería: I");
                break;
            case 2:
                System.out.println("El número "+op+" en romano sería: II");
                break;
            case 3:
                System.out.println("El número "+op+" en romano sería: III");
                break;
             case 4:
                System.out.println("El número "+op+" en romano sería: IV");
                break;
             case 5:
                System.out.println("El número "+op+" en romano sería: V");
                break;
             case 6:
                System.out.println("El número "+op+" en romano sería: VI");
                break;
             case 7:
                System.out.println("El número "+op+" en romano sería: VII");
                break;
             case 8:
                System.out.println("El número "+op+" en romano sería: VIII");
                break;
            case 9:
                System.out.println("El número "+op+" en romano sería: IX");
                break;
            case 10:
                System.out.println("El número "+op+" en romano sería: X");
                break;               
            default:
                System.out.println("No puedo convertir esto");
        }
    }
    
}
