package com.wrike.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
	By loginButtonLocator = By.cssSelector("div.wg-header__cell.wg-header__cell--xs-3.wg-header__cell--sm-6.wg-header__cell--md-5.wg-header__cell--xl-5 > div > form > button");
	By usernameLocator = By.cssSelector("#modal-pro > form > label:nth-child(3) > input");
	By createAccountLocator = By.cssSelector("#modal-pro > form > label:nth-child(4) > button");
	
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
    
    public LoginPage typeEmail(String email) {
        driver.findElement(usernameLocator).sendKeys(email);
        return this;    
    }
    
    public ResendPage createAccount() {
        driver.findElement(createAccountLocator).click();
        ResendPage resendPage = new ResendPage(driver);
        return resendPage;    
    }
}
