package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParallelTest1 {
    WebDriver driver1,driver2 ;
    @Test
    void login() throws InterruptedException {
        driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement loginbutton = driver1.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));
        Assert.assertTrue(loginbutton.isDisplayed(),"Button isn't displayed");
        driver1.close();
    }

    @Test
    void getTitle() throws InterruptedException {
        driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://rahulshettyacademy.com/dropdownsPractise/");
        String title = driver2.getTitle();
        Assert.assertEquals("QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets",title);
        driver2.close();
    }

//    @AfterMethod
//    void teardown(){
//        driver.close();
//    }



}
