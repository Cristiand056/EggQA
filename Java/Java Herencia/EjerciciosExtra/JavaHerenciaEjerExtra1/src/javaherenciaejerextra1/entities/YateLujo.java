/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejerextra1.entities;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class YateLujo extends Barco {

    protected Integer numeroCamarotes;

    public YateLujo() {
    }

    public YateLujo(Integer numeroCamarotes, String matricula, Double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return "YateLujo{"+ "matricula=" + matricula + ", eslora=" + this.eslora + ", anioFabricacion=" + this.anioFabricacion + "numeroCamarotes=" + numeroCamarotes + '}';
    }
    
    

}
