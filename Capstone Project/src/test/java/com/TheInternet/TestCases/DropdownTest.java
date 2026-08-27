package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TheInternet.Pages.DropdownPage;

public class DropdownTest extends BaseClass {

    DropdownPage dropdownPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/dropdown");

        dropdownPage = new DropdownPage(driver);
    }

    @Test
    public void verifyDropdownSelection() {

        dropdownPage.selectByVisibleText("Option 1");

        Assert.assertEquals(
                dropdownPage.getSelectedOption(),
                "Option 1",
                "Dropdown selection is incorrect");
    }

    @AfterMethod
    public void tearDownTest() {

        tearDown();
    }
}