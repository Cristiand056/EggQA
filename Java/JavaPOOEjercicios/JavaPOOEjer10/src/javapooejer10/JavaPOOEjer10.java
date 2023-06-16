package javapooejer10;

import Entidad.ArrayManager;

public class JavaPOOEjer10 {
    
    public static void main(String[] args) {
        ArrayManager am = new ArrayManager();        
        
        double[] a50 = am.CrearArrayG(50);
        
        double[] a20 = am.CrearArrayP(20);
        
        am.MostrarArray(a50);
        am.MostrarArray(a20);
        
        a50 = am.OrdenarArray(a50);
        
        am.MostrarArray(a50);
        
        a20 = am.LlenarArray(a50, a20);
        
        am.MostrarArray(a20);
    }
    
}
