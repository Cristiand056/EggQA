/*
 Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
package javarelacionesclasesejerextra3.entities;

import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class Cuota {

    private Integer numeroCuota;
    private Double montoTotalCuota;
    private Boolean paga;
    private LocalDate fechaVencimiento;

    public Cuota() {
    }

    public Cuota(Integer numeroCuota, Double montoTotalCuota, LocalDate fechaVencimiento) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.paga = false;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public Double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public Boolean getPaga() {
        return paga;
    }

    public void setPaga(Boolean paga) {
        this.paga = paga;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotalCuota=" + montoTotalCuota + ", paga=" + paga + ", fechaVencimiento=" + fechaVencimiento + '}';
    }

}
