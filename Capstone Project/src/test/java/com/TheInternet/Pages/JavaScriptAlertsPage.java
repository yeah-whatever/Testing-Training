package com.TheInternet.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage extends BasePage {

    private By jsAlertButton =
            By.xpath("//button[text()='Click for JS Alert']");

    private By jsConfirmButton =
            By.xpath("//button[text()='Click for JS Confirm']");

    private By jsPromptButton =
            By.xpath("//button[text()='Click for JS Prompt']");

    private By result =
            By.id("result");

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    public void clickJSAlert() {
        driver.findElement(jsAlertButton).click();
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickJSConfirm() {
        driver.findElement(jsConfirmButton).click();
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void clickJSPrompt() {
        driver.findElement(jsPromptButton).click();
    }

    public void enterPromptText(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
    }

    public void getPromptAlertText() {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Text: " + alert.getText());
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }
}