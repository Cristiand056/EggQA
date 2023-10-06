package pruebaTestNg;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;


public class SeleniumTestNGTest {

    public SeleniumTestNGTest() {
    }
    
    WebDriver driver = null;
    
    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
    
    @org.testng.annotations.Test
    public void testA(){
        String diverPath = "C:\\Users\\USER\\Desktop\\Archivos_yo\\QA Globant\\Java\\Selenium\\pruebas\\SeleniumTest\\src\\main\\java\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", diverPath);
        driver = new ChromeDriver();
        driver.navigate().to("https://wikipedia.org");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Microsoft");
        
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
        
        try {
            Thread.sleep(3000); // Wait for 3 seconds (for demonstration purposes)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement pageTitle = driver.findElement(By.id("firstHeading"));
        
        Assert.assertEquals("Microsoft", pageTitle.getText());
        
        java.util.List<WebElement> anchorLinks = driver.findElements(By.tagName("a"));
        for (WebElement anchor : anchorLinks) {
            String linkText = anchor.getText();
            if (!linkText.isEmpty()) {
                System.out.println(linkText);
            }
        }
        
        driver.close();
    }
    
}
