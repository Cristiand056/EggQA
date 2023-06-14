package Entidad;

public class Cuadrado {

    private int base;
    private int altura;

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int perimetro() {
        return 2 * base + 2 * altura;
    }

    public int area() {
        return base * altura;
    }
}
