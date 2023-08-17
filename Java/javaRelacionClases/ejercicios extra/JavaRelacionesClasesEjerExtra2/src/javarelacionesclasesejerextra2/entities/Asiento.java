/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarelacionesclasesejerextra2.entities;

/**
 *
 * @author USER
 */
public class Asiento {
    private Integer fila;
    private String columna;
    private Espectador espectador;
    private String ocupado;

    public Asiento() {
    }

    public Asiento(Integer fila, String columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = "X";
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return  fila + " " + columna + " " + ocupado;
    } 
   
}
