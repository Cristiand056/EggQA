/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliculaServicios;

import Entidad.Nif;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NifServicios {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public Nif crearNif(){
        
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        Nif nif=new Nif();
        System.out.println("Ingrese el Dni:");
        long nifV=leer.nextLong();
        String s=String.valueOf(nifV);//Now it will return "9993939399"
        nif.setDni(nifV);
        int val=calculaD(nifV);
        String c=letras.substring(val, val+1);
        System.out.println((String)s+"-"+c);
        return nif;
    }
    
    public int calculaD(long nifV){
        int c=0;
        c=(int) nifV % 23;
        
        return c;
    }
    
}
