package com.wrike.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;
import com.wrike.selenium.pages.ResendPage;

public class Fourth {
	WebDriver driver;
	LoginPage loginPage;
	ResendPage resendPage;
	
	public Fourth (WebDriver driver, LoginPage loginPage){
        this.driver = driver;
        this.loginPage = loginPage;
    }
	
	public ResendPage main(String email) {
		loginPage.typeEmail(email);
		resendPage = loginPage.createAccount();
		return resendPage;
	}	
}
