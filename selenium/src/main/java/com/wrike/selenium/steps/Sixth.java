package com.wrike.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.ResendPage;

public class Sixth {
	WebDriver driver;
	ResendPage resendPage;
	
	public Sixth (WebDriver driver, ResendPage resendPage){
        this.driver = driver;
        this.resendPage = resendPage;
    }
	
	public ResendPage main() {
		resendPage.resendEmail();
		return resendPage;
	}	
}
