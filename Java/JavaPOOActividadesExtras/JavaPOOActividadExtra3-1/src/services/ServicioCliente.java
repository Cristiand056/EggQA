package services;

import Entidades.Cliente;
import java.util.ArrayList;

public class ServicioCliente {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void registrarCliente(Cliente c) {
        clientes.add(c);
        System.out.println("Cliente registrado");

    }

    public void obtenerClientes() {
        
        System.out.println("Lista de los Clientes");

        for (Cliente c : clientes)
        {
            System.out.println(c.toString());
        }
    }

    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (Cliente c : clientes)
        {
            if (c.getId() == id)
            {
                c.setNombre(nombre);
                c.setEdad(edad);
                c.setAltura(edad);
                c.setPeso(edad);
                c.setObjetivo(objetivo);
            }
        }
    }

    public void eliminarCliente(int id) {
        for (int i = 0; i < clientes.size(); i++)
        {
            if (clientes.get(i).getId() == id)
            {
                clientes.remove(i);
            }
        }

    }
}
