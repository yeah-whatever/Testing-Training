package com.TheInternet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    private By iframe = By.id("mce_0_ifr");

    private By editorBody = By.cssSelector("body#tinymce");

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void switchToFrame() {

        driver.switchTo().frame(driver.findElement(iframe));
    }

    public void enterText(String text) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript(
                "document.body.innerHTML = arguments[0];",
                text);
    }

    public String getEditorText() {

        return driver.findElement(editorBody).getText();
    }

    public void switchToMainPage() {

        driver.switchTo().defaultContent();
    }
}