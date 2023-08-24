/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarealacionesclasesreto.entities;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author USER
 */
public class Tienda {
    private Integer id;
    private ArrayList<Producto> listaProductos;
    private HashMap<Producto, Integer> stock;
    private String direcion;
    private String representante;

    public Tienda() {
    }

    public Tienda(Integer id, ArrayList<Producto> listaProductos, String direcion, String representante) {
        this.id = id;
        this.listaProductos = listaProductos;
        this.direcion = direcion;
        this.representante = representante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public HashMap<Producto, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<Producto, Integer> stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Tienda{" + "id=" + id + ", listaProductos=" + listaProductos + ", stock=" + stock + ", direcion=" + direcion + ", representante=" + representante + '}';
    }

    
}
