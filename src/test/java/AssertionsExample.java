import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertionsExample {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    void setup(){
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
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
