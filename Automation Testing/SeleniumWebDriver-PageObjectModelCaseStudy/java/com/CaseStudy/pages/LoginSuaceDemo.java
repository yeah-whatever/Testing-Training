package com.CaseStudy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSuaceDemo {
WebDriver driver;
	
	public LoginSuaceDemo(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginBtn;
	
	public void login_EasyCal(String uname , String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
