package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TheInternet.Pages.DynamicLoadingPage;

public class DynamicLoadingTest extends BaseClass {

    DynamicLoadingPage dynamicLoadingPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/dynamic_loading");

        dynamicLoadingPage = new DynamicLoadingPage(driver);
    }

    @Test
    public void verifyDynamicLoading() {

        dynamicLoadingPage.clickExample1();

        dynamicLoadingPage.clickStart();

        dynamicLoadingPage.waitForFinishText();

        Assert.assertEquals(
                dynamicLoadingPage.getFinishText(),
                "Hello World!",
                "Dynamic element did not load correctly");
    }

    @AfterMethod
    public void tearDownTest() {

        tearDown();
    }
}