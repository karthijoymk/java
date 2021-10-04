package org.one;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		WebElement men = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));
		a.moveToElement(men).build().perform();
		WebElement d = driver.findElement(By.xpath("//a[@href='/men-tshirts']"));
		d.click();
		
		Thread.sleep(3000);
		
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		List<Integer> k = new ArrayList<>();
		for (int i = 0; i < price.size(); i++) {
			String text = price.get(i).getText().substring(4);
			int parseInt = Integer.parseInt(text);
			k.add(parseInt);
		}
		System.out.println(k);
		int size = k.size();
		System.out.println("size of list:"+size);
		Integer min = Collections.min(k);
		System.out.println("minimum price:"+min);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
