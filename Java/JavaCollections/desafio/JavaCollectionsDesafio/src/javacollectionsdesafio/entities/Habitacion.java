/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsdesafio.entities;


/**
 *
 * @author USER
 */
public class Habitacion {
    private Integer nHabitacion;
    private String fechaOcupacion;

    public Habitacion() {
    }

    public Habitacion(Integer nHabitacion, String fechaOcupacion) {
        this.nHabitacion = nHabitacion;
        this.fechaOcupacion = fechaOcupacion;
    }

    public Integer getnHabitacion() {
        return nHabitacion;
    }

    public void setnHabitacion(Integer nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public String getFechaOcupacion() {
        return fechaOcupacion;
    }

    public void setFechaOcupacion(String fechaOcupacion) {
        this.fechaOcupacion = fechaOcupacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "nHanitacion=" + nHabitacion + ", fechaOcupacion=" + fechaOcupacion + '}';
    }
    
}
