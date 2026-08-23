package com.EasyCal.TestCases;

import org.openqa.selenium.support.PageFactory;

import com.EasyCal.Pages.BaseClass;
import com.EasyCal.Pages.LoginPage;

import utility.ExcelDataReader;

public class LoginEasyCalculation extends BaseClass {

    public void loginApp() throws Exception {

        ExcelDataReader excel = new ExcelDataReader();

        LoginPage loginhrm = PageFactory.initElements(driver, LoginPage.class);

        loginhrm.login_EasyCal(
            excel.getStringData("LoginHRM", 0, 0),
            excel.getStringData("LoginHRM", 0, 1)
        );

        Thread.sleep(5000);
    }
}