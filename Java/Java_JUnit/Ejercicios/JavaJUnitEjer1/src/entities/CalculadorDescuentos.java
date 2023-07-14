package entities;

public class CalculadorDescuentos {
    public double calcular(double precio, int op){
        switch(op){
            case 1:
                return precio - precio * 0.1;
            case 2:
                return precio - precio * 0.2;
            case 3:
                return precio - precio * 0.3;
            default:
                return precio;
        }
    }
}
