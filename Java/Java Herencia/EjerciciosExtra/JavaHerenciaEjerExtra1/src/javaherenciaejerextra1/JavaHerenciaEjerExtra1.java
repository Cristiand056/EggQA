package javaherenciaejerextra1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javaherenciaejerextra1.entities.Alquiler;
import javaherenciaejerextra1.entities.Barco;
import javaherenciaejerextra1.entities.BarcoMotor;
import javaherenciaejerextra1.entities.Velero;
import javaherenciaejerextra1.entities.YateLujo;

public class JavaHerenciaEjerExtra1 {

    public static void main(String[] args) {
        ArrayList<Alquiler> lista = new ArrayList<>();
        lista.add(new Alquiler("mr a", 123456, LocalDate.now(), LocalDate.of(2023, Month.SEPTEMBER,4),"sadsad", new Barco("AAA11", 20d, LocalDate.of(2009, Month.MARCH, 7))));
        lista.add(new Alquiler("mr a", 123456, LocalDate.now(), LocalDate.of(2023, Month.SEPTEMBER, 4),"sadsad", new Velero(2,"AAA11", 20d, LocalDate.of(2009, Month.MARCH, 7))));
        lista.add(new Alquiler("mr a", 123456, LocalDate.now(), LocalDate.of(2023, Month.SEPTEMBER, 4),"sadsad", new BarcoMotor(40,"AAA11", 20d, LocalDate.of(2009, Month.MARCH, 7))));
        lista.add(new Alquiler("mr a", 123456, LocalDate.now(), LocalDate.of(2023, Month.SEPTEMBER, 4),"sadsad", new YateLujo(4,"AAA11", 20d, LocalDate.of(2009, Month.MARCH, 7))));
        
        lista.forEach((e)->
                System.out.println("Valor total: "+e.calcularAlquiler()+" Descripción: \n"+e.toString())
        );
    }
}
