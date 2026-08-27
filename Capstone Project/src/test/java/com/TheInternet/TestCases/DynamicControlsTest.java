package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TheInternet.Pages.DynamicControlsPage;

public class DynamicControlsTest extends BaseClass {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/dynamic_controls");

        dynamicControlsPage = new DynamicControlsPage(driver);
    }

    @Test
    public void verifyDynamicControlRemoval() {

        dynamicControlsPage.clickRemoveButton();

        dynamicControlsPage.waitForCheckboxToDisappear();

        Assert.assertEquals(
                dynamicControlsPage.getMessage(),
                "It's gone!",
                "Checkbox was not removed successfully");
    }

    @Test
    public void verifyDynamicControlAddition() {

        dynamicControlsPage.clickRemoveButton();

        dynamicControlsPage.waitForCheckboxToDisappear();

        dynamicControlsPage.clickAddButton();

        dynamicControlsPage.waitForCheckboxToAppear();

        Assert.assertEquals(
                dynamicControlsPage.getMessage(),
                "It's back!",
                "Checkbox was not added successfully");
    }

    @AfterMethod
    public void tearDownTest() {

        tearDown();
    }
}