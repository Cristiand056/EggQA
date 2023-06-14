package Entidad;

public class Hexagono {

    private double lado;

    public Hexagono(int lado) {
        this.lado = lado;
    }

    public double perimetro() {
        return (double) lado * 6;
    }

    public double area() {
        double area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
        return (double) area;
    }
}
