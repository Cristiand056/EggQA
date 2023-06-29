/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Nif {
    
    private long dni;
    private String car;
    
    public Nif(){
        
    }

    public Nif(long dni, String car) {
        this.dni = dni;
        this.car = car;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", car=" + car + '}';
    }
    
    
}
