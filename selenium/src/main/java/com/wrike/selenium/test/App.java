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
    	First first = new First(driver);
    	first.main();
    	System.out.println("First step done");
    	
    	Second second = new Second(driver);
    	second.main();
    	System.out.println("Second step done");
    	
        System.out.println("Success");
    }
    
    private static void setSystemProperties() {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\chromedriver.exe");
	}
}
