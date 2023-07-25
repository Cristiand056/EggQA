/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollectionsactviidadextra1.entities;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Tienda {
    public Boolean venta(ArrayList<Producto> lp, String nombre){
        Boolean b = false;
        for (Producto p : lp)
        {
            if(p.getNombre().equals(nombre)){
                if(p.getCantidad()>0){
                     p.setCantidad(p.getCantidad()-1);
                     b = true;
                }
            }
        }
        return b;
    }
    
    public void reposicion(ArrayList<Producto> lp, String nombre){
        for (Producto p : lp)
        {
            if(p.getNombre().equals(nombre)){
               p.setCantidad(p.getCantidad()+1);
            }
        }
       
    
    }
     public void mostrar(ArrayList<Producto> lp){
         lp.forEach((e)-> System.out.println(e.toString()));
      }
}
