/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsejer6;

import javacollectionsejer6.entities.Tienda;

/**
 *
 * @author USER
 */
public class JavaCollectionsEjer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres  = {
            "e", "b", "c", "a"
        };
        
        Double[] precios = {
            1.2,
            2.3,
            4.8,
            0.5
        };
        
        Tienda t = new Tienda();
        
        for (int i = 0; i < 4; i++)
        {
            t.ingresarProducto(nombres[i], precios[i]);
        }
        System.out.println("Lista creada");
        t.mostrarProductos();
        
        t.modificarPrecio(nombres[2], precios[2]);
        System.out.println("lista Modificada");
        t.mostrarProductos();
        
        t.eliminarProducto(nombres[0]);
        System.out.println("Lista eliminada");
        t.mostrarProductos();
    }
    
}
