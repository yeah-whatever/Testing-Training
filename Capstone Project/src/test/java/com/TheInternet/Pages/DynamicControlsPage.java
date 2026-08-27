package com.TheInternet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsPage extends BasePage {

    private By checkbox = By.id("checkbox");
    private By removeButton = By.xpath("//button[text()='Remove']");
    private By addButton = By.xpath("//button[text()='Add']");
    private By message = By.id("message");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void clickRemoveButton() {

        driver.findElement(removeButton).click();
    }

    public void waitForCheckboxToDisappear() {

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(checkbox));
    }

    public void clickAddButton() {

        driver.findElement(addButton).click();
    }

    public void waitForCheckboxToAppear() {

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(checkbox));
    }

    public String getMessage() {

        return driver.findElement(message).getText();
    }
}