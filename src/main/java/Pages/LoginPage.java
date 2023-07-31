package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By Email = By.id("edit-name");
    private By Password = By.id("edit-pass");
    private By Submit = By.id("edit-submit");
    private By SearchBar = By.name("search");

    public void setEmail(String username){

        driver.findElement(Email).sendKeys(username);
    }

    public void setPassword(String password){

        driver.findElement(Password).sendKeys(password);
    }
    public void submit(){

        driver.findElement(Submit).click();
    }


     public Favourites searchText(String SearchText) {
         driver.findElement(SearchBar).sendKeys(SearchText);
      return new Favourites(driver);

   }




}
