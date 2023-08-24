/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarealacionesclasesreto.services;

import java.util.ArrayList;
import java.util.Scanner;
import javarealacionesclasesreto.entities.Producto;

/**
 *
 * @author USER
 */
public class ProductoService {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto CrearProduto() {

        Producto p = new Producto();
        System.out.println("Ingrese el id");
        p.setId(leer.nextInt());
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("ingrese el precio");
        p.setPrecio(leer.nextDouble());
        return p;
    }

    public Producto CrearProdutoP(Integer id, String nombre, Double precio) {
        Producto p = new Producto(id, nombre, precio);

        return p;
    }

    public void MostrarProductos(ArrayList<Producto> lp) {
        lp.forEach((e)
                -> System.out.println(e.toString())
        );
    }

    public void ModificarProducto(Producto p, ArrayList<Producto> lp) {
        Producto aux = new Producto();

        if (lp.contains(p))
        {
            int i = lp.indexOf(p);
            aux.setId(p.getId());
            System.out.println("Producto a modificar: \n" + p.toString());
            System.out.println("Ingrese el nombre");
            aux.setNombre(leer.next());
            System.out.println("ingrese el precio");
            aux.setPrecio(leer.nextDouble());
            lp.set(i, aux);
            

        } else
        {
            System.out.println("El producto no se encuentra");
        }
    }

    public void EliminarProducto(Producto p, ArrayList<Producto> lp) {
        if (lp.contains(p))
        {
            lp.remove(p);
        } else
        {
            System.out.println("El producto no se encuentra");
        }
    }
}
