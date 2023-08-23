/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionesclasesejerextra4.data.utils;

import java.util.ArrayList;
import javarelacionesclasesejerextra4.entities.Alumno;
import javarelacionesclasesejerextra4.entities.Voto;

public class tools {
    public static void mostrarAlumnos(ArrayList<Alumno> la){
        la.forEach((e)->
                System.out.println(e.toString())
        );    
    }
    public static void mostrarVotos(ArrayList<Voto> votos){
        votos.forEach((e)->
                System.out.println("Votos del Alumno = "+ e.getAlumno().getCantidadVotos()+"\n "+ e.getAlumno()+"  \n"+e.getVotoAlumno())
                
        );
        
    }
}
