/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.TaskManager;
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
public class TaskManagerTest {
    
    public TaskManagerTest() {
    }
    static TaskManager tm;
    @BeforeClass
    public static void setUpClass() {
          tm = new TaskManager ();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     
        tm.agregarTarea(0, "hacer barras");
    }
    
    @After
    public void tearDown() {
    }

    
   @Test
    public void comprovarAgreagarTarea(){
        assertTrue(tm.agregarTarea(1, "ipsum loren...."));
        assertFalse(tm.agregarTarea(1, "ipsum loren...."));
        assertTrue(tm.agregarTarea(2, "ipsum loren...."));
        
    }
    
    @Test
    public void comprovarEliminarTarea(){
        assertTrue(tm.eliminarTarea(0));
        assertFalse(tm.eliminarTarea(4));
    }
    
    @Test
    public void comprovarListarTareas(){
        assertTrue(tm.listarTareas());
   
    }
}
