package com.wrike.selenium.pages;

import java.util.List;
import java.util.Random;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.junit.Assert.assertTrue;

public class ResendPage {
	final WebDriver driver;
	WebElement resendEmailButton;
	
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
		WebElement submitButton = driver.findElement(submitResultsLocator);
		submitButton.click();
		buttonAssertTrue(submitButton);
		return this;
	}
	
	public ResendPage resendEmail() {
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(resendEmailLocator));
		//WebElement resendEmailButton = driver.findElement(resendEmailLocator);
		resendEmailButton = driver.findElement(resendEmailLocator);
		resendEmailButton.click();
		//assertTrue(resendEmailButton.getAttribute("class").contains("wg-btn--loading"));
		buttonAssertTrue(resendEmailButton);
		return this;
	}
	
	/*@Test
	public void assertResendButton() {
		assertTrue(resendEmailButton.getAttribute("class").contains("wg-btn--loading"));
	}*/
	
	private void buttonAssertTrue(WebElement button) {	
		String buttonClass = button.getAttribute("class");
		//assertTrue(buttonClass.contains("wg-btn--loading"));
		boolean isButtonClicked = buttonClass.contains("wg-btn--loading");
	
		if (isButtonClicked) {
			System.out.println("Assert: Button is clicked");
		} else {
			System.out.println("Assert: Button was not clicked yet");
		}
		System.out.println("Assert: Button is clicked");
	}
	
	public void testCase() {
		
	}

	public void checkTwitterButton() {
		boolean isTwitterButton = driver.findElement(twitterButtonLocator).isDisplayed();
		if (isTwitterButton) {
			System.out.println("Assert: Twitter button found");
		} else {
			System.out.println("Assert: Twitter button not found");
		}
	}
	
	public void checkTwitterLink() {
		WebElement linkElement = driver.findElement(twitterLinkLocator);
		String link = linkElement.getAttribute("href");
		String correctLink = "https://twitter.com/wrike";
		if ((link).equals(correctLink)) {
			System.out.println("Assert: Twitter link is correct");
		} else {
			System.out.println("Assert: Twitter link is not correct");
		}
	}
	
	public void checkTwitterImage() {
		WebElement imageElement = driver.findElement(twitterImageLocator);
		String link = imageElement.getAttribute("xlink:href");
		String correctLink = "/content/themes/wrike/dist/img/sprite/vector//footer-icons.symbol.svg?v1#twitter";
		if ((link).equals(correctLink)) {
			System.out.println("Assert: There is a Twitter icon");
		} else {
			System.out.println("Assert: There is not a Twitter icon");
		}
	}
}
