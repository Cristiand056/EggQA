/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsdesafio.entities;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Reserva {
    private Integer id;
    private Integer nHabitacion;
     private Integer cantPersonas;
     private String fechas;

    public Reserva() {
    }

    public Reserva(Integer id, Integer nHabitacion, Integer cantPersonas, String fechas) {
        this.id = id;
        this.nHabitacion = nHabitacion;
        this.cantPersonas = cantPersonas;
        this.fechas = fechas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getnHabitacion() {
        return nHabitacion;
    }

    public void setnHabitacion(Integer nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", nHabitacion=" + nHabitacion + ", cantPersonas=" + cantPersonas + ", fechas=" + fechas + '}';
    }
    
    
    
    
     
     
     
}
