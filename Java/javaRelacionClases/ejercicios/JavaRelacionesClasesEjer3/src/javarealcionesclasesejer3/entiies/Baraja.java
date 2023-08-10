package javarealcionesclasesejer3.entiies;

import java.util.ArrayList;

public class Baraja {

    private ArrayList<Carta> cartasBaraja;
    private int posicion;

    public Baraja(ArrayList<Carta> cartasBaraja) {
        this.cartasBaraja = cartasBaraja;
        this.posicion = 0;
    }

    public ArrayList<Carta> getCartasBaraja() {
        return cartasBaraja;
    }

    public void setCartasBaraja(ArrayList<Carta> cartasBaraja) {
        this.cartasBaraja = cartasBaraja;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

}
