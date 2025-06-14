import org.testng.annotations.Test;

public class Priority {
    @Test(priority = 1)
    void TestOne(){
        System.out.println("This is Test One");
    }
    @Test(priority = 5)
    void TestTwo(){
        System.out.println("This is Test Two");
    }
    @Test(priority = 10,enabled = false)
    void TestThree(){
        System.out.println("This is Test Three");
    }
    @Test(priority = 15)
    void TestFour(){
        System.out.println("This is Test Four");
    }
}
