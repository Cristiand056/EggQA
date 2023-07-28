/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsactviidadextra1.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javacollectionsactviidadextra1.entities.Producto;

/**
 *
 * @author USER
 */
public class ProductoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto() {
        Producto pro = new Producto();

        System.out.println("Ingrese nombre");
        pro.setNombre(leer.next());

        System.out.println("Ingrese categoria");
        pro.setCategoria(leer.next());

        System.out.println("Ingrese Precio");
        pro.setPrecio(leer.nextDouble());

        System.out.println("Ingrese cantidad");
        pro.setCantidad(leer.nextInt());

        return pro;
    }

    public void leerProductos(ArrayList<Producto> lp) {
        lp.forEach((e) -> System.out.println(e.toString()));
    }

    public void actualizarProducto(ArrayList<Producto> lp, String nombre) {

        for (int i = 0; i < lp.size(); i++)
        {
            if (lp.get(i).getNombre().equals(nombre))
            {
                Producto pro = new Producto();

                System.out.println("Ingrese nombre");
                pro.setNombre(leer.next());

                System.out.println("Ingrese categoria");
                pro.setCategoria(leer.next());

                System.out.println("Ingrese Precio");
                pro.setPrecio(leer.nextDouble());

                System.out.println("Ingrese cantidad");
                pro.setCantidad(leer.nextInt());
                
                lp.set(i, pro);
            }
        }

    }

    public void eliminarProducto(ArrayList<Producto> lp, String nombre) {
        Iterator<Producto> it = lp.iterator();

        while (it.hasNext())
        {
            if (it.next().getNombre().equals(nombre))
            {
                it.remove();
            }

        }

    }

}
