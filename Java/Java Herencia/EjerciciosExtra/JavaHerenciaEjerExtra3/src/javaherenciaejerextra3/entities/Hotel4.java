/*
Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package javaherenciaejerextra3.entities;


public class Hotel4 extends Hotel {

    protected String gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;
    protected Double precioH4;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, encargado);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioH4 = asignarPreciohabitacionH4();
    }

    public Double getPrecioH4() {
        return precioH4;
    }

    public void setPrecioH4(Double precioH4) {
        this.precioH4 = precioH4;
    }
    
    

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    protected Double asignarPreciohabitacion() {
        return super.asignarPreciohabitacion();
    }

    protected Double asignarPreciohabitacionH4() {
        Double valor = 0d;
        if (capacidadRestaurante < 30)
        {
            valor = 10d;
        }
        if (capacidadRestaurante >= 30 & capacidadRestaurante <= 50)
        {
            valor = 30d;
        }
        if (capacidadRestaurante > 50)
        {
            valor = 50d;
        }

        if (gimnasio.equals("A"))
        {
            valor += 50d;
        }

        if (gimnasio.equals("B"))
        {
            valor += 30d;
        }

        return asignarPreciohabitacion() + valor;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioH4 + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }

}
