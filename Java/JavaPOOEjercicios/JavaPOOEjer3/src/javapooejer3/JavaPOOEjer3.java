package javapooejer3;

import Entidad.Operacione;
import java.text.DecimalFormat;

public class JavaPOOEjer3 {

    public static void main(String[] args) {
        Operacione op = new Operacione();
        DecimalFormat df = new DecimalFormat("0.0#");

        op.crearOperacion();

        System.out.println(op.sumar());
        System.out.println(op.restar());
        System.out.println(op.multiplicar());
        System.out.println(df.format(op.dividir()));
    }

}
