/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.Temperaturas;
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
public class TemperaturasTest {

    public TemperaturasTest() {
    }

    Temperaturas t;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        t = new Temperaturas();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void comprovarTemperturas() {
        assertEquals(32, t.convertirTemperaturas(0, "c").get(0), 0);
        assertEquals(273.15, t.convertirTemperaturas(0, "c").get(1), 0);
        assertEquals(0, t.convertirTemperaturas(32, "f").get(0), 0);
        assertEquals(273.15, t.convertirTemperaturas(32, "f").get(1), 0);
        assertEquals(0, t.convertirTemperaturas(273.15, "k").get(0), 0);
        assertEquals(32, t.convertirTemperaturas(273.15, "k").get(1), 0);

    }
}
