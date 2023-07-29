package Alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {

        @Test
    public void testAcceptAlert(){
        var alertPage = homePage.ClickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        alertPage.getResult();
            Assert.assertEquals(alertPage.getResult(),"You successfully clicked an alert");
    }
    @Test
    public void testAcceptConfirm(){
            var alertPage =homePage.ClickJavaScriptAlerts();
            alertPage.triggerConfirm();
            alertPage.acceptConfirmAlert();
            alertPage.getResult();
            Assert.assertEquals(alertPage.getResult(),"You clicked: Ok");
    }
}
