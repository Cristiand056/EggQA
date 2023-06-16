/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooejer11;

import java.util.Date;
import java.util.Scanner;

public class JavaPOOEjer11 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);

        Date fechaActual = new Date(2023, 06, 15);

        System.out.println("año " + fecha.getYear());
        System.out.println("año actual " + fechaActual.getYear());

        System.out.println("diferencia entre los años " + (fechaActual.getYear() - fecha.getYear()));

    }

}
