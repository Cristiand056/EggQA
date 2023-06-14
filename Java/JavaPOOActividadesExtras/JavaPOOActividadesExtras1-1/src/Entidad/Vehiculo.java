/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

public class Vehiculo {

    public String marca;
    public String modelo;
    public String anio;
    public String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public int Moverse(int tiempo) {
        int metros = 0, avance = 0;

        switch (tipo)
        {
            case "automovil":
                metros = 3;
                break;
            case "motocicleta":
                metros = 2;
                break;
            case "bicicleta":
                metros = 1;
                break;
        }

        avance = metros * tiempo;

        return avance;
    }

    public int frenar(int avance) {
        if (tipo.equals("bicicleta"))
        {
            return avance;
        } else
        {
            return avance + 2;
        }
    }
}
