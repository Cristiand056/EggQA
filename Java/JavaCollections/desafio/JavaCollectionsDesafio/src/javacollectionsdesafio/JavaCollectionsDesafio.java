package javacollectionsdesafio;

import java.util.Scanner;
import javacollectionsdesafio.entities.Habitacion;
import javacollectionsdesafio.entities.data.Datos;
import javacollectionsdesafio.service.Alojamiento;


public class JavaCollectionsDesafio {

    public static Alojamiento a = new Alojamiento();
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        boolean b = false;
        while (!b)
        {
            System.out.println("Ingrese la opción deseada");
            System.out.println("1, para hacer una reserva");
            System.out.println("2, para ver las reservas");
            System.out.println("3, para actualizar una reserva");
            System.out.println("4, para eliminar una reserva");
            System.out.println("5 u otro valor, para salir");
            int op = leer.nextInt();

            switch (op)
            {
                case 1:
                    System.out.println("Habiatciones disponibles");
                    for (Habitacion h : Datos.habitaciones)
                    {
                        System.out.println(h.toString());
                    }
                    System.out.println("Ingrese el numero de habitacion deseada");
                    int num = leer.nextInt();
                    a.crearAlojamiento(Datos.personas[1], Datos.habitaciones[num - 1]);
                    break;
                case 2:
                    a.mostrarReservas();
                    break;
                case 3:
                    System.out.println("Ingrese el numero de la reserva deseada");
                    int num1 = leer.nextInt();
                    a.actualizarReverva(num1);
                    break;
                case 4:
                    System.out.println("Ingrese el numero de la reserva deseada");
                    int num2 = leer.nextInt();
                    a.eliminarReserva(num2);
                    break;
                default:
                    b = true;
                    break;
            }

        }
    }

}
