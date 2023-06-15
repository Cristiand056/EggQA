package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena CrearCadena() {
        Cadena c = new Cadena();
        String v;
        System.out.println("Ingrese la frase");
        v = leer.next();
        c.setFrase(v);
        c.setLongitud(v.length());
        return c;
    }

    public int mostrarVocales(Cadena c) {
        int cont = 0;
        String v;
        for (int i = 0; i < c.longitud; i++)
        {
            v = c.frase.substring(i + 1);
            v = v.toLowerCase();
            if (v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u"))
            {
                cont++;
            }
        }
        return cont;
    }

    public String invertirFrase(Cadena c) {
        String v, inver;
        inver = "";
        for (int i = 0; i < c.longitud; i++)
        {
            v = c.frase.substring(i, i + 1);
            v = v.toLowerCase();
            inver = v + inver;
            System.out.println("inver inter " + inver);
        }
        return inver;
    }

    public int vecesRepetido(Cadena c, String l) {
        int cont = 0;
        String v;
        for (int i = 0; i < c.longitud; i++)
        {
            v = c.frase.substring(i + 1);
            v = v.toLowerCase();
            if (v.equals(l))
            {
                cont++;
            }
        }
        return cont;
    }

    public void compararLongitud(Cadena c, String f) {
        if (c.longitud > f.length())
        {
            System.out.println("La frase es mas largar que la frase ingresada ");
        } else if (c.longitud == f.length())
        {
            System.out.println("La frases tiene la misma longitud");
        } else
        {
            System.out.println("La fraseingresada  es mas largar que la frase  ");
        }
    }

    public void unirFrases(Cadena c, String f) {
        String v;
        v = c.frase + f;
        c.setFrase(v);
    }

    public void reemplazar(Cadena c, String l, String nl) {
        String v, nv;
        nv = "";
        for (int i = 0; i < c.longitud; i++)
        {
            v = c.frase.substring(i + 1);
            v = v.toLowerCase();
            if (v.equals(l))
            {
                nv = nv + nl;
            } else
            {
                nv = nv + v;
            }
        }

        c.setFrase(nv);

    }

    public boolean contiene(Cadena c, String l) {
        String v;
        for (int i = 0; i < c.longitud; i++)
        {
            v = c.frase.substring(i + 1);
            v = v.toLowerCase();
            if (v.equals(l))
            {
                return true;
            }
        }
        return false;
    }
}
