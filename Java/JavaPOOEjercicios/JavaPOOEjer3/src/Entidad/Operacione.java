package Entidad;
//import java.text.DecimalFormat;

import java.util.Scanner;

public class Operacione {

    static Scanner leer = new Scanner(System.in);
    private int num1;
    private int num2;

    public Operacione() {

    }

    public Operacione(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    private void setNum1(int num1) {
        this.num1 = num1;
    }

    private void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        setNum1(leer.nextInt());
        setNum2(leer.nextInt());
    }

    public int sumar() {
        int sum;

        sum = num1 + num2;

        return sum;
    }

    public int restar() {
        int res;

        res = num1 - num2;

        return res;
    }

    public int multiplicar() {
        int mul;

        mul = num1 * num2;

        return mul;
    }

    public float dividir() {
        float div;
        if (num2 == 0)
        {
            System.out.println("Error");
            return 0;
        } else
        {
            div = (float) num1 / num2;
            //System.out.println(num1);
            //System.out.println(num2);
            //System.out.println(div );
            return div;
        }
        
    }
}
