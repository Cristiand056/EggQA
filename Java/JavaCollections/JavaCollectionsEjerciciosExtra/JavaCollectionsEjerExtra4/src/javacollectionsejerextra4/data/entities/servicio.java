/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsejerextra4.data.entities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class servicio {

    private HashMap<String, String> CodigoCiudad = new HashMap();
    private Scanner leer = new Scanner(System.in);

    public void imgresarCodigo() {

        System.out.println("Ingrese el código No");
        String codigo = leer.next();
        System.out.println("Ingrese la ciudad No");
        String ciudad = leer.next();

        CodigoCiudad.put(codigo, ciudad);

    }

    public void imgresarCodigoA(String[] cod, String[] ciu) {
        for (int i = 0; i < 10; i++)
        {
            CodigoCiudad.put(cod[i], ciu[i]);
        }

        mostrar();

    }

    public void mostrar() {
        for (Map.Entry<String, String> entry : CodigoCiudad.entrySet())
        {

            System.out.println("Código: " + entry.getKey() + " Ciudad: " + entry.getValue());

        }

    }

    public void buscar(String codigo) {
        if (CodigoCiudad.containsKey(codigo))
        {
            System.out.println("el código coresponde a la ciudad " + CodigoCiudad.get(codigo));
        } else
        {
            System.out.println("No se encuentra el codigo en la lista");
        }
    }

    public void eliminar() {

        System.out.println("Escriba el nombre de la ciudad a eliminar ");
        String ciudad = leer.next();
        if (CodigoCiudad.containsValue(ciudad))
        {
            Iterator it = CodigoCiudad.entrySet().iterator();

            while (it.hasNext())
            {
                Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
                if (entry.getValue().equals(ciudad))
                {
                    it.remove();
                }
            }
        } else
        {
            System.out.println("no se encuentra la ciudad");
        }

    }

}
