package com.TheInternet.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLaunchTest extends BaseClass {

    @BeforeMethod
    public void setUp() {
        setup();
    }

    @Test
    public void verifyApplicationLaunch() {

        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}