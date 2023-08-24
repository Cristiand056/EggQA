package javarealacionesclasesreto;

import java.util.ArrayList;
import java.util.Arrays;
import javarealacionesclasesreto.data.nombresProductos;
import javarealacionesclasesreto.entities.Producto;
import javarealacionesclasesreto.entities.Tienda;
import javarealacionesclasesreto.services.ProductoService;
import javarealacionesclasesreto.services.TiendaService;


public class JavaRealacionesClasesReto {


    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        TiendaService ts = new TiendaService();
        ArrayList<Producto> listaPro1 = new ArrayList<>();
        ArrayList<Producto> listaPro2 = new ArrayList<>();
        ArrayList<Producto> listaPro3 = new ArrayList<>();
        
        for (int i = 0; i < 15; i++)
        {
            Double r = Math.random()*300+0.1;
            System.out.println("Random " +r);
            if(i < 5){
                listaPro1.add(ps.CrearProdutoP(i, nombresProductos.nombres.get(i), r));
            }
            else if(i < 9 & i >= 5){
                listaPro2.add(ps.CrearProdutoP(i, nombresProductos.nombres.get(i), r));
            }else{
                listaPro3.add(ps.CrearProdutoP(i, nombresProductos.nombres.get(i), r));
            }
            
            
        }
        ps.MostrarProductos(listaPro1);
        
        
        ArrayList<Tienda> listaTien =  new ArrayList<>();
        
        listaTien.add(ts.crearTiendaP(0, listaPro1, "AAAA", "AAB"));
        listaTien.add(ts.crearTiendaP(1, listaPro2, "BBBB", "BBC"));
        listaTien.add(ts.crearTiendaP(0, listaPro1, "CCCC", "CCD"));
        
        ts.AgregarProductos(listaTien.get(0));
        
        
        ts.StockProductos(listaTien.get(0));
        
        ts.VenderProductos(listaTien.get(0), 2, listaTien.get(0).getListaProductos().get(3));
        
        ts.StockProductos(listaTien.get(0));
        
    }
    
}
