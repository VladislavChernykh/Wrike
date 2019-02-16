package com.wrike.selenium.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class Second {
	WebDriver driver;
	LoginPage loginPage;
	By loginButtonLocator = By.cssSelector("div.wg-header__cell.wg-header__cell--xs-3.wg-header__cell--sm-6.wg-header__cell--md-5.wg-header__cell--xl-5 > div > form > button");
	
	public Second (WebDriver driver, LoginPage loginPage){
        this.driver = driver;
        this.loginPage = loginPage;
    }
	
	public LoginPage main() {
		loginPage.submitLogin();
		return loginPage;
	}	
}
