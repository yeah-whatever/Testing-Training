package com.CaseStudy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPracticeAutomation {
WebDriver driver;
	
	public LoginPracticeAutomation(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement loginBtn;
	
	public void login_EasyCal(String uname , String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
