package com.wrike.selenium.steps;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.ResendPage;

public class Fifth {
	WebDriver driver;
	ResendPage resendPage;
	
	public Fifth (WebDriver driver, ResendPage resendPage){
        this.driver = driver;
        this.resendPage = resendPage;
    }
	
	public ResendPage main() {
		resendPage.fillQuiz();
		resendPage = resendPage.submitButtonClick();
		return resendPage;
	}	
}
