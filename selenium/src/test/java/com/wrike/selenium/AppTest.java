package com.wrike.selenium;

import org.openqa.selenium.WebDriver;

import com.wrike.selenium.pages.LoginPage;
import com.wrike.selenium.pages.LoginPageTest;
import com.wrike.selenium.pages.ResendPage;
import com.wrike.selenium.pages.ResendPageTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
	WebDriver driver;
	
    public AppTest( String appTestCase )
    {
        super(appTestCase);
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    public void testApp()
    {
    	App app = new App();
    	app.doFirstStep();
    	app.doSecondStep();
    	app.doThirdStep();
    	
    	app.doFourthStep();
    	testRedirectAssert(app);
    	
    	app.doFifthStep();
    	testSubmitClickButton(app);
    	
    	app.doSixthStep();
    	
    	
    	app.doSeventhStep();
    	
    	app.quit();
    	assertTrue(true);
    }
    
    private void testRedirectAssert(App app) {
    	LoginPage loginPage = new LoginPage(driver);
    	loginPage = app.getLoginPage();
    	LoginPageTest loginPageTest = new LoginPageTest(loginPage);
    	loginPageTest.testRedirect();
    }
    
    private void testSubmitClickButton(App app) {
    	ResendPage resendPage = new ResendPage(driver);
    	resendPage = app.getResendPage();
    	ResendPageTest resendPageTest = new ResendPageTest(resendPage);
    	resendPageTest.submitButtonIsClickedAssert();
    }
}
