package com.wrike.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	final WebDriver driver;
	String linkBeforeClick;
	String linkAfterClick;
	
	By loginButtonLocator 	= By.cssSelector("div.wg-header__cell.wg-header__cell--xs-3.wg-header__cell--sm-6.wg-header__cell--md-5.wg-header__cell--xl-5 > div > form > button");
	By createAccountLocator = By.cssSelector("#modal-pro > form > label:nth-child(4) > button");
	By usernameLocator		= By.cssSelector("#modal-pro > form > label:nth-child(3) > input");
	
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
    	linkBeforeClick = driver.getCurrentUrl();
        driver.findElement(createAccountLocator).click();

        Boolean isRedirect = (new WebDriverWait(driver, 10)).until(ExpectedConditions.urlContains("resend"));
        if (isRedirect) {
        	linkAfterClick = driver.getCurrentUrl();
        } else {
        	System.out.println("Warning: Redirect was not performed");
        }
   
        ResendPage resendPage = new ResendPage(driver);   
        return resendPage;    
    }
    
    public LoginPage getLoginPage() {
    	return this;
    }
    
    String getlinkBeforeClick() {
    	return linkBeforeClick;
    }
    
    String getlinkAfterClick() {
    	return linkAfterClick;
    }
}
