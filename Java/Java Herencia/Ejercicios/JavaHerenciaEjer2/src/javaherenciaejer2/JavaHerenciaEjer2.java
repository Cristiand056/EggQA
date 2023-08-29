package javaherenciaejer2;

import java.util.ArrayList;
import java.util.Arrays;
import javaherenciaejer2.entities.Electrodomestico;
import javaherenciaejer2.entities.Lavadora;
import javaherenciaejer2.entities.Televisor;


public class JavaHerenciaEjer2 {


    public static void main(String[] args) {
        /*Lavadora l;
        Televisor t;
        l = (Lavadora) new Lavadora().crearElectrodomestico();
        t = (Televisor) new Televisor().crearElectrodomestico();
        */
        //Ejercicio 3
        
        ArrayList<Electrodomestico> lista = new ArrayList<>(
                Arrays.asList(
                        new Lavadora(35d, "azul", "E", 30d),
                        new Televisor(60d, true, "negro", "A",10d),
                        new Lavadora(40d, "asdsa", "T", 30d),
                        new Televisor(30d, false, "negro", "B",10d)
                )            
        );
        
        double sumTel = 0;
        double sumLav = 0;
        
        for (Electrodomestico el : lista)
        {
            if(el instanceof Lavadora){
                sumLav += ((Lavadora) el).precioFinalLavadora((Lavadora) el);
            }
            
            if(el instanceof Televisor){
                sumTel += ((Televisor) el).precioFinalTelevisor((Televisor) el);
            }
        }
        
        System.out.println("Las ventas de lavadoras= "+ sumLav);
        System.out.println("Las ventas de televisores= "+ sumTel);
        System.out.println("Las ventas de totales= "+ (sumLav+sumTel));
    }
    
}
