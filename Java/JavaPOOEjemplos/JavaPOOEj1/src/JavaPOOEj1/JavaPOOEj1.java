package JavaPOOEj1;

import Entidad.Persona;


public class JavaPOOEj1 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Jose", "Martinez", 16, "1234567");
        System.out.println(p1.getNombre());
        p1.setNombre("Camilo");
        System.out.println(p1.getNombre());
    }
    
}
