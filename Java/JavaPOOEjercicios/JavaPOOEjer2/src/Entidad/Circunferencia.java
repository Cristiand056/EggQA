package Entidad;

public class Circunferencia {
    private double radio;
    double area, perimetro;
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    public void crearCircunferencia(double radio){
        setRadio(radio);
    }
    
    public double area(){
        area = Math.PI * Math.sqrt(radio);
        return area;
    }
    
    public double perimetro(){
        perimetro = 2*Math.PI * radio;
        return perimetro;
    }
    
}
