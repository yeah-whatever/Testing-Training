package com.CaseStudy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CaseStudy.pages.LoginSignalHire;

import Helper.BrowserFactory;

public class ExecuteSignalHireLogin {
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.signalhire.com/login");
		LoginSignalHire logibpageEasycal = PageFactory.initElements(driver, LoginSignalHire.class);
		logibpageEasycal.login_EasyCal("akhilan519@gmail.com","akhila@123");
	}

}
