package com.mycompany.mavenprueba1.entities;

import java.util.Scanner;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
    private Integer ID; 
    private String nombre;
    private String password;
    private Double monto;
    private boolean Admin;   
    
    public boolean retirar(){
        Scanner read = new Scanner(System.in);
        boolean salida=false;
        System.out.println("Ingrese el monto a retirar");
        Double monto = read.nextDouble();
        if(getMonto()-monto >=0){
            setMonto(getMonto()+monto);
            salida = true;
        }else{
            System.out.println("saldo insuficiente");
        }   
        return salida;
    }
    
    public boolean enviar(Cliente cli){
        Scanner read = new Scanner(System.in);
        boolean salida=false;
        System.out.println("Ingrese el monto a enviar");
        Double monto = read.nextDouble();
        if(getMonto()-monto >=0){
            cli.setMonto(cli.getMonto()+monto);       
            salida = true;
        }else{
            System.out.println("saldo insuficiente");
        } 
        return salida;
    }

    @Override
    public String toString() {
        return "Cliente: " + "ID=" + ID + ", nombre=" + nombre + ", monto=" + monto;
    }
    
    
}
