package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Favourites {
    private WebDriver driver;
    private By OrderItem = By.xpath("/html/body/div[2]/div/div[5]/div/div/div/div[2]/div/div/div/div[5]/div/div[1]");
    private By FavoriteButton = By.xpath("/html/body/div[2]/div/div[5]/div/main/div/div/div/div[1]/article/div/div[2]/div[1]/div[6]/div[3]/div");
    private By FavoriteScreen= By.cssSelector("#wishlist-header-wrapper > div > a > span");
    private By ItemTitle = By.xpath("//*[@id=\"plp-hits\"]/div/div/article/div[1]/div/h2/a/div/span");

    public Favourites(WebDriver driver) {
        this.driver = driver;
    }

    public void selectItem (String SearchText){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(OrderItem)).click();

    }
    public void scrollPageDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(250,350)");
    }
    public void scrollPageUP() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(0,0)");
    }
    public void selectFavoriteItem(){
        scrollPageDown();
        driver.findElement(FavoriteButton).click();
        scrollPageUP();
        driver.findElement(FavoriteScreen).click();
    }

    public String getItemStatus() {
        scrollPageDown();
        return driver.findElement(ItemTitle).getText();
    }

}
