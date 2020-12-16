import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MulWindows {
    public static void main(String ars[]) throws IOException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\NewDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //driver.switchTo().newWindow(WindowType.TAB);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        driver.get("http://www.qaclickacademy.com/");
        String courseName = driver.findElements(By.xpath("//li[@class='col-sm-3 col-xs-6']/div/h3/a"))
                .get(0).getText();
        System.out.println(courseName);

        driver.switchTo().window(parentWindow);
        WebElement name = driver.findElement(By.cssSelector("[name = 'name']"));
        name.sendKeys(courseName);

        //taking screenshot of a specific element
        File file = name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));

        //fetching height and width of a specific element

        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());


    }
}
