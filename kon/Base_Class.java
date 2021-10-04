package org.kon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	 public static WebDriver driver;
	public static void browser_Launch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get(url);
	}
	
	
	
	
		
		

	}
	
	
	
		

	
	
	


