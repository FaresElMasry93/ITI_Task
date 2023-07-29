package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class UploadFile {
    private WebDriver driver;
    private By uploadButton=By.id("file-submit");
    private By uploadFile=By.id("file-upload");

    public UploadFile(WebDriver driver){
        this.driver=driver;
    }
    public void clickUpload(){
        driver.findElement(uploadButton).click();
    }
    public void getFilePath (String absoluteFilePath){
        driver.findElement(uploadFile).sendKeys(absoluteFilePath);
        clickUpload();
    }






}
