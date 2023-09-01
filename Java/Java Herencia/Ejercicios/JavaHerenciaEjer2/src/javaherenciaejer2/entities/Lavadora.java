package javaherenciaejer2.entities;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lavadora extends Electrodomestico{
    
    protected Double carga;
    
    public Lavadora() {
    }

    public Lavadora(Double carga, String color, String consumoEnergetico, Double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    @Override
    protected Double precioFinal(Electrodomestico e) {
        return super.precioFinal(e); 
    }

   public Double precioFinalLavadora(Lavadora e){
       Double aux =  precioFinal(e);
       
       if(e.carga > 30){
           aux += 500d;
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
        System.out.println("Ingrese la carga");
        Double carga = leer.nextDouble();
        Lavadora e = new Lavadora(carga, color, tipo, peso);
        precioFinalLavadora(e);
        return e;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso +'}';
    }

    
    
    
}
