package TestNg;

import com.mycompany.mavenprueba1.entities.PruebaTestNg;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class testngPrueba {
    static PruebaTestNg prueba;
    public Logger log = Logger.getLogger(testngPrueba.class);
    
    @BeforeClass
    public void beforeClass(){
        prueba = new PruebaTestNg();
    }
    
    
    @Test
    public void iniciarSecion(){
        System.out.println("Se llama a iniciar secion");
        Assert.assertTrue(prueba.login());
        log.info(prueba.login());
    }
    
    
}
