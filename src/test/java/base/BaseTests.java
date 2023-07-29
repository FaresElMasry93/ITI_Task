package base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

@BeforeClass
    public void setup() {
    ChromeOptions option = new ChromeOptions();
    option.addArguments("--remote-allow-origins=*");
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    driver = new ChromeDriver(option);
    goHome();
    homePage = new HomePage(driver);

}
        @BeforeMethod
        public void goHome() {
        driver.get("https://the-internet.herokuapp.com/");
    }







      //  driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
      //  driver.manage().window().setSize(new Dimension( 375 ,812));
       // List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());
     //   WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
      //  inputsLink.click();
//          WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
//          inputsLink.click();
//        WebElement shiftingContent = driver.findElement(By.linkText("Example 1: Menu Element"));
//        shiftingContent.click();
//        List<WebElement> pages = driver.findElements(By.xpath("//li/a"));
//        System.out.println(pages.size());


//    @AfterClass
//        public void tearDown(){
//        driver.quit();
//    }


}
