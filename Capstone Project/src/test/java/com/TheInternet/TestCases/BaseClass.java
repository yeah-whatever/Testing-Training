package com.TheInternet.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import utility.BrowserFactory;
import utility.ConfigDataProvider;

@Listeners(utility.TestListener.class)
public class BaseClass {

    public WebDriver driver;

    ConfigDataProvider config = new ConfigDataProvider();

    public void setup() {

        driver = BrowserFactory.startBrowser(config.getBrowser());

        driver.get(config.getUrl());
    }

    public void tearDown() {

        if (driver != null) {

            driver.quit();
        }
    }
}