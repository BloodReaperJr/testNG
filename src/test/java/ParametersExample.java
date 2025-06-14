import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String url){
        
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();

        }
        driver.get(url);

    }

    @Test
    void login(){

        WebElement loginbutton = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));
        Assert.assertTrue(loginbutton.isDisplayed(),"Button isn't displayed");
    }

    @Test
    void getTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets",title);
    }

    @AfterClass
    void teardown(){
        driver.quit();
    }
}
