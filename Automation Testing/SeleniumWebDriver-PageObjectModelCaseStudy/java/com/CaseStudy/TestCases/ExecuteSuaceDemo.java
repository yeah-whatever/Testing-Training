package com.CaseStudy.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.CaseStudy.pages.LoginPracticeAutomation;
import com.CaseStudy.pages.LoginSuaceDemo;

import Helper.BrowserFactory;

public class ExecuteSuaceDemo {
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.saucedemo.com/");
		LoginSuaceDemo logibpageEasycal = PageFactory.initElements(driver, LoginSuaceDemo .class);
		logibpageEasycal.login_EasyCal("problem_user","secret_sauce");
	}

}
