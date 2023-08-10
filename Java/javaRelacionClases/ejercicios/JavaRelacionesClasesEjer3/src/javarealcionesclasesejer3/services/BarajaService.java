package javarealcionesclasesejer3.services;

import java.util.ArrayList;
import java.util.Collections;
import javarealcionesclasesejer3.entiies.Baraja;
import javarealcionesclasesejer3.entiies.Carta;

public class BarajaService {

    private ArrayList<Carta> monton = new ArrayList<>();

    public void barajar(Baraja b) {
        ArrayList<Carta> barajaDesordenada = new ArrayList<>();
        Collections.shuffle(b.getCartasBaraja());

        barajaDesordenada.addAll(b.getCartasBaraja());

        b.setCartasBaraja(barajaDesordenada);
    }

    public void siguienteCarta(Baraja b) {

        ArrayList<Carta> aux = b.getCartasBaraja();
        int pos = b.getPosicion();

        if (b.getCartasBaraja().size() >0)
        {
            System.out.println("Carta eliminada-------------------------");
            System.out.println(aux.get(pos));
            System.out.println("Carta eliminada-------------------------");
            monton.add(aux.get(pos));
            aux.remove(pos);
            System.out.println("Carta siguiente-------------------------");
            System.out.println(aux.get(pos));
            System.out.println("Carta siguiente-------------------------");
            aux.remove(pos);
            b.setCartasBaraja(aux);
        } else
        {
            System.out.println("No hay más cartas");
        }
    }

    public void cartasDisponibles(Baraja b) {
        System.out.println("hay disponibles " + b.getCartasBaraja().size() + " cartas en la baraja");
    }

    public void darCartas(Baraja b, Integer num) {
        ArrayList<Carta> aux = b.getCartasBaraja();
        if (b.getCartasBaraja().size() - num >= 0)
        {
            for (int i = 0; i < num; i++)
            {
                aux.remove(b.getPosicion() + i);
            }
        }
        b.setCartasBaraja(aux);
    }

    public void cartasMonton() {
        monton.forEach((e)
                -> System.out.println(e.toString())
        );

    }

    public void mostrarBaraja(Baraja b) {
        b.getCartasBaraja().forEach((e) -> System.out.println(e.toString()));

    }
}
