package com.wrike.selenium.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResendPage {
	final WebDriver driver;
	WebElement resendEmailButton;
	WebElement submitButton;
	
	WebElement twitterButton;
	WebElement twitterLink;
	WebElement twitterImage;
	
	By firstBarLocator  = By.cssSelector("div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(6)");
	By secondBarLocator = By.cssSelector("div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(8)");
	By thirdBarLocator  = By.cssSelector("div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > div:nth-child(10)");
	
	By resendEmailLocator 	= By.cssSelector("div.wg-cell.wg-cell--order-1.wg-cell--md-5.wg-cell--md-5.wg-cell--md-offset-1.wg-cell--lg-4.wg-cell--lg-offset-1 > p:nth-child(5) > button");
	By submitResultsLocator = By.cssSelector("div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > button");
	By twitterButtonLocator = By.cssSelector("div.wg-footer__social-block > div > ul > li:nth-child(1)");
	By twitterLinkLocator 	= By.cssSelector("div.wg-footer__social-block > div > ul > li:nth-child(1) > a");
	By twitterImageLocator 	= By.cssSelector("div.wg-footer__social-block > div > ul > li:nth-child(1) > a > svg > use");
	
	public ResendPage (WebDriver driver){
        this.driver = driver;
    }
	
	public void fillQuiz() {
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(thirdBarLocator));
		try {
			WebElement firstBar = driver.findElement(firstBarLocator);
			selectRandomItems(firstBar);

			WebElement secondBar = driver.findElement(secondBarLocator);
			selectRandomItems(secondBar);

			WebElement thirdBar = driver.findElement(thirdBarLocator);
			selectRandomItems(thirdBar);
		} catch (Exception e) {
			System.out.println("Required bar was not found");
		}
	}
	
	private void selectRandomItems(WebElement Bar) {
		List<WebElement> BarEls = Bar.findElements(By.tagName("button"));
		Random random = new Random();
		int index = random.nextInt(BarEls.size()-1);
		BarEls.get(index).click();
	}
	
	public ResendPage submitButtonClick() {
		submitButton = driver.findElement(submitResultsLocator);
		submitButton.click();
		return this;
	}
	
	public ResendPage resendEmail() {
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(resendEmailLocator));
		resendEmailButton = driver.findElement(resendEmailLocator);
		resendEmailButton.click();
		return this;
	}
	
	public void setTwitterElements() {
		twitterButton = driver.findElement(twitterButtonLocator);
		twitterLink   = driver.findElement(twitterLinkLocator);
		twitterImage  = driver.findElement(twitterImageLocator);
	}
	
	WebElement getResendEmailButton() {
		return resendEmailButton;
	}
	
	WebElement getSubmitButton() {
		return submitButton;
	}
	
	WebElement getTwitterButton() {
		return twitterButton;
	}
	
	WebElement getTwitterLink() {
		return twitterLink;
	}
	WebElement getTwitterImage() {
		return twitterImage;
	}	
}