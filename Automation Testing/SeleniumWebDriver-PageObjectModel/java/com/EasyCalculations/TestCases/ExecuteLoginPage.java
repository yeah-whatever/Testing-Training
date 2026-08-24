package com.EasyCalculations.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.Pages.LoginEasyCal;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCal logibpageEasycal = PageFactory.initElements(driver, LoginEasyCal.class);
		logibpageEasycal.login_EasyCal("9740673180","raghubn@123");
	}

}
