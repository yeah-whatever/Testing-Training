package com.TheInternet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {

    private By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
    private By checkbox2 = By.xpath("(//input[@type='checkbox'])[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCheckbox1Selected() {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean isCheckbox2Selected() {
        return driver.findElement(checkbox2).isSelected();
    }

    public void selectCheckbox1() {
        if (!isCheckbox1Selected()) {
            driver.findElement(checkbox1).click();
        }
    }

    public void selectCheckbox2() {
        if (!isCheckbox2Selected()) {
            driver.findElement(checkbox2).click();
        }
    }

    public void deselectCheckbox1() {
        if (isCheckbox1Selected()) {
            driver.findElement(checkbox1).click();
        }
    }

    public void deselectCheckbox2() {
        if (isCheckbox2Selected()) {
            driver.findElement(checkbox2).click();
        }
    }
}