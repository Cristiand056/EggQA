/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsdesafio.entities.data;

import javacollectionsdesafio.entities.Habitacion;
import javacollectionsdesafio.entities.Persona;

/**
 *
 * @author USER
 */
public class Datos {
    public static final Persona[] personas = {
        new Persona("Jose", 20, 123456, "Mexico"),
        new Persona("Maria", 22, 123457, "Argentina"),
        new Persona("Cristian", 24, 123458, "Peru"),
    };
    public static final Habitacion[] habitaciones = {
        new Habitacion(1, ""),
        new Habitacion(2, ""),
        new Habitacion(3, ""),
        new Habitacion(4, ""),
        new Habitacion(5, ""),
        new Habitacion(6, ""),
        new Habitacion(7, ""),
        new Habitacion(8, ""),
        new Habitacion(9, ""),
        new Habitacion(10, ""),
    };
}
