package com.WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutWaits {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.findElement(By.id("FromSector_show")).sendKeys("Delhi",Keys.ENTER);
		driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai",Keys.ENTER);
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.id("frth_6_22/08/2026")).click();
		driver.findElement(By.className("srchBtnSe")).click();
	}
	

}
