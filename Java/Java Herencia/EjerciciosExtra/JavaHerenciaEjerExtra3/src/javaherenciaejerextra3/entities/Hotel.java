/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
 */
package javaherenciaejerextra3.entities;

/**
 *
 * @author USER
 */
public class Hotel extends Alojamiento {

    protected Integer cantHabitaciones;
    protected Integer numCamas;
    protected Integer cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = asignarPreciohabitacion();
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacione() {
        return precioHabitacion;
    }

    public void setPrecioHabitacione(Double precioHabitacione) {
        this.precioHabitacion = precioHabitacione;
    }
    
    protected Double asignarPreciohabitacion(){
        return (double)(50 + (1 * numCamas*cantPisos*cantHabitaciones));
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioHabitacion + '}';
    }

}
