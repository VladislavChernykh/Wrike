package com.wrike.selenium.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ResendPageTest {
	ResendPage resendPage;

	public ResendPageTest (ResendPage resendPage){
		this.resendPage = resendPage;
	}
	
	@Test
	public void submitButtonIsClickedAssert() {
		WebElement submitButton = resendPage.getSubmitButton();
		assertTrue(submitButton.getAttribute("class").contains("wg-btn--loading"));
	}
	
	@Test
	public void resendEmailButtonIsClickedAssert() {
		WebElement resendEmailButton = resendPage.getResendEmailButton();
		assertTrue(resendEmailButton.getAttribute("class").contains("wg-btn--loading"));
	}
	
	@Test
	public void twitterElsCorrectnessAssert() {
		WebElement twitterButton = resendPage.getTwitterButton();
		WebElement twitterLink	 = resendPage.getTwitterLink();
		WebElement twitterImage  = resendPage.getTwitterImage();
		
		assertTrue(twitterButton.isDisplayed());
		assertEquals((twitterLink.getAttribute("href")),("https://twitter.com/wrike"));
		assertEquals(twitterImage.getAttribute("xlink:href"),("/content/themes/wrike/dist/img/sprite/vector//footer-icons.symbol.svg?v1#twitter"));
	}
}
