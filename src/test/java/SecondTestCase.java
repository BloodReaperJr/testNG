import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    public void setup() {
        System.out.println("Second: Opening Browser");
    }

    @Test(priority = 3)
    public void addCustomer() {
        System.out.println("Customer added");
    }

    @Test(priority = 2)
    public void searchCustomer() {
        System.out.println("Customer searched");
    }

    @Test(priority = 4)
    public void teardown() {
        System.out.println("Second: Closing Browser");
    }
}
