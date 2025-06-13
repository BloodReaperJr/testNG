import org.testng.annotations.*;

public class TC1 {
    @Test
    void test1(){
        System.out.println("This is test 1");
    }

    @Test
    void test2(){
        System.out.println("This is test 2");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This is before method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This is after method");
    }

    @BeforeClass
    void beforeclass(){
        System.out.println("This is before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This is after class");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This is before suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This is after suite");
    }
}
