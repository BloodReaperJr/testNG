import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    public void setup(){
        System.out.println("First: Opening Browser");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("This is login");
    }

    @Test(priority = 3)
    public void teardown(){
        System.out.println("First: Closing Browser");
    }
}
