package com.DataDriven.TestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataDrivenTesting {
    WebDriver driver;
    String baseurl = "https://only-testing-blog.blogspot.com/2014/05/form.html";

    @Parameters("browserName")
    @BeforeTest
    public void setUp(String browserName) {
        System.out.println("Browser Name is " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {
            
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            
            driver = new EdgeDriver();
        }
    }

    @Test
    public void LocatersDemo() throws InterruptedException {
        driver.navigate().to(baseurl);
        driver.manage().window().maximize();

        // Fill form using different locators
        driver.findElement(By.id("FirstName")).sendKeys("Abhideep");
        driver.findElement(By.name("LastName")).sendKeys("Bonigala");
        driver.findElement(By.id("EmailID")).sendKeys("Abhideep@gmail.com");
        driver.findElement(By.name("MobNo")).sendKeys("7993145185");
        driver.findElement(By.name("Company")).sendKeys("Coforge");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown() {
            driver.quit();
    }
}
