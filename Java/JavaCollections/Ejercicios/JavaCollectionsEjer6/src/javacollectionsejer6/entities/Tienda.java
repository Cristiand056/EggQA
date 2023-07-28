/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package javacollectionsejer6.entities;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
    private HashMap<String, Double> productos = new HashMap();
    
    public void ingresarProducto(String pro, Double pre){
       productos.put(pro, pre);
    }
    
    public void modificarPrecio(String cri, Double pre){
       if(productos.containsKey(cri))
       {
          productos.replace(cri, pre);
       
       }else{
           System.out.println("No se encuentra el producto");
       }
    }
    
    public void mostrarProductos(){
        for (Map.Entry p: productos.entrySet())
        {
            System.out.println("Nombre Producto: "+p.getKey()+" Precio: "+p.getValue());
        }
    }
    
    public void eliminarProducto(String cri){
        productos.remove(cri);
    }
}
