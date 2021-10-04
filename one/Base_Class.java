package org.one;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	
    public static WebDriver driver;
	
	public static void browse_Launch(String s) {
		// TODO Auto-generated method stub

	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	driver.get(s);
	}
	public static void click_On_Element(WebElement s)  {
		s.click();
		
	}
	
	public static void screen_Shot(String path) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Screenshot//name.png");
		FileUtils.copyFile(screenshotAs, des);
		
		
		
		

	}
	
		
		
		
	}


