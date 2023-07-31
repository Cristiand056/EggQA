/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package javacollectionsejerextra4;

import javacollectionsejerextra4.data.CodigosPostales;
import javacollectionsejerextra4.data.entities.servicio;

public class JavaCollectionsEjerExtra4 {

    public static void main(String[] args) {
        servicio s = new servicio();

        /*for (int i = 0; i < 10; i++)
        {
            s.imgresarCodigo();
        }*/
        s.imgresarCodigoA(CodigosPostales.codigos, CodigosPostales.ciudades);
        System.out.println("datos ingresados");
        s.mostrar();

        s.buscar(CodigosPostales.codigos[2]);

        s.imgresarCodigo();
        System.out.println("nuevo dat ingresado");
        s.mostrar();

        for (int i = 0; i < 3; i++)
        {
            s.eliminar();

        }
        
        System.out.println("Datos eliminados");
        s.mostrar();

    }

}
