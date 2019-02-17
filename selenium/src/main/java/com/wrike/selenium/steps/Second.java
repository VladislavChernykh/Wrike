package com.wrike.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class Second {
	WebDriver driver;
	LoginPage loginPage;
	
	public Second (WebDriver driver, LoginPage loginPage){
        this.driver = driver;
        this.loginPage = loginPage;
    }
	
	public LoginPage main() {
		loginPage.submitLogin();
		return loginPage;
	}	
}
