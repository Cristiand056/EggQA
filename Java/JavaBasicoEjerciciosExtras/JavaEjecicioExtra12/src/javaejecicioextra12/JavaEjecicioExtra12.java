package javaejecicioextra12;
import java.util.Scanner;

public class JavaEjecicioExtra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String d1, d2, d3;
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10;k++){
                    d1 = Integer.toString(i);
                    d2 = Integer.toString(j);
                    d3 = Integer.toString(k); 
                    
                    if(d1.equals("3")){
                        d1 = "E";
                    }
                    if(d2.equals("3")){
                        d2 = "E";
                    }
                   if(d3.equals("3")){
                        d3 = "E";
                    } 
                    System.out.println(d1+"-"+d2+"-"+d3);
                }
            }
        }
    }
    
}
