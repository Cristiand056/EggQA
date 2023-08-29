package javaherenciaejer2.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String consumoEnergetico, Double peso) {
        this.precio = 1000d;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    protected String comprobarConsumo(String letra) {
        String aux = "F";
        ArrayList<String> listaConsumos = new ArrayList<>(Arrays.asList(
                "A", "B", "C", "D", " E", "F"
        ));
        System.out.println("Letra " + letra);
        if (listaConsumos.contains(letra.toUpperCase()))
        {
            aux = letra.toUpperCase();
        }
        System.out.println("Aux " + aux);
        return aux;
    }

    protected String comprobarColor(String color) {
        String aux = "blanco";
        ArrayList<String> listaColores = new ArrayList<>(Arrays.asList(
                "blanco", "negro", "rojo", "azul", " gris"
        ));

        if (listaColores.contains(color.toLowerCase()))
        {
            aux = color.toLowerCase();
        }

        return aux;
    }

    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el color");
        String color = comprobarColor(leer.next());
        System.out.println("Ingrese el consumo energetico");
        String tipo = comprobarConsumo(leer.next());
        System.out.println("Ingrese el peso");
        Double peso = leer.nextDouble();
        Electrodomestico e = new Electrodomestico(color, tipo, peso);
        precioFinal(e);
        return e;
    }

    protected Double precioFinal(Electrodomestico e) {
        Double aux = e.getPrecio();
        if (e.getPeso() <= 19)
        {
            aux += 100d;
        }
        if (e.getPeso() > 19 & e.getPeso() < 50)
        {
            aux += 500d;
        }
        if (e.getPeso() >= 50 & e.getPeso() <= 79)
        {
            aux += 800d;
        }
        if (e.getPeso() >= 80)
        {
            aux += 1000d;
        }

        switch (e.getConsumoEnergetico())
        {
            case "A":
                aux += 1000d;
                break;
            case "B":
                aux += 800d;
                break;
            case "C":
                aux += 600d;
                break;
            case "D":
                aux += 500d;
                break;
            case "E":
                aux += 300d;
                break;
            case "F":
                aux += 100d;
                break;
        }

        e.setPrecio(aux);
        return aux;

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
