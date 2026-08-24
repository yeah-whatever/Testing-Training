package com.CaseStudy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CaseStudy.pages.LoginAltoro;
import com.CaseStudy.pages.LoginPracticeAutomation;

import Helper.BrowserFactory;

public class ExecutePracticeAutomation {
	

	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://practicetestautomation.com/practice-test-login/");
		LoginPracticeAutomation logibpageEasycal = PageFactory.initElements(driver, LoginPracticeAutomation.class);
		logibpageEasycal.login_EasyCal("student","Password123");
	}


}
