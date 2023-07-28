/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package javacollectionsejerextra2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javacollectionsejerextra2.entities.CantanteFamoso;

public class JavaCollectionsEjerExtra2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();

        listaCantantes.add(new CantanteFamoso("the beatlees", "White album"));
        listaCantantes.add(new CantanteFamoso("black sabbat", "paranoid"));
        listaCantantes.add(new CantanteFamoso("prince", "gold"));
        listaCantantes.add(new CantanteFamoso("pink floyd", "the dark side of the moon"));
        listaCantantes.add(new CantanteFamoso("iron maiden", "fear of the dark"));

        listaCantantes.forEach((e) -> System.out.println("Cantante: " + e.getNombre() + " Album " + e.getDiscoConMasVentas()));
        int op;
        while (true)
        {
            System.out.println("Ingrese 1, si desea agregar un cantante más ");
            System.out.println("Ingrese 2, si desea eliminar un cantante");
            System.out.println("Ingrese 3, si desea ver la lista de cantantes ");
            System.out.println("Ingrese 4, si desea salir ");
            op = leer.nextInt();

            if (op != 4)
            {
                switch (op)
                {
                    case 1:
                        CantanteFamoso c = new CantanteFamoso();
                        System.out.println("Ingrese el nombre");
                        c.setNombre(leer.next());
                        System.out.println("Ingrese el album");
                        c.setDiscoConMasVentas(leer.next());
                        listaCantantes.add(c);
                        break;
                    case 2:
                        System.out.println("Ingrese el nombre a eliminar");
                        String nombre = leer.next();
                        Iterator<CantanteFamoso> it = listaCantantes.iterator();
                        while (it.hasNext())
                        {
                            if (it.next().getNombre().equals(nombre))
                            {
                                it.remove();
                            }
                        }

                        break;
                    case 3:
                        listaCantantes.forEach((e) -> System.out.println("Cantante: " + e.getNombre() + " Album " + e.getDiscoConMasVentas()));
                        break;
                    default:
                        System.out.println("Opción erronea");
                        break;
                }
            } else
            {
                break;

            }

        }

    }

}
