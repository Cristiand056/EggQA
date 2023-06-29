/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Entidad.Nif;
import PeliculaServicios.NifServicios;

/**
 *
 * @author Usuario
 */
public class NifApp {
    
    public static void main(String[] args) {
        
        NifServicios ns= new NifServicios();
        Nif nif= ns.crearNif();
    }
    
}
