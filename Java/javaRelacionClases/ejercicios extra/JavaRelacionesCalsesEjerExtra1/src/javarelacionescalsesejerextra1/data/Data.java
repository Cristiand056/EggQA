/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionescalsesejerextra1.data;

import java.util.ArrayList;
import java.util.Arrays;
import javarelacionescalsesejerextra1.entities.Perro;
import javarelacionescalsesejerextra1.entities.Persona;

/**
 *
 * @author USER
 */
public class Data {

    public static final ArrayList<Perro> perros = new ArrayList<Perro>(
            Arrays.asList(
                    new Perro("mateo", "doberman", 4, 1.2),
                    new Perro("lola", "husky", 3, 1.3),
                    new Perro("negro", "pitbull", 5, 1.2),
                    new Perro("sasha", "pastor aleman", 2, 1.3)
            )
    );


    public static final Persona[] personas =
    {
        new Persona("jose", "martinez", 23, 1234567),
        new Persona("Maria", "angulo", 23, 1234567),
        new Persona("vergara", "telechea", 23, 1234567),

    };
}
