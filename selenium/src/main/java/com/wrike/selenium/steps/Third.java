package com.wrike.selenium.steps;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class Third {
	WebDriver driver;
	LoginPage loginPage;
	
	public Third (WebDriver driver, LoginPage loginPage){
        this.driver = driver;
        this.loginPage = loginPage;
    }
	
	public void main() {
		String email = getEmail();
		loginPage.typeEmail(email);
	}	
	
	private String getEmail() {
		String template = "+wpt@wriketask.qaa";	
		String random 	= generateRandomText();
		String email 	= random + template;
		return email;
	}
	
	private String generateRandomText() {
		Random r = new Random();
		int endIndex = r.ints(1, 10).findFirst().getAsInt();
		String random = UUID.randomUUID().toString().substring(0, endIndex);
		return random;
	}
}
