package javapooejer9;

import Entidad.Matematica;

public class JavaPOOEjer9 {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 20);
        int num2 = (int) (Math.random() * 20);

        System.out.println("num1 " + num1 + " num2 " + num2);

        Matematica m = new Matematica(num1, num2);

        System.out.println("raiz " + m.calculaRaiz());
        System.out.println("potencia " + m.calcularPotencia());
    }

}
