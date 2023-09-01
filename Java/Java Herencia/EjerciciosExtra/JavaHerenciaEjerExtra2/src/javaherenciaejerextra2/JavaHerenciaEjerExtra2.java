package javaherenciaejerextra2;

import java.util.ArrayList;
import java.util.Arrays;
import javaherenciaejerextra2.entities.Edificio;
import javaherenciaejerextra2.entities.EdificioDeOficinas;
import javaherenciaejerextra2.entities.Polideportivo;

public class JavaHerenciaEjerExtra2 {

    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList<>(
            Arrays.asList(
                    new Polideportivo("A1", true,  20d, 40d, 30d),
                    new Polideportivo("A2", false,  50d, 50d, 20d),
                    new EdificioDeOficinas(3, 20, 3, 40d, 50d, 6d),
                    new EdificioDeOficinas(5, 15, 5, 60d, 70d, 7d)
            )
         );
        
        lista.forEach((edificio) ->
        {
            if(edificio instanceof Polideportivo){
                Polideportivo aux = (Polideportivo) edificio;
                System.out.println(aux.toString());            
                System.out.println("Tiene un Area de "+aux.calcularArea());
                System.out.println("Tiene una superficie de "+aux.calcularSuperficie());
                System.out.println(aux.esTechado());            
            }else{
               
                EdificioDeOficinas aux = (EdificioDeOficinas) edificio;
                System.out.println(aux.toString());  
                System.out.println("Tiene un Area de "+aux.calcularArea());
                System.out.println("Tiene una superficie de "+aux.calcularSuperficie());
                aux.cantPersonas();
            }
        });
    }
    
}
