package com.wrike.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wrike.selenium.steps.First;
import com.wrike.selenium.steps.Second;

public class App {
	static WebDriver driver;
	//First first;
	Second second;
	
    public static void main( String[] args ){
    	setSystemProperties();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        doSteps(driver); 
        driver.quit();
    }
    
    private static void doSteps(WebDriver driver) {
    	//1. Open url: wrike.com;
    	First first = new First(driver);
    	first.main();
    	System.out.println("First step done");
    	
    	//2. Click "Get started for free" button near "Login" button;
    	Second second = new Second(driver);
    	second.main();
    	System.out.println("Second step done");
    	
    	//3. Fill in the email field with random generated value of email with mask “<random_text>+wpt@wriketask.qaa”​ (e.g. “​abcdef+wpt@wriketask.qaa”​ );
    	//4. Click on "Create my Wrike account" button + check with assertion that you are moved to the next page;
    	//5. Fill in the Q&A section at the left part of page (like random generated answers) + check with assertion that your answers are submitted;
    	//6. Click on "Resend email" + check it with assertion;
    	//7. Check that section "Follow us" at the site footer contains the "Twitter" button that leads to the correct url and has the correct icon.
        
    	System.out.println("Success");
    }
    
    private static void setSystemProperties() {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\chromedriver.exe");
	}
}
