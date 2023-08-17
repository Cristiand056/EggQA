/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javarelacionesclasesejerextra2.entities.Espectador;
import javarelacionesclasesejerextra2.entities.Pelicula;
import javarelacionesclasesejerextra2.entities.Sala;
import javarelacionesclasesejerextra2.entities.data.Data;
import javarelacionesclasesejerextra2.services.SalaService;
import javarelacionesclasesejerextra2.utils.Herramientas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class ExtraTest {

    SalaService ss;
    Pelicula p;
    Herramientas h;
    Espectador espectador1;
    Espectador espectador2;
    Espectador espectador3;
    Espectador espectador4;
    Sala sala;

    public ExtraTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ss = new SalaService();
        p = new Pelicula("a", 2.8, 11, "asd");
        h = new Herramientas();
        espectador1 = new Espectador("A", 18, 2.8);
        espectador2 = new Espectador("B", 18, 2.8);
        espectador3 = new Espectador("C", 4, 2.8);
        espectador4 = new Espectador("C", 15, 2.4);
        sala = ss.crearSala(p, Data.sala, 2.4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void asignarAsientosTest() {
        System.out.println("Asignar asiento");
        int testValue1 = ss.asignarAsiento(sala, espectador1, 0, 0);
        assertEquals(200, testValue1);
        System.out.println("Asiento asignado");
        int testValue2 = ss.asignarAsiento(sala, espectador2, 0, 0);
        assertEquals(300, testValue2);
        System.out.println("Asientos no validos ");
        int testValue3 = ss.asignarAsiento(sala, espectador3, 0, 1);
        assertEquals(400, testValue3);
        int testValue4 = ss.asignarAsiento(sala, espectador3, 0, 1);
        assertEquals(400, testValue4);

    }

}
