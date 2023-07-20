package javacollectionsejer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class JavaCollectionsEjer2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList<>();
        String resp;
        while (true)
        {
            System.out.println("Desea Ingresar una raza de un perro ingrese 's', de lo contrario ingrese cualquier otra cosa");
            resp = leer.next();

            if (resp.equals("s"))
            {
                System.out.println("Ingrese la raza de perro");
                razaPerros.add(leer.next());
            } else
            {
                System.out.println("Razas de perros ingresadas: ");
                razaPerros.forEach((e) -> System.out.println(e));
                break;
            }
        }

        System.out.println("Desea eliminar un perro de la lista ingrese 's', para continuar, de lo contrario ingrese cúalquier letra");
        resp = leer.next();
        if (resp.equals("s"))
        {

            Iterator it = razaPerros.iterator();
            System.out.println("ingrese la raza a eliminar");
            resp = leer.next();
            while (it.hasNext())
            {
                if (it.next().equals(resp))
                {
                    it.remove();
                }
            }
            if (!razaPerros.contains(resp))
            {
                System.out.println("No se encontro la raza a eliminar");
            }
            Collections.sort(razaPerros);
            razaPerros.forEach((e) -> System.out.println(e));
        }
    }

}
