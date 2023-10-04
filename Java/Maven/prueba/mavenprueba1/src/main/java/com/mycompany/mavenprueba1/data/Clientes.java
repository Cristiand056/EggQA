package com.mycompany.mavenprueba1.data;

import com.mycompany.mavenprueba1.entities.Cliente;
import java.util.ArrayList;
import java.util.Arrays;

public class Clientes {
    public static ArrayList<Cliente> lista = new ArrayList<>(
            Arrays.asList(
                    new Cliente(0, "123","jose", 2000.0, false),
                    new Cliente(1, "123", "maria", 2000.0, false),
                    new Cliente(2,"123", "camila", 2000.0, false),
                    new Cliente(3,"123", "pedro", 2000.0, false)
            )
    );
}
