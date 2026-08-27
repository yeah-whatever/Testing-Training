package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TheInternet.Pages.JavaScriptAlertsPage;

public class JavaScriptAlertsTest extends BaseClass {

    JavaScriptAlertsPage alertsPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/javascript_alerts");

        alertsPage = new JavaScriptAlertsPage(driver);
    }

    @Test
    public void verifyJSAlert() {

        alertsPage.clickJSAlert();

        alertsPage.acceptAlert();

        Assert.assertEquals(
                alertsPage.getResult(),
                "You successfully clicked an alert",
                "JS Alert was not handled correctly");
    }

    @Test
    public void verifyJSConfirmDismiss() {

        alertsPage.clickJSConfirm();

        alertsPage.dismissAlert();

        Assert.assertEquals(
                alertsPage.getResult(),
                "You clicked: Cancel",
                "JS Confirm was not dismissed correctly");
    }

    @Test
    public void verifyJSPrompt() {

        alertsPage.clickJSPrompt();

        alertsPage.getPromptAlertText();

        alertsPage.enterPromptText("Selenium");

        alertsPage.acceptAlert();

        Assert.assertEquals(
                alertsPage.getResult(),
                "You entered: Selenium",
                "JS Prompt was not handled correctly");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}