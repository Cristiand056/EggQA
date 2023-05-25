package javaejercicio12;
import java.util.Scanner;
//X456OX789OY456P
public class JavaEjercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase=leer.nextLine(), fraseAux;
        int contCorrec, contIncorrec, cont ;
        
        cont = 1;
        contCorrec = 0; 
        contIncorrec =0;
        fraseAux = "";
        for(int i = 0; i < frase.length(); i++){
            
            fraseAux += frase.substring(i, i+1);
            System.out.println(" aux  "+ fraseAux);         
            if(fraseAux.startsWith("X") & fraseAux.endsWith("O") & fraseAux.length()==5){
                contCorrec ++;
                 fraseAux = "";
            }else{
                if (fraseAux.length()==5){
                     contIncorrec++;
                      fraseAux = "";
                }              
            }
        }    
        
        System.out.println("Correctas: "+contCorrec);
        System.out.println("Incorrectas: "+contIncorrec);
    }
    
}
