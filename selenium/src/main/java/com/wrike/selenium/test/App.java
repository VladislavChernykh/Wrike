package com.wrike.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
    public static void main( String[] args ){
    	setSystemProperties();
    	WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://www.wrike.com");
        System.out.println("Success");
    }
    
    private static void setSystemProperties() {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\chromedriver.exe");
	}
}
