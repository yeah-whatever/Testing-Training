package com.CaseStudy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAltoro {
WebDriver driver;
	
	public LoginAltoro(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "_uid")
	WebElement username;
	
	@FindBy(name = "passw")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnSubmit']")
	WebElement loginBtn;
	
	public void login_EasyCal(String uname , String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
