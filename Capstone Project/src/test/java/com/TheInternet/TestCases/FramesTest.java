package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TheInternet.Pages.FramesPage;

public class FramesTest extends BaseClass {

    FramesPage framesPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/iframe");

        framesPage = new FramesPage(driver);
    }

    @Test
    public void verifyFrameInteraction() {

        framesPage.switchToFrame();

        framesPage.enterText("Selenium WebDriver");

        Assert.assertEquals(
                framesPage.getEditorText(),
                "Selenium WebDriver",
                "Text was not entered correctly inside the frame");

        framesPage.switchToMainPage();
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}