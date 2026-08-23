package com.BrowserCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	@Test
	public void BrowserTitle() {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		String BrowserTitle =driver.getTitle();
		System.out.println(BrowserTitle);
		
		String BrowserURL =driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		String BrowserPageSource =driver.getPageSource();
		System.out.println(BrowserPageSource);
		
		driver.quit();
		
	}
}
