package Entidad;

public class Matematica {

    private int num1;
    private int num2;

    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int devolverMayor() {
        if (num1 > num2)
        {
            return num1;
        } else
        {
            return num2;
        }

    }

    public double calcularPotencia() {

        if (num1 > num2)
        {
            return Math.pow((double) num1, num2);
        } else
        {
            return Math.pow((double) num2, num1);
        }
    }

    public double calculaRaiz() {
        if (num1 > num2)
        {
            return Math.pow(num2, (1.0 / num1));
        } else
        {
            return Math.pow(num1, (1.0 / num2));
        }
    }
}
