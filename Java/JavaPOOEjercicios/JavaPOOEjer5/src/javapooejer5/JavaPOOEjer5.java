/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooejer5;

import Entidad.Cuenta;
import Servicio.ServicioCuenta;

/**
 *
 * @author USER
 */
public class JavaPOOEjer5 {

    public static void main(String[] args) {
       ServicioCuenta sc = new ServicioCuenta();
       
       Cuenta c = sc.crearCuenta();
       
       sc.ingresar(150, c);
        sc.consultarSaldo(c);
       sc.retirar(45, c);
        sc.consultarSaldo(c);
       sc.extraccionRapida(25, c);
        sc.consultarSaldo(c);
        
       sc.consultarSaldo(c);
       sc.consultarDatos(c);
    }
    
}
