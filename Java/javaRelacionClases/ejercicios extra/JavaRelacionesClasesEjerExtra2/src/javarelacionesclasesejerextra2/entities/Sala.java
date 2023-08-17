/*
Sala, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Sala nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada
 */
package javarelacionesclasesejerextra2.entities;

public class Sala {

    private Pelicula pelicula;
    private Asiento[][] asientos;
    private Double precioEntrada;

    public Sala() {
    }

    public Sala(Pelicula pelicula, Asiento[][] asientos, Double precioEntrada) {
        this.pelicula = pelicula;
        this.asientos = asientos;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", asientos=" + asientos + ", precioEntrada=" + precioEntrada + '}';
    }

}
