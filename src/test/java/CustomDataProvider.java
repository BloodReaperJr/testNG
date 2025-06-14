import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "LoginData")
    public Object[][] getData(){
        Object[][] data = { {"shubham","rahulshettyacademy"},{"Yash","rahulshettyacademy"},{"Anay","rahulshettyacademy"}};
        return data;
    }
}
