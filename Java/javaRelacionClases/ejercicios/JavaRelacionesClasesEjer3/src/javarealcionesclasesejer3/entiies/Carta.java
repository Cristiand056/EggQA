/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarealcionesclasesejer3.entiies;

/**
 *
 * @author USER
 */
public class Carta {
    private String palo;
    private Integer numeroCarta;

    public Carta(String palo, Integer numeroCarta) {
        this.palo = palo;
        this.numeroCarta = numeroCarta;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", número carta=" + numeroCarta + '}';
    }
    
    
}
