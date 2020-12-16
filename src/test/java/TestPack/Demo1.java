package TestPack;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
    @Parameters({"URL"})
    @Test
    public void zeb(String urlName){
        System.out.println("coder");
        System.out.println(urlName);
    }
    @Test
    public void there(){
        System.out.println("2nd class");
//        Assert.assertTrue(false);
    }
    @Test
    public void hello(){
        System.out.println("2nd class 2nd Test");
    }
}
