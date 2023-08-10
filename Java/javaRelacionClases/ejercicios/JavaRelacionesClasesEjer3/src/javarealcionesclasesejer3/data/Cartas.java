/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package javarealcionesclasesejer3.data;

import java.util.ArrayList;
import java.util.Arrays;
import javarealcionesclasesejer3.entiies.Carta;

/**
 *
 * @author USER
 */
public class Cartas {
    public static ArrayList<Carta> list = new ArrayList<Carta>(Arrays.asList(
            new Carta("espadas", 1), new Carta("espadas", 2), new Carta("espadas", 3), new Carta("espadas", 4),new Carta("espadas", 5),
            new Carta("espadas", 6), new Carta("espadas", 7), new Carta("espadas", 10), new Carta("espadas", 11),new Carta("espadas", 12),
            new Carta("bastos", 1), new Carta("bastos", 2), new Carta("bastos", 3), new Carta("bastos", 4),new Carta("bastos", 5),
            new Carta("bastos", 6), new Carta("bastos", 7), new Carta("bastos", 10), new Carta("bastos", 11),new Carta("bastos", 12),
            new Carta("oros", 1), new Carta("oros", 2), new Carta("oros", 3), new Carta("oros", 4),new Carta("oros", 5),
            new Carta("oros", 6), new Carta("oros", 7), new Carta("oros", 10), new Carta("oros", 11),new Carta("oros", 12),
            new Carta("copas", 1), new Carta("copas", 2), new Carta("copas", 3), new Carta("copas", 4),new Carta("copas", 5),
            new Carta("copas", 6), new Carta("copas", 7), new Carta("copas", 10), new Carta("copas", 11),new Carta("copas", 12)
    ));
}
