package com.wrike.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.ResendPage;

public class Seventh {
	WebDriver driver;
	ResendPage resendPage;
	
	public Seventh (WebDriver driver, ResendPage resendPage){
        this.driver = driver;
        this.resendPage = resendPage;
    }
	
	public void main() {
		resendPage.setTwitterElements();
	}	
}