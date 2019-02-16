package com.wrike.selenium.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class Second {
	WebDriver driver;
	LoginPage loginPage;
	By loginButtonLocator = By.cssSelector("body > div.wg-layout.wg-layout--outline > header > div.wg-header__desktop > div.wg-header__sticky-menu > div > div > div.wg-header__cell.wg-header__cell--xs-3.wg-header__cell--sm-6.wg-header__cell--md-5.wg-header__cell--xl-5 > div > form > button");
	
	public Second (WebDriver driver){
        this.driver = driver;
    }
	
	public void main() {
		System.out.println("Second step");
		loginPage = submitLogin();
	}	
	
	public LoginPage submitLogin() {
        driver.findElement(loginButtonLocator).click();
        return new LoginPage(driver);    
    }
}
