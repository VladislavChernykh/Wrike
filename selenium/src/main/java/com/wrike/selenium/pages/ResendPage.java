package com.wrike.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResendPage {
	WebDriver driver;
	By resendEmailLocator 	= By.cssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--order-1.wg-cell--md-5.wg-cell--md-5.wg-cell--md-offset-1.wg-cell--lg-4.wg-cell--lg-offset-1 > p:nth-child(5) > button");
	By submitResultsLocator = By.cssSelector("body > div.wg-layout.wg-layout--outline > main > div > div > div.section.section-resend-main.section-resend-main-va.section-resend-main--survey > div > div.wg-cell.wg-cell--md-6.wg-cell--lg-7 > div > form > button");
	By twitterButtonLocator = By.cssSelector("div.wg-footer__social-block > div > ul > li:nth-child(1)");
	By twitterLinkLocator 	= By.cssSelector("div.wg-footer__social-block > div > ul > li:nth-child(1) > a");
	By twitterImageLocator 	= By.cssSelector("div.wg-footer__social-block > div > ul > li:nth-child(1) > a > svg > use");
	
	public ResendPage (WebDriver driver){
        this.driver = driver;
    }
	
	public ResendPage resendEmail() {
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(resendEmailLocator));
		driver.findElement(resendEmailLocator).click();
		return this;
	}
	
	public void checkTwitterButton() {
		boolean isTwitterButton = driver.findElement(twitterButtonLocator).isDisplayed();
		if (isTwitterButton) {
			System.out.println("Twitter button found");
		} else {
			System.out.println("Twitter button not found");
		}
	}
	
	public void checkTwitterLink() {
		WebElement linkElement = driver.findElement(twitterLinkLocator);
		String link = linkElement.getAttribute("href");
		String correctLink = "https://twitter.com/wrike";
		if ((link).equals(correctLink)) {
			System.out.println("Twitter link is correct");
		} else {
			System.out.println("Twitter link is not correct");
		}
	}
	
	public void checkTwitterImage() {
		WebElement imageElement = driver.findElement(twitterImageLocator);
		String link = imageElement.getAttribute("xlink:href");
		String correctLink = "/content/themes/wrike/dist/img/sprite/vector//footer-icons.symbol.svg?v1#twitter";
		if ((link).equals(correctLink)) {
			System.out.println("There is a Twitter icon");
		} else {
			System.out.println("There is not a Twitter icon");
		}
	}
}
