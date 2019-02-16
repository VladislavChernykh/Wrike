package com.wrike.selenium.pages;

import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
	
	public LoginPage (WebDriver driver){
        this.driver = driver;
    }
	
    public void getPage() {
    	driver.get("https://www.wrike.com");
    }
}
