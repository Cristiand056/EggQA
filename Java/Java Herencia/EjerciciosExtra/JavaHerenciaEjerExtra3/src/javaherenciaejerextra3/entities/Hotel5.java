/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package javaherenciaejerextra3.entities;

public class Hotel5 extends Hotel4 {

    protected Integer cantSalonesConferencia;
    protected Integer cantSuites;
    protected Integer cantLimosinas;
    protected Double precioH5;

    public Hotel5(Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, encargado);
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        this.precioH5 = asignarPreciohabitacionH5();
    }

    public Double getPrecioH5() {
        return precioH5;
    }

    public void setPrecioH5(Double precioH5) {
        this.precioH5 = precioH5;
    }

    public Integer getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(Integer cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    protected Double asignarPreciohabitacionH4() {
        return super.asignarPreciohabitacionH4();
    }

    protected Double asignarPreciohabitacionH5() {
        return asignarPreciohabitacionH4() + 15 * cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", encargado=" + encargado + "cantHabitaciones=" + cantHabitaciones + ", numCamas=" + numCamas + ", cantPisos=" + cantPisos + ", precioHabitaciones=" + precioH5 + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + "cantSalonesConferencia=" + cantSalonesConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

}
