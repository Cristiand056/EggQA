package javaherenciaejerextra1.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;
    private Integer documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Double calcularAlquiler() {
        Double valor =  this.fechaAlquiler.until(this.fechaDevolucion, ChronoUnit.DAYS) * this.barco.getEslora();
        //System.out.println("dias: "+this.fechaAlquiler.until(this.fechaDevolucion, ChronoUnit.DAYS));

        if (this.barco instanceof Velero)
        {
            Velero aux = (Velero) this.barco;
            valor += aux.getNumeroMastiles();
        }

        if (this.barco instanceof BarcoMotor)
        {
            BarcoMotor aux = (BarcoMotor) this.barco;
            valor += aux.getPotencia();
        }
        if (this.barco instanceof YateLujo)
        {
            YateLujo aux = (YateLujo) this.barco;
            valor += aux.getNumeroCamarotes();
        }

        return valor;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

}
