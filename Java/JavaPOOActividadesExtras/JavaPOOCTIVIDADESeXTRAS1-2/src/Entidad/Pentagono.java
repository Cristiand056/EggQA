package Entidad;

public class Pentagono {

    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double perimetro() {
        return (double) lado * 5;
    }

    public double area() {
        double area = perimetro() * apotema;
        return (double) area;
    }
}
