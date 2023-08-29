package javaherenciaejer4.interfaces;

import javaherenciaejer4.entities.CalculoFormas;


 public class Circulo implements CalculoFormas{
    
     private Double radio;
     private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
        this.diametro = radio*2;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }

    
     
    
     
     
    @Override
    public Double area(){
        Double area;
        
        area = pi *  Math.pow(this.radio, 2);
        
        return area;
    }
    
    @Override
    public Double perimetro() {
        Double perimetro;
        
        perimetro = pi *  this.diametro;
        
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", perimetro=" + diametro + '}';
    }
    
    
}
