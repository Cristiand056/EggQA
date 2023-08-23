/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionesclasesejerextra4.data.utils;

import java.util.Comparator;
import javarelacionesclasesejerextra4.entities.Alumno;

/**
 *
 * @author USER
 */
public class Comparators {
    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a1, Alumno a2){
            return a2.getCantidadVotos().compareTo(a1.getCantidadVotos());
        }
    };
}
