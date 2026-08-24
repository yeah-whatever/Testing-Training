package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("student")));
		username.sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("signin")).click();
	}

}
