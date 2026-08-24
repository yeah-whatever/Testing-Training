package com.CaseStudy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSignalHire {
WebDriver driver;
	
	public LoginSignalHire(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "_email")
	WebElement email;
	
	@FindBy(name = "_password")
	WebElement password;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement loginBtn;
	
	public void login_EasyCal(String uname , String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

}
