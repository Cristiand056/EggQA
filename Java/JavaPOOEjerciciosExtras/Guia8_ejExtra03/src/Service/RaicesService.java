/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Norbe
 */
public class RaicesService {
    
    public Raices crearRaiz(){
        
        Scanner leer = new Scanner(System.in);
        
        Raices r1 = new Raices();
        
        System.out.println("Ingresa a:");
        r1.setA(leer.nextInt());
        System.out.println("Ingresa b:");
        r1.setB(leer.nextInt());
        System.out.println("Ingresa c:");
        r1.setC(leer.nextInt());
        
        return r1;
        
    }
    
    
    public void getDiscriminante(Raices r1){
        
         r1.setDisc(Math.pow(r1.getB(), 2) - 4*r1.getA()*r1.getC());
     
        
    }
    
    public boolean tieneRaices(Raices r1){
        
        return r1.getDisc() > 0;
        
    }
    
    public boolean tieneRaiz(Raices r1){
        
        return r1.getDisc() == 0;
        
    }
    
    public void obtenerRaices(Raices r1){
        
        if(tieneRaices(r1)){
            double sol1 = (-r1.getB()+Math.sqrt(r1.getDisc()))/(2*r1.getA());
            System.out.println("Solucion 1: "+sol1);
            double sol2 = (-r1.getB()-Math.sqrt(r1.getDisc()))/(2*r1.getA());
            System.out.println("Solucion 2: "+sol2);
        }
        
    }
    
    public void obtenerRaiz(Raices r1){
        
         if(tieneRaiz(r1)){
            double sol1 = (-r1.getB()+Math.sqrt(r1.getDisc()))/(2*r1.getA());
            System.out.println(sol1);
            
        }
                
    }
    
    public void calcular(Raices r1){
        
        if (tieneRaices(r1)) {
            double sol1 = (-r1.getB() + Math.sqrt(r1.getDisc())) / (2 * r1.getA());
            System.out.println("Solucion 1 : "+sol1);
            double sol2 = (-r1.getB() - Math.sqrt(r1.getDisc())) / (2 * r1.getA());
            System.out.println("Solución 2: " + sol2);
        } else if (tieneRaiz(r1)) {

            double sol1 = (-r1.getB() + Math.sqrt(r1.getDisc())) / (2 * r1.getA());
            System.out.println(sol1);
        } else {

            System.out.println("No tiene solución.");
        }
      
    } 
}
