/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaherenciaejer2.entities.Electrodomestico;
import javaherenciaejer2.entities.Lavadora;
import javaherenciaejer2.entities.Televisor;
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
public class ElectrodomesticosTest {
    
    public ElectrodomesticosTest() {
    }
    Electrodomestico el;
    Televisor tel;
    Lavadora lav;
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tel = new Televisor(20d, true, "blanco","G", 35.5);
        el = new Electrodomestico("cafe", "G", 35.5);
        lav = new Lavadora(35d, "blanco", "A", 40d);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void consumoTest(){
        
        assertEquals("F", el.getConsumoEnergetico());
    }
    
    @Test
    public void colorTest(){
        assertEquals("blanco", el.getColor());
    }
    
    @Test
    public void precioTelevisorTest(){
        assertEquals(2100d, tel.precioFinalTelevisor(tel), 0);
        
    }
    
    @Test
    public void precioLavdoraTest(){
        assertEquals(3000d, lav.precioFinalLavadora(lav), 0);
    }
}
