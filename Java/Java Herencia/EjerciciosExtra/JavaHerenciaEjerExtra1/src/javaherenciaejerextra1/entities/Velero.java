package javaherenciaejerextra1.entities;

import java.time.LocalDate;

public class Velero extends Barco {
    protected Integer numeroMastiles;

    public Velero() {       
    }

    public Velero(Integer numeroMastiles, String matricula, Double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    

    @Override
    public String toString() {
        return "Velero{"+ "matricula=" + this.matricula + ", eslora=" + this.eslora + ", anioFabricacion=" + this.anioFabricacion + "numeroMastiles=" + numeroMastiles + '}';
    }

    
    
    
    
}
