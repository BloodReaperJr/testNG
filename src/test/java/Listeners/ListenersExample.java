package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenersExample {
    @Test
    public void Test1(){
        System.out.println("This is Test1");
    }

    //Should be Failed
    @Test
    public void Test2(){
        System.out.println("This is Test2");
        Assert.assertEquals("A", "B");
    }

    //Should be Skipped
    @Test
    public void Test3(){
        System.out.println("This is Test3");
        throw new SkipException("This is a skip exception");
    }
}
