package com.NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationMethods {
	WebDriver driver;
	String baseurl = "https://practicetestautomation.com/practice-test-login/";
	String baseBackurl = "https://www.google.com/";
	String baseNavurl = "https://login.yahoo.com/";
	
	@Test(priority = 0)
	public void NavigationDemo(){
		driver =new ChromeDriver();
		driver.navigate().to(baseurl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
		
	}
	
	@Test(priority = 1)
	public void NavigationBackDemo() {
		driver =new ChromeDriver();
		driver.get(baseBackurl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to(baseNavurl);
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		
	}
	
	@Test(priority = 2)
	{
		
	}
	
	@Test(priority = 3)
	public void NavigateForward(){
		driver =new ChromeDriver();
		driver.get(baseBackurl);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.navigate().to(baseNavurl);
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().refresh();
		
	}
}
