/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionclasesejer1.datos;

import javarelacionclasesejer1.entities.Perro;
import javarelacionclasesejer1.entities.Persona;

/**
 *
 * @author USER
 */
public class data {

    public static final Perro[] perros =
    {
        new Perro("mateo", "doberman", 4, 1.2),
        new Perro("lola", "husky", 3, 1.3),
    };

    public static final Persona[] personas =
    {
        new Persona("jose", "martinez", 23, 1234567),
        new Persona("Maria", "angulo", 23, 1234567),

    };
}
