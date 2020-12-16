package TestPack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class ProviderTest {

        public static Logger log = LogManager.getLogger(ProviderTest.class.getName());
     static WebDriver driver;

    @Test
    public void loginTest(){
        ChromeOptions op = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "D:\\NewDriver\\chromedriver.exe");
       // op.addArguments("headless");
        driver = new ChromeDriver(op);
        log.info("Chrome driver is initialized");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.get("http://www.qaclickacademy.com/");
        log.info("Navigated to QA click academy web site");

//        driver.findElement(By.xpath("//a[contains(@href, 'sign_in')]")).click();
//        driver.findElement(By.id("user_email")).sendKeys(username);
//        driver.findElement(By.id("user_password")).sendKeys(password);

    }
//    @DataProvider
//    public Object[][] getData(){
//        Object[][] data = new Object[1][2];
//        //1st set of data will be --
//        data[0][0] = "amayur@gmail.com";
//        data[0][1] = "1244455";
//
//        //2nd set if data will be
////        data[1][0] = "Mayur@gmail.com";
////        data[1][1] = "12556";
//
//        return data;
//
//    }
//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
}
