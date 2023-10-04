package com.mycompany.mavenprueba1.services;

import static com.mycompany.mavenprueba1.data.Clientes.lista;
import com.mycompany.mavenprueba1.entities.Cliente;
import java.util.Scanner;

public class ClienteService {
    private static Scanner read = new Scanner(System.in);
    
    public boolean loginAdmin(String name, String password){
        String a = "freddy";
        String b = "freddy123";
        boolean c = false;
        if(name.equals(a) & password.equals(b)){
           return c=true;           
        }
        return c;
    }
    
    public boolean loginCli(Integer id, String password){
        boolean c = false;
        for (Cliente cli : lista) {
            if(cli.getID()==id){
                if(cli.getPassword().equals(password)){
                    c = true;               
                }
                else{
                    System.out.println("Contraseña incorecta");
                }
                break;
            }
        }
        if(!c){
            System.out.println("cliente no encontrado");
        }
              
        return c;
    }
    
    public Cliente crearCuenta(){
        
        System.out.println("ingrese el id");
        Integer id = read.nextInt();
        System.out.println("ingrese el nombre");
        String nombre = read.next();
        System.out.println("ingrese el password");
        String pass = read.next();
        double monto = read.nextDouble();
        
        return new Cliente(id, pass,nombre, monto, false);
    }
    
    public void depositar(Cliente cli){
        System.out.println("Ingrese el monto a depositar");
        Double monto = read.nextDouble();
        cli.setMonto(cli.getMonto()+monto);      
    }
    
   
}
