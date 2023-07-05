package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By TriggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By results =By.id("result");
    private By TriggerConfirmButton=By.xpath("//button[text()='Click for JS Confirm']");

    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void triggerAlert(){
        driver.findElement(TriggerAlertButton).click();

    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(results).getText();
    }
    public void triggerConfirm(){
        driver.findElement(TriggerConfirmButton).click();
    }
    public void acceptConfirmAlert(){
        driver.switchTo().alert().accept();
    }
    public String getConfirmResukt(){
        return driver.findElement(results).getText();
    }
}
