package javarelacionesclasesEjer2.entities;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        if (jugadores.size() >= 6)
        {
            setJugadores(jugadores);
            setR(r);
        } else
        {
            System.out.println("Demasiados jugadores");
        }

    }

    public void ronda() {
        Integer ronda = 1;

        for (Jugador j : jugadores)
        {

            System.out.println("Ronda " + ronda);
            System.out.println(r.toString());
            if (j.disparo(r, j))
            {
                System.out.println("El jugador que perdio la ronda fue: \n "
                        + j.toString() + "\n" + "El revolver disparo en: "
                        + r.toString()
                );
                break;
            }
            ronda++;

        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }

}
