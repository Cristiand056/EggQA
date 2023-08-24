/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarealacionesclasesreto.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javarealacionesclasesreto.entities.Producto;
import javarealacionesclasesreto.entities.Tienda;

public class TiendaService {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Tienda crearTienda(ArrayList<Producto> lp) {
        Tienda t = new Tienda();
        System.out.println("Ingrese el id de la tienda");
        t.setId(leer.nextInt());
        t.setListaProductos(lp);
        System.out.println("Ingrese la dirección de la tienda");
        t.setDirecion(leer.next());
        System.out.println("Ingrese el id de la tienda");
        t.setDirecion(leer.next());
        return t;
    }

    public Tienda crearTiendaP(Integer id, ArrayList<Producto> lp, String direccion, String Representante ) {
        Tienda t = new Tienda(id, lp, direccion, Representante);
        
        return t;
    }

    public void MostrarTienda(ArrayList<Tienda> lt) {
        lt.forEach((e)
                -> System.out.println(e.toString())
        );
    }

    public void ModificarTienda(Tienda t, ArrayList<Tienda> lt, ArrayList<Producto> lp) {
        Tienda aux = new Tienda();

        if (lt.contains(t))
        {
            int i = lt.indexOf(t);
            aux.setId(t.getId());
            aux.setListaProductos(t.getListaProductos());
            System.out.println("Ingrese la dirección de la tienda");
            aux.setDirecion(leer.next());
            System.out.println("Ingrese el representante de la tienda");
            t.getRepresentante();
            lt.set(i, aux);

        } else
        {
            System.out.println("La tienda no existe");
        }
    }

    public void EliminarTienda(Tienda t, ArrayList<Tienda> lt) {
        if (lt.contains(t))
        {
            lt.remove(t);
        } else
        {
            System.out.println("La tienda no existe");
        }
    }

    public void AgregarProductos(Tienda t) {
        HashMap<Producto, Integer> Aux = new HashMap<>();

        for (Producto producto : t.getListaProductos())
        {
            System.out.println("Ingrese la cantidad del producto: " + producto.getNombre());
            Aux.put(producto, leer.nextInt());
        }

        t.setStock(Aux);
    }

    public void VenderProductos(Tienda t, Integer cantVenta, Producto p) {
        System.out.println("Total prueva "+t.getStock().get(p));
        if (t.getStock().containsKey(p) & t.getStock().get(p) > 0 & t.getStock().get(p) >= cantVenta)
        {
            t.getStock().replace(p, t.getStock().get(p) - cantVenta);
        } else
        {

            if (t.getStock().get(p) < cantVenta)
            {
                System.out.println("No se pueden vender toda esa cantidad");
            } else
            {
                System.out.println("El producto no se encuentra en stock o se encuentra agotado");
            }
        }
    }

    public void EliminarProductos(Tienda t, Producto p) {
        t.getStock().remove(p);
    }

    public void StockProductos(Tienda t) {
        System.out.println("Inventario:");
        for (Map.Entry entry : t.getStock().entrySet())
        {
            System.out.println("Producto: " + entry.getKey() + " Cantidad: " + entry.getValue());
        }
    }

}
