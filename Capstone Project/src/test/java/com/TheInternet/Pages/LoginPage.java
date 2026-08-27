package com.TheInternet.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    private By username = By.id("username");

    private By password = By.id("password");

    private By loginButton = By.cssSelector("button[type='submit']");

    private By message = By.id("flash");

    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        super(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void enterUsername(String usernameValue) {

        driver.findElement(username).sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue) {

        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLoginButton() {

        driver.findElement(loginButton).click();
    }

    public String getMessage() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(message)
        ).getText();
    }

    public void login(String usernameValue, String passwordValue) {

        enterUsername(usernameValue);

        enterPassword(passwordValue);

        clickLoginButton();
    }
}