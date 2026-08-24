package com.WaitsInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("#start button")).click();
		
		Wait<WebDriver> wait =new FluentWait<>(driver)
				    .withTimeout(Duration.ofSeconds(2))
				    .pollingEvery(Duration.ofMillis(300))
				    .ignoring(NoSuchElementException.class);
		
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		System.out.println(text.getText());
		driver.quit();
	}


}
