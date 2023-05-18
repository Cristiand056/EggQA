package javaejemplo11subfunciones;
import java.util.Scanner;
import static java.lang.Character.*;

public class JavaEjemplo11SubFunciones {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        frase = leer.nextLine();
        
        System.out.println( codificar(frase));
        
    }
    
    public static String codificar(String frase) {
        String hashed;
        
        int longitud = frase.length();
        String [] crite = frase.split("");
        hashed = "";
        for(int i = 0; i < longitud; i++){
            System.out.println("paso "+i+" "+crite[i]);
            if(crite[i].equals("a") || crite[i].equals("A") ){
                hashed = hashed + "@";
            }
            else if(crite[i].equals("e") || crite[i].equals("E") ){
                hashed = hashed + "#";
            }
            else if(crite[i].equals("i") || crite[i].equals("I") ){
                hashed = hashed + "$";
            }
            else if(crite[i].equals("o") || crite[i].equals("O") ){
                hashed = hashed + "%";
            }
            else if(crite[i].equals("u") || crite[i].equals("U") ){
                hashed = hashed + "*";
            }
            else{
                System.out.println("hola entre");
                hashed = hashed+crite[i];
            }
             System.out.println("salida: "+hashed);
        }
        return hashed;
    }
}

