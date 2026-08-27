package com.TheInternet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage extends BasePage {

    private By example1 = By.linkText("Example 1: Element on page that is hidden");
    private By startButton = By.cssSelector("#start button");
    private By finishText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public void clickExample1() {

        driver.findElement(example1).click();
    }

    public void clickStart() {

        driver.findElement(startButton).click();
    }

    public void waitForFinishText() {

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(finishText));
    }

    public String getFinishText() {

        return driver.findElement(finishText).getText();
    }
}