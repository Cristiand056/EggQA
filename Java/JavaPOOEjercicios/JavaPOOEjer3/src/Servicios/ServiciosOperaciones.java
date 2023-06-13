/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Operacione;
import java.util.Scanner;


public class ServiciosOperaciones {
    static Scanner leer = new Scanner(System.in);
    public Operacione CrearOprecion(){
        return new Operacione(leer.nextInt(), leer.nextInt());
       
    }
    public int sumar(Operacione o){
        
        return o.getNum1() + o.getNum2();
    }
}
