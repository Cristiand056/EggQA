package com.mycompany.mavenprueba1.entities;

import java.util.Scanner;

public class Cliente {
    private Integer ID; 
    private String nombre;
    private String password;
    private Double monto;
    private boolean Admin;
    private static Scanner read = new Scanner(System.in);
    public Cliente() {
    }

    public Cliente(Integer ID, String password,String nombre, Double monto, boolean Admin) {
        this.ID = ID;
        this.password = password;
        this.nombre = nombre;
        this.monto = monto;
        this.Admin = Admin;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }
    
    public boolean retirar(){
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
