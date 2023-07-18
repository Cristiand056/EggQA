/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.PasswordValidator;
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
public class PassWordsTest {
    
    public PassWordsTest() {
    }
    static PasswordValidator pv;
    @BeforeClass
    public static void setUpClass() {
        pv = new PasswordValidator();
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
    public void pruebaValidadorPassword(){
        assertTrue(pv.Validar("78Ghrt*@"));
        assertFalse(pv.Validar("78Ghrt*"));
        assertFalse(pv.Validar("012adf56789"));
        assertFalse(pv.Validar("012H456789"));
        assertFalse(pv.Validar("012*456789"));
    }
}
