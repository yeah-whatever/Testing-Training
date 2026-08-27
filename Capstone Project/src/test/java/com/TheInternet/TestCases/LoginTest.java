package com.TheInternet.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TheInternet.Pages.LoginPage;

import utility.ExcelDataReader;

public class LoginTest extends BaseClass {

    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {

        setup();

        driver.navigate().to(
                "http://the-internet.herokuapp.com/login");

        loginPage = new LoginPage(driver);
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return ExcelDataReader.getLoginData();
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password) {

        loginPage.login(username, password);

        String message = loginPage.getMessage();

        if (password.equals("SuperSecretPassword!")) {

            Assert.assertTrue(
                    message.contains("You logged into a secure area!"),
                    "Valid login failed");

        } else {

            Assert.assertTrue(
                    message.contains("Your password is invalid!"),
                    "Invalid login was not handled correctly");
        }
    }

    @AfterMethod
    public void tearDownTest() {

        tearDown();
    }
}