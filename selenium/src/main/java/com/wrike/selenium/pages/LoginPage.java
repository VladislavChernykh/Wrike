package com.wrike.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
	By loginButtonLocator = By.cssSelector("div.wg-header__cell.wg-header__cell--xs-3.wg-header__cell--sm-6.wg-header__cell--md-5.wg-header__cell--xl-5 > div > form > button");
	
	public LoginPage (WebDriver driver){
        this.driver = driver;
    }
	
    public void getPage() {
    	driver.get("https://www.wrike.com");
    }
    
    public LoginPage submitLogin() {
        driver.findElement(loginButtonLocator).click();
        return new LoginPage(driver);    
    }
}
