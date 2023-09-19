package javaexcepcionesejer5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExcepcionesEjer5 {

    public static void main(String[] args) {

        juego();

    }

    public static void juego() {
        int num = (int) (Math.random() * (500 + 1));
        int contErrors = 0;
        int contExceptions = 0;
        int into = 0;
        System.out.println("Numero: " + num);
        while (true)
        {
            Scanner read = new Scanner(System.in).useDelimiter("\n");
            try
            {
                System.out.println("Ingrese el numero");
                into = read.nextInt();
            } catch (InputMismatchException e)
            {
                System.out.println("Valor no valido");
                contExceptions++;
            } finally
            {
                if (num == into)
                {
                    System.out.println("Felicidades si era " + num + ", numero de intentos " + contErrors + ", numero de catch " + contExceptions);
                    break;
                } else
                {
                    if (into > num & into > 0)
                    {
                        System.out.println("El numero ingresado es mayor");
                        
                    } 
                    else if(into < num & into > 0)
                    {
                        System.out.println("El numero ingresado es mayor");

                    }
                    contErrors++;
                    
                }
            }
        }
    }
}
