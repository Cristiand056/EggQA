/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsdesafio.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javacollectionsdesafio.entities.Habitacion;
import javacollectionsdesafio.entities.Persona;
import javacollectionsdesafio.entities.Reserva;

public class Alojamiento {

    private ArrayList<Reserva> listaAlojamientos;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAlojamiento(Persona p, Habitacion h) {
        System.out.println("Ingrese el id de la reverva");
        Integer id = leer.nextInt();

        if (h.getnHabitacion() >= 1 & h.getnHabitacion() <= 5)
        {
            System.out.println("Ingrese la cantidad de personas de la reverva no mayor a dos");
            Integer cantPersonas = leer.nextInt();
            System.out.println("Ingrese el año ");
            String anio = leer.next();
            System.out.println("Ingrese el mes de inico ");
            String mes = leer.next();
            System.out.println("Ingrese el día inico ");
            String dia = leer.next();
            String fecha = anio + "-" + mes + "-" + dia;
            Reserva r = new Reserva(id, h.getnHabitacion(), cantPersonas, fecha);

            listaAlojamientos.add(r);
        } else if (h.getnHabitacion() > 5 & h.getnHabitacion() <= 8)

        {
            System.out.println("Ingrese la cantidad de personas de la reverva no mayor a tres");
            Integer cantPersonas = leer.nextInt();
            System.out.println("Ingrese el año ");
            String anio = leer.next();
            System.out.println("Ingrese el mes de inico ");
            String mes = leer.next();
            System.out.println("Ingrese el día inico ");
            String dia = leer.next();
            String fecha = anio + "-" + mes + "-" + dia;
            Reserva r = new Reserva(id, h.getnHabitacion(), cantPersonas, fecha);
        } else
        {
            System.out.println("Ingrese la cantidad de personas de la reverva no mayor a una");
            Integer cantPersonas = leer.nextInt();
            System.out.println("Ingrese el año ");
            String anio = leer.next();
            System.out.println("Ingrese el mes de inico ");
            String mes = leer.next();
            System.out.println("Ingrese el día inico ");
            String dia = leer.next();
            String fecha = anio + "-" + mes + "-" + dia;
            Reserva r = new Reserva(id, h.getnHabitacion(), cantPersonas, fecha);
        }
    }

    public void mostrarReservas() {
        listaAlojamientos.forEach((e) -> System.out.println(e.toString()));
    }

    public void actualizarReverva(Integer id) {
        for (Reserva al : listaAlojamientos)
        {
            if (al.getId() == id)
            {
                System.out.println("Ingrese la cantidad de personas de la reverva");
                Integer cantPersonas = leer.nextInt();
                System.out.println("Ingrese el año ");
                String anio = leer.next();
                System.out.println("Ingrese el mes de inico ");
                String mes = leer.next();
                System.out.println("Ingrese el día inico ");
                String dia = leer.next();

                String fecha = anio + "-" + mes + "-" + dia;
                Reserva r = new Reserva(id, al.getnHabitacion(), cantPersonas, fecha);

                listaAlojamientos.add(listaAlojamientos.indexOf(al), r);
            }
        }
    }

    public void eliminarReserva(Integer id) {

        Iterator<Reserva> it = listaAlojamientos.iterator();

        while (it.hasNext())
        {
            if (it.next().getId() == id)
            {
                it.remove();
            }
        }
    }
}
