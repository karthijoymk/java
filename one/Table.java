package org.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		List<WebElement> data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement web : data) {
			String text = web.getText();
			System.out.println(text);
			}
		System.out.println("*******************************");
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement dem : row) {
			String text = dem.getText();
			System.out.println(text);
			
		}
		System.out.println("****************************");
		List<WebElement> dataa = driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		for (WebElement wq : dataa) {
			String text = wq.getText();
			System.out.println(text);
			}
		System.out.println("**************************");
		List<WebElement> tq = driver.findElements(By.xpath("//table/tbody/tr[2]/td[2]"));
		for (WebElement tw : tq) {
			String text = tw.getText();
			System.out.println(text);
			
		}
		List<WebElement> k = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		for (int i = 0; i < k.size(); i++) {
			String text = k.get(i).getText();
			System.out.println(text);
			if (i==6) {
				break;
			}
		}
		
		
	}

}
