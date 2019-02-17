package com.wrike.selenium;

import org.junit.Test;

import com.wrike.selenium.pages.LoginPage;
import com.wrike.selenium.pages.LoginPageTest;
import com.wrike.selenium.pages.ResendPage;
import com.wrike.selenium.pages.ResendPageTest;

import junit.framework.TestCase;

public class AppTest extends TestCase{
    
    @Test
    public void testApp(){
    	App app = new App();
    	app.doFirstStep();
    	app.doSecondStep();
    	app.doThirdStep();
    	
    	app.doFourthStep();
    	testRedirectAssert(app);
    	
    	app.doFifthStep();
    	testSubmitClickButton(app);
    	
    	app.doSixthStep();
    	testResendEmailClickButton(app);
    	
    	app.doSeventhStep();
    	testCheckTwitterProperties(app);
    	
    	app.quit();
    	assertTrue(true);
    }
    
    private void testRedirectAssert(App app) {
    	LoginPage loginPage = new LoginPage(null);
    	loginPage = app.getLoginPage();
    	LoginPageTest loginPageTest = new LoginPageTest(loginPage);
    	loginPageTest.testRedirect();
    }
    
    private void testSubmitClickButton(App app) {
    	ResendPage resendPage = new ResendPage(null);
    	resendPage = app.getResendPage();
    	ResendPageTest resendPageTest = new ResendPageTest(resendPage);
    	resendPageTest.submitButtonIsClickedAssert();
    }
    
    private void testResendEmailClickButton(App app) {
    	ResendPage resendPage = new ResendPage(null);
    	resendPage = app.getResendPage();
    	ResendPageTest resendPageTest = new ResendPageTest(resendPage);
    	resendPageTest.resendEmailButtonIsClickedAssert();
    }
    
    private void testCheckTwitterProperties(App app) {
    	ResendPage resendPage = new ResendPage(null);
    	resendPage = app.getResendPage();
    	ResendPageTest resendPageTest = new ResendPageTest(resendPage);
    	resendPageTest.twitterElsCorrectnessAssert();
    }
}
