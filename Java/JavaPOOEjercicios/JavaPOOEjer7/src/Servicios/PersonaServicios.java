package Servicios;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicios {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona CrearPersona() {
        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;

        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro)");
        sexo = leer.next();
        System.out.println("Ingrese el peso");
        peso = leer.nextFloat();
        System.out.println("Ingrese la altura");
        altura = leer.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }  
    
    public int calcularIMC(Persona p){
        double imc;
        imc = (double) p.getPeso()/(Math.pow(p.getAltura(), 2));
        //System.out.println("IMC: "+imc);
        if (imc < 20){
            return -1;
        }
        else if(imc >= 20 & imc <=25){
            return 0;
        }
        else{
            return 1;
        }      
    }
    public boolean esMayorDeEdad(Persona p){
        try{
            if(p.getEdad() >= 18){
            return true;
            }else{
                return false;
            }
        }
        catch(Exception e)
        {
               System.out.println("Valor nulo");
               return false;
        }
      
    }
}
