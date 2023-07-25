package javacollectionsactviidadextra1;

import java.util.ArrayList;
import javacollectionsactviidadextra1.data.Productos;
import javacollectionsactviidadextra1.entities.Producto;
import javacollectionsactviidadextra1.entities.Tienda;
import javacollectionsactviidadextra1.services.ProductoService;

public class JavaCollectionsActviidadExtra1 {

    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        Tienda t = new Tienda();
        ArrayList<Producto> listaProductos = new ArrayList<>();

        for (int i = 0; i < Productos.productosData.length; i++)
        {
            listaProductos.add(Productos.productosData[i]);
        }

        t.mostrar(listaProductos);
        System.out.println("Venta");
        t.venta(listaProductos, "b");
        t.mostrar(listaProductos);
        System.out.println("reposicion");
        t.reposicion(listaProductos, "b");
        t.mostrar(listaProductos);
        System.out.println("prueba CRUD");
        System.out.println("C");
        listaProductos.add(ps.crearProducto());
        t.mostrar(listaProductos);
        System.out.println("U");
        ps.actualizarProducto(listaProductos, "a");
        t.mostrar(listaProductos);
        System.out.println("D and R");
        ps.eliminarProducto(listaProductos, "b");
        ps.leerProductos(listaProductos);

    }
}
