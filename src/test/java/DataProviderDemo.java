import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "LoginData")
    public Object[][] getData(){
        Object[][] data = { {"shubham","rahulshettyacademy"},{"Yash","rahulshettyacademy"},{"Anay","rahulshettyacademy"}};
        return data;
    }

    @Test(dataProvider="LoginData")
    public void LoginTest(String username,String password){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(username);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        driver.close();
    }
}
