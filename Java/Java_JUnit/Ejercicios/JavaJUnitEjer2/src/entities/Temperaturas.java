/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Temperaturas {
    public ArrayList<Double> convertirTemperaturas(double t, String op){
        
        ArrayList<Double> temps = new ArrayList<Double>(); 
        switch(op.toLowerCase()){
            case "c":
                 temps.add(t*(9/5)+32.0);
                 temps.add(t+273.15);
                 return temps;
            case "f":
                temps.add((t-32.0)*(5/9));
                temps.add((t-32.0)*(5/9)+273.15);
                return temps;
            case "k":
                temps.add(t-273.15);
                temps.add((t-273.15)*(9/5)+32);
                return temps;
            default:
                return temps;
        }
       
        
    }
}
