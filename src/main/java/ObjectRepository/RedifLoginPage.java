package ObjectRepository;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedifLoginPage {

    WebDriver driver;
    public RedifLoginPage(WebDriver driver){
       //this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  //By userName = By.id("login1");
  //By passWord = By.id("password");

  @FindBy(id ="login1")
  WebElement userName;

  @FindBy(id = "password")
  WebElement passWord;

  public WebElement mailId(){
      return userName;
  }

  public WebElement passCode(){
      return passWord;
  }

}
