package javaherenciaejerextra1.entities;

import java.time.LocalDate;

public class BarcoMotor extends Barco {

    protected Integer potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potencia, String matricula, Double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "matricula=" + matricula + ", eslora=" + this.eslora + ", anioFabricacion=" + this.anioFabricacion + "potencia=" + potencia + '}';
    }

}
