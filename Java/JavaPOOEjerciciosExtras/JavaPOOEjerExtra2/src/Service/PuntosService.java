/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Puntos;

public class PuntosService {

    public Puntos CrearPunto(int x, int y) {
        return new Puntos(x, y);
    }

    public double DistanciaPuntos(Puntos p1, Puntos p2) {
        double d = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        return d;
    }
}
