package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TheInternet.Pages.CheckboxesPage;

public class CheckboxesTest extends BaseClass {

    CheckboxesPage checkboxesPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/checkboxes");

        checkboxesPage = new CheckboxesPage(driver);
    }

    @Test
    public void verifyCheckboxes() {

        checkboxesPage.selectCheckbox1();
        checkboxesPage.selectCheckbox2();

        Assert.assertTrue(
                checkboxesPage.isCheckbox1Selected(),
                "Checkbox 1 was not selected");

        Assert.assertTrue(
                checkboxesPage.isCheckbox2Selected(),
                "Checkbox 2 was not selected");
    }

    @AfterMethod
    public void tearDownTest() {

        tearDown();
    }
}