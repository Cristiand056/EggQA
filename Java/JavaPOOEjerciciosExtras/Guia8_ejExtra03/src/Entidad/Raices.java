
package Entidad;

public class Raices {
    
    private int a;
    private int b;
    private int c;
    private double disc;

    public Raices(int a, int b, int c, double disc) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.disc = disc;
    }

    public Raices() {
    }

    public double getDisc() {
        return disc;
    }

    public void setDisc(double disc) {
        this.disc = disc;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
}
