/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexcepcionesejer2;

import java.util.Scanner;

public class JavaExcepcionesEjer1 {

    public static Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        division();
    }

    public static void division() {
        try
        {
            System.out.println("numero 1");
            int num1 = Integer.valueOf(read.next());
            System.out.println("numero 2");
            int num2 = Integer.valueOf(read.next());
            System.out.println("La divicion es : " + (num1 / num2));
        } catch (NumberFormatException e)
        {
            System.out.println("Valor no valido" + e.getLocalizedMessage());

        } catch (ArithmeticException e)
        {
            System.out.println("No se puede dividir por cero" + e.getLocalizedMessage());
        }
    }
}
