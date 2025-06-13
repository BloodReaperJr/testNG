import org.testng.annotations.*;

public class TC2 {

    @Test
    void test3(){
        System.out.println("This is test 3");
    }

    @Test
    void test4(){
        System.out.println("This is test 4");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This is TEST2 before method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This is TEST2 after method");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("This is TEST2 before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This is TEST2 after class");
    }
}
