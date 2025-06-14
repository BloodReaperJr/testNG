import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    void setup(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void logo(){
        WebElement logo = driver.findElement(By.cssSelector("img[alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(),"Logo isn't displayed");
    }

    @Test
    void getTitle(){
       String title = driver.getTitle();
       Assert.assertEquals("OrangeHRM",title);
    }
}
