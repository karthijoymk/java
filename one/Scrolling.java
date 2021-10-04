package org.one;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,1000)", "");
		Thread.sleep(3000);
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		j.executeScript("window.scroll(0,0)", "");
		Thread.sleep(3000);
		WebElement furniture = driver.findElement(By.xpath("(//span[@class='a-color-base'])[2]"));
		j.executeScript("arguments[0].scrollIntoView(true)", furniture);
		Thread.sleep(3000);
		  {
			
		}
		
	}

}
