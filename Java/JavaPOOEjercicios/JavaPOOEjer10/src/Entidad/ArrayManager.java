package Entidad;

public class ArrayManager {

    public double[] CrearArrayG(int maxi) {
        double[] a = new double[maxi];
        double aux;
        for (int i = 0; i < maxi; i++)
        {
            aux = Math.random() * 20;
            a[i] = (double) Math.round(aux * 100) / 100;
        }

        return a;
    }

    public double[] CrearArrayP(int maxi) {
        double[] a = new double[maxi];

        for (int i = 0; i < maxi; i++)
        {
            a[i] = 0.5;
        }

        return a;
    }

    public void MostrarArray(double[] a) {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
    }

    public double[] OrdenarArray(double[] a) {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[i])
                {
                    double aux = a[j];
                    a[j] = a[i];
                    a[i] = aux;
                }
            }
        }
        return a;
    }

    public double[] LlenarArray(double[] a, double[] b) {
        for (int i = 0; i < 10; i++)
        {
            b[i] = a[i];
        }
        return b;
    }

}
