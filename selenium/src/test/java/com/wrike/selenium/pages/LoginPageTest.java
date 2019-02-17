package com.wrike.selenium.pages;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LoginPageTest {
	LoginPage loginPage;
	
	public LoginPageTest (LoginPage loginPage){
        this.loginPage = loginPage;
    }
	
	@Test
	public void testRedirect() {
		String linkBeforeClick = loginPage.getlinkBeforeClick();
		String linkAfterClick  = loginPage.getlinkAfterClick();
		assertFalse(linkBeforeClick.equals(linkAfterClick));
	}
}
