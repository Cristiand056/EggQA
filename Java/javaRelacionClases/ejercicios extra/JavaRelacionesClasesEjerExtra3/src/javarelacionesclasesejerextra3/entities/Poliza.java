/*
Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */
package javarelacionesclasesejerextra3.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Poliza {
    private Integer numeroPoliza;
    private LocalDate fechaInicio; 
    private LocalDate fechaFin;
    private ArrayList<Cuota> catidadCuotas;
    private String formaPago;
    private Double montototalA;
    private Boolean incluyeGranizo;
    private Double montoMaximoGraniso;
    private String tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Poliza() {
    }
    
    

    public Poliza(Integer numeroPoliza, LocalDate fechaInicio, LocalDate fechaFin,ArrayList<Cuota> catidadCuotas, String formaPago, Double montototalA, Boolean incluyeGranizo, Double montoMaximoGraniso, String tipoCobertura, Cliente cliente, Vehiculo vehiculo) {
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.catidadCuotas = catidadCuotas;
        this.formaPago = formaPago;
        this.montototalA = montototalA;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGraniso = montoMaximoGraniso;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Cuota> getCatidadCuotas() {
        return catidadCuotas;
    }

    public void setCatidadCuotas(ArrayList<Cuota> catidadCuotas) {
        this.catidadCuotas = catidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Double getMontototalA() {
        return montototalA;
    }

    public void setMontototal(Double montototal) {
        this.montototalA = montototal;
    }

    public Boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(Boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Double getMontoMaximoGraniso() {
        return montoMaximoGraniso;
    }

    public void setMontoMaximoGraniso(Double montoMaximoGraniso) {
        this.montoMaximoGraniso = montoMaximoGraniso;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", catidadCuotas=" + catidadCuotas + ", formaPago=" + formaPago + ", montototal=" + montototalA + ", incluyeGranizo=" + incluyeGranizo + ", montoMaximoGraniso=" + montoMaximoGraniso + ", tipoCobertura=" + tipoCobertura + ", \n"
                + "cliente=" + cliente.toString() + ", \n"
                + "vehiculo=" + vehiculo.toString() + '}';
    }
    
    
    
}
