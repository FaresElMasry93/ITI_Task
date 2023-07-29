package login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;




public class LoginTests extends BaseTests {

   @Test
   public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.setUsername("tomsmith");
        SecureAreaPage SecureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(SecureAreaPage.getAlertText().contains("You logged into a secure area!"),
                "Alert text is incorrect");




    }
}

