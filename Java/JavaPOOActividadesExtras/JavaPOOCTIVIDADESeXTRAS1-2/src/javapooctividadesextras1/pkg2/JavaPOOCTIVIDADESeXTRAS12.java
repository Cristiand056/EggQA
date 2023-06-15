package javapooctividadesextras1.pkg2;

import Entidad.Circulo;
import Entidad.Cuadrado;
import Entidad.Hexagono;
import Entidad.Pentagono;
import Entidad.Rectangulo;
import Entidad.Rombo;
import Entidad.Triangulo;
import java.util.Scanner;

public class JavaPOOCTIVIDADESeXTRAS12 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int op;
        System.out.println("Ingrese  que figura va ingresar 1, 2,3....");
        op = leer.nextInt();
        switch (op)
        {
            case 1:
                Cuadrado c = new Cuadrado(leer.nextInt(), leer.nextInt());

                System.out.println("El prerimetro es: " + c.perimetro());
                System.out.println("El area es: " + c.area());
                break;
            case 2:
                Rectangulo r = new Rectangulo(leer.nextInt(), leer.nextInt());

                System.out.println("El prerimetro es: " + r.perimetro());
                System.out.println("El area es: " + r.area());
                break;
            case 3:
                Triangulo t = new Triangulo(leer.nextInt(), leer.nextInt(), leer.nextFloat());

                System.out.println("El prerimetro es: " + t.perimetro());
                System.out.println("El area es: " + t.area());
            case 4:
                Circulo ci = new Circulo(leer.nextInt());
                System.out.println("El prerimetro es: " + ci.perimetro());
                System.out.println("El area es: " + ci.area());
                break;

            case 5:
                Hexagono h = new Hexagono(leer.nextInt());

                System.out.println("El prerimetro es: " + h.perimetro());
                System.out.println("El area es: " + h.area());
                break;

            case 6:
                Pentagono p = new Pentagono(leer.nextDouble(), leer.nextDouble());

                System.out.println("El prerimetro es: " + p.perimetro());
                System.out.println("El area es: " + p.area());
                break;

            case 7:

                Rombo ro = new Rombo(leer.nextDouble(), leer.nextDouble(), leer.nextDouble());

                System.out.println("El prerimetro es: " + ro.perimetro());
                System.out.println("El area es: " + ro.area());
                break;

            default:
                System.out.println("Opción erronea");
        }
    }

}
