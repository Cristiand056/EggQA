/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejerextra3.entities;

public class Camping extends ExtraHotelero{
    private Integer cantCarpas;
    private Integer cantBaños;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer cantCarpas, Integer cantBaños, Boolean restaurante, Boolean privado, Integer m2) {
        super(privado, m2);
        this.cantCarpas = cantCarpas;
        this.cantBaños = cantBaños;
        this.restaurante = restaurante;
    }

    public Integer getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(Integer cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public Integer getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(Integer cantBaños) {
        this.cantBaños = cantBaños;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "privado=" + privado + ", m2=" + m2 + "cantCarpas=" + cantCarpas + ", cantBa\u00f1os=" + cantBaños + ", restaurante=" + restaurante + '}';
    }
    
    
}
