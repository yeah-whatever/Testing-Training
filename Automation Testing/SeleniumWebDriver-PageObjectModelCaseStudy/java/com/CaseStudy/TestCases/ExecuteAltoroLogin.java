package com.CaseStudy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CaseStudy.pages.LoginAltoro;

import Helper.BrowserFactory;

public class ExecuteAltoroLogin {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://altoro.testfire.net/login.jsp");
		LoginAltoro logibpageEasycal = PageFactory.initElements(driver, LoginAltoro.class);
		logibpageEasycal.login_EasyCal("jsmith","demo123");
	}


}
