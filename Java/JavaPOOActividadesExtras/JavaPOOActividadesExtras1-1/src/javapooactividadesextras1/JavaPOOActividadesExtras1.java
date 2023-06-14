package javapooactividadesextras1;

import Entidad.Vehiculo;

public class JavaPOOActividadesExtras1 {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Ford mustang", "Gt500", "2020", "automovil");
        Vehiculo v2 = new Vehiculo("Yamaha", "Mt09", "2022", "motocicleta");
        Vehiculo v3 = new Vehiculo("marca", "123", "2022", "bicicleta");

        System.out.println("Avance:");

        System.out.println("Carro 5 seg " + v1.Moverse(5));
        System.out.println("Moto 5 seg " + v2.Moverse(5));
        System.out.println("Cicla 5 seg " + v3.Moverse(5));

        System.out.println("Carro 10 seg " + v1.Moverse(10));
        System.out.println("Moto 10 seg " + v2.Moverse(10));
        System.out.println("Cicla 10 seg " + v3.Moverse(10));

        System.out.println("Carro 60 seg " + v1.Moverse(60));
        System.out.println("Moto 60 seg " + v2.Moverse(60));
        System.out.println("Cicla 60 seg " + v3.Moverse(60));

        System.out.println("");

        System.out.println("Parada:");

        int a = v1.frenar(v1.Moverse(5));
        int b = v2.frenar(v2.Moverse(5));
        int c = v3.frenar(v3.Moverse(5));

        System.out.println(a + " " + b + " " + c);

        if (a > b & a > c)
        {
            System.out.println("El auto avanzo más");
        } else
        {
            if (b > c)
            {
                System.out.println("La moto avanzo más");
            } else
            {
                System.out.println("La vicicleta avanzo más");
            }
        }
    }

}
