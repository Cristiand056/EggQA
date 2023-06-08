package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectngulo() {
        System.out.println("Ingrese la base");
        int base = leer.nextInt();

        System.out.println("Ingrese la altura");
        int altura = leer.nextInt();

        return new Rectangulo(base, altura);
    }

    public int calcularS(Rectangulo r) {
        return (r.getBase() * r.getAltura());
    }

    public int calcularP(Rectangulo r) {
        return (r.getBase() + r.getAltura()) * 2;
    }

    public void dibujarR(Rectangulo r) {
        for (int i = 0; i < r.getBase(); i++)
        {
            for (int j = 0; j < r.getAltura(); j++)
            {
                if (i == 0 || j == 0 || i == r.getBase() - 1 || j == r.getAltura() - 1)
                {
                    System.out.print("*  ");
                } else
                {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
