package javapooejer7;

import Entidad.Persona;
import Servicios.PersonaServicios;
import java.text.DecimalFormat;

public class JavaPOOEjer7 {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        DecimalFormat df = new DecimalFormat("0.00");
        
        Persona p1 = ps.CrearPersona();
        Persona p2 = ps.CrearPersona();
        Persona p3 = ps.CrearPersona();
        Persona p4 = ps.CrearPersona();

        int[] m = new int[4];
        boolean[] m1 = new boolean[4];

        int contF = 0;
        int contN = 0;
        int contG = 0;
 
        float porMEdad = 0;

        m[0] = ps.calcularIMC(p1);
        m[1] = ps.calcularIMC(p2);
        m[2] = ps.calcularIMC(p3);
        m[3] = ps.calcularIMC(p4);
        
        m1[0] = ps.esMayorDeEdad(p1);
        m1[1] = ps.esMayorDeEdad(p2);
        m1[2] = ps.esMayorDeEdad(p3);
        m1[3] = ps.esMayorDeEdad(p4);

        for (int i = 0; i < 4; i++)
        {
            if (m[i] == -1)
            {
                contF++;
                /*System.out.println(" F "+m[i]);
                System.out.println("conF "+contF);*/
            } else if (m[i] == 0)
            {
                contN++;
            } else
            {
                contG++;
            }
            if(m1[i]){
                porMEdad++;
            }
        }
        float por = ((float)contF/(float)4)*100;
        //System.out.println("por "+por);
        System.out.println("El porcentaje de personas flacas es: "+por+" y son "+contF+"Personas");
        por = ((float)contN/(float)4)*100;
        System.out.println("El porcentaje de personas normales es: "+por+" y son "+contN+"Personas");
        por = ((float)contG/(float)4)*100;
        System.out.println("El porcentaje de personas gordas es: "+por+" y son "+contG+"Personas");
        por =  (porMEdad/4)*100;
        System.out.println("El porcentaje de mayore de edad es: "+por+" y son "+porMEdad+"Personas");
        
    }

}
