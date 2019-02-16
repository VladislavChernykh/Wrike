package com.wrike.selenium.steps;

import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;

public class Third {
	WebDriver driver;
	LoginPage loginPage;
	By loginButtonLocator = By.cssSelector("body > div.wg-layout.wg-layout--outline > header > div.wg-header__desktop > div.wg-header__sticky-menu > div > div > div.wg-header__cell.wg-header__cell--xs-3.wg-header__cell--sm-6.wg-header__cell--md-5.wg-header__cell--xl-5 > div > form > button");
	
	public Third (WebDriver driver){
        this.driver = driver;
    }
	
	public void main() {
		String email = getEmail();
	}	
	
	private String getEmail() {
		String template = "+wpt@wriketask.qaa";	
		String random = generateRandomText();
		String email = random + template;

		return email;
	}
	
	private String generateRandomText() {
		Random r = new Random();
		int endIndex = r.ints(1, 10).findFirst().getAsInt();
		String random = UUID.randomUUID().toString().substring(0, endIndex);
		return random;
	}
}
