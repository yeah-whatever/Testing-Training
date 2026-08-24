package com.multipleframes.testdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.Helper;

public class MultipleFrames {
	
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		driver = Helper.startBrowser("Chrome");
		driver.navigate().to("file:///C:/Iframes/IFrame.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void multiFrame() throws Exception {
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.xpath("//input[@id='log_email']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='log_password']")).sendKeys("Reshma");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().to("file:///C:/Iframes/IFrame.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/a")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		
		driver.navigate().to("file:///C:/Iframes/IFrame.html");
		driver.switchTo().frame("My Store");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println(driver.getTitle());
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}