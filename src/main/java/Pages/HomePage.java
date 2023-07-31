package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import java.time.Duration;

public class HomePage {
    private WebDriver driver ;
    private By LoginButton = By.xpath("/html/body/div[2]/div/div[1]/div/div/div/div/nav/ul/li[3]/a");



   public HomePage(WebDriver driver){
       this.driver = driver;
   }


   public LoginPage signIn()
   {

     driver.findElement(LoginButton).click();
     return new LoginPage(driver);
   }
}
