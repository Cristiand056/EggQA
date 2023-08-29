/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaherenciaejer2.entities;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Televisor extends Electrodomestico{
    protected Double resolucion;
    protected Boolean sintonizadorTDT;

    public Televisor() {
       
    }

    public Televisor(Double resolucion, Boolean sintonizadorTDT, String color, String consumoEnergetico, Double peso) {
        super(color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    protected Double precioFinal(Electrodomestico e) {
        return super.precioFinal(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String comprobarColor(String color) {
        return super.comprobarColor(color); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String comprobarConsumo(String letra) {
        return super.comprobarConsumo(letra); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Double precioFinalTelevisor(Televisor e){
        Double aux = precioFinal(e); 
        
        if(e.sintonizadorTDT){
            aux += 500d;
        }
        
        if(e.resolucion > 40){
            aux += aux*0.3;
        }
        e.setPrecio(aux);
        return aux;
    }
    

    @Override
    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el color");
        String color = comprobarColor(leer.next());
        System.out.println("Ingrese el consumo energetico");
        String tipo = comprobarConsumo(leer.next());
        System.out.println("Ingrese el peso");
        Double peso = leer.nextDouble();
        System.out.println("Ingrese la resolución");
        Double resolucion = leer.nextDouble();
        System.out.println("Ingrese si sintonizador TDT ingrese 's' ");
         Boolean tdt;
        if(leer.next().toLowerCase().equals("s")){
            tdt = true;
        }else{
            tdt = false;
        }
        
        Televisor e = new Televisor(resolucion, tdt, color, tipo, peso);
        precioFinalTelevisor(e);
        return e;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + "Color= "+super.color+" Precio= "+super.precio;
    }
    
    
    
    
}
