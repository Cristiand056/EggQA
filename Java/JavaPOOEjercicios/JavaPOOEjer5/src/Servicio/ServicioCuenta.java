package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        Cuenta c = new Cuenta();
        System.out.println("Ingrese el número de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el número DNI");
        c.setDNI_cliente(leer.nextLong());
        System.out.println("Ingrese el saldo");
        c.setSaldo_actual(leer.nextInt());
        return c;
    }

    public void ingresar(double ingreso, Cuenta c) {
        double n;
        n = c.getSaldo_actual() + ingreso;
        c.setSaldo_actual((int) n);
    }

    public void retirar(double retiro, Cuenta c) {
        double n;
        n = c.getSaldo_actual() - retiro;
        if (n >= 0)
        {
            c.setSaldo_actual((int) n);
        } else
        {
            c.setSaldo_actual(0);
        }
    }

    public void extraccionRapida(int retiro, Cuenta c) {
        if (retiro <= c.getSaldo_actual() * 0.2  )
        {
            c.setSaldo_actual(c.getSaldo_actual() - retiro);
        } else
        {
            System.out.println("El valor a retirar supera el 20%, no es valido");
        }
    }

    public void consultarSaldo(Cuenta c) {
        System.out.println("El saldo es: " + c.getSaldo_actual());
    }

    public void consultarDatos(Cuenta c) {
        System.out.println(c.getDNI_cliente()+" "+c.getNumeroCuenta()+" "+c.getSaldo_actual());
    }
}
