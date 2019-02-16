package com.wrike.selenium.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class Second {
	WebDriver driver;
	LoginPage loginPage;
	By loginButtonLocator = By.className("wg-header__free-trial-button wg-btn wg-btn--green");
	
	public Second (WebDriver driver){
        this.driver = driver;
    }
	
	public void main() {
		System.out.println("Second step");
		loginPage = submitLogin();
	}	
	
	public LoginPage submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        return new LoginPage(driver);    
    }
}
