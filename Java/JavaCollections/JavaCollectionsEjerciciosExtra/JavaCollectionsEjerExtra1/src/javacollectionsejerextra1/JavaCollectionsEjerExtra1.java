/*
 Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package javacollectionsejerextra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class JavaCollectionsEjerExtra1 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList();
        Integer sum = 0;
        Integer num;
        while (true)
        {

            num = leer.nextInt();
            if (num != -99)
            {
                lista.add(num);
                sum += num;
            } else
            {
                break;
            }
        }
        System.out.println("la cantidad de números ingresados es: "+lista.size());
        System.out.println("La suma de los numeros es "+sum);       
        System.out.println("El promedio de los números es: "+(double)sum/lista.size());

    }

}
