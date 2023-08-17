/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionesclasesejerextra2.utils;

import java.util.ArrayList;
import javarelacionesclasesejerextra2.entities.Espectador;
import javarelacionesclasesejerextra2.entities.Sala;
import javarelacionesclasesejerextra2.services.SalaService;

/**
 *
 * @author USER
 */
public class Herramientas {
    public ArrayList<Espectador> crearEspectadores(ArrayList<String> nombres) {
        ArrayList<Espectador> espectadores = new ArrayList<>();

        nombres.forEach((nombre) ->
        {
            int edad = (int) (Math.random() * 90+1);
            Double dinero = Math.random() *250+1;
            espectadores.add(new Espectador(nombre, edad, dinero));
        });

        return espectadores;
    }

    public void asignarAsientoAuto(SalaService ss, Sala s, Espectador es) {
        while (true)
        {
            int fila = (int) (Math.random() * 7);
            int columna = (int) (Math.random() * 5);
            System.out.println("fila "+fila+" columna "+columna);
            if (ss.asignarAsiento(s, es, fila, columna) == 200 || ss.asignarAsiento(s, es, fila, columna) == 400)
            {
                break;
            }

        }
    }
}
