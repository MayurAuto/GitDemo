package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PropTesting {
    static WebDriver driver;
    public static void main(String args[]) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\HP\\IdeaProjects" +
                "\\TestingWebdriver4\\src\\main\\java\\ConfigData\\config.properties");
        prop.load(fis);
        System.setProperty("webdriver.chrome.driver", "D:\\NewDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(prop.getProperty("browser"));
        String URL = prop.getProperty("url");
        driver.get(URL);

    }
}
