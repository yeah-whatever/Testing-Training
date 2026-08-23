package com.SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagDemo {

	WebDriver driver;
		String baseURL = "https://www.hollandandbarrett.com/";
		@Test
		public void IDLocator(){
			driver = new ChromeDriver();
			driver.navigate().to(baseURL);
			driver.manage().window().maximize();
		}

}
