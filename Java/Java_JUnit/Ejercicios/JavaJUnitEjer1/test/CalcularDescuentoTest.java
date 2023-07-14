/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.CalculadorDescuentos;
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
public class CalcularDescuentoTest {
    
    public CalcularDescuentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void comprobarDescuento() {
        CalculadorDescuentos cd = new CalculadorDescuentos();
        
        assertEquals(90.0, cd.calcular(100, 1), 0);
        assertEquals(80.0, cd.calcular(100, 2), 0);
        assertEquals(70.0, cd.calcular(100, 3), 0);
        assertEquals(100.0, cd.calcular(100, 0), 0);
    }
}
