package com.wrike.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class First {
	WebDriver driver;
	LoginPage loginPage;
	
	public First (WebDriver driver){
        this.driver = driver;
    }
	
	public void main() {
		loginPage = new LoginPage(driver);
		loginPage.getPage();
	}	
}
