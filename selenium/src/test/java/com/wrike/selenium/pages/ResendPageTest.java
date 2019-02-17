package com.wrike.selenium.pages;

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
}
