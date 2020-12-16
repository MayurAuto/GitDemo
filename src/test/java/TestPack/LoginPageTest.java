package TestPack;

import ObjectRepository.RedifLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

    @Test
    public void login() {
        System.setProperty("webdriver.chrome.driver", "D:\\NewDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RedifLoginPage rd = new RedifLoginPage(driver);
        rd.mailId().sendKeys("Hey");
        rd.passCode().sendKeys("ghghgh");
        
    }
}
