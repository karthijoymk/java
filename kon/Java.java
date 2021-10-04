package org.kon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		int country_Index=1,total_Cases_Index=2,total_Deaths_Index=4;
		List<WebElement> row_Headers = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr"));
		for (int i = 0; i < row_Headers.size(); i++) {
			List<WebElement> all_Headers = row_Headers.get(i).findElements(By.tagName("th"));
			for (int j = 0; j < all_Headers.size(); j++) {
				String header = all_Headers.get(j).getText().replaceAll("\n","");
				if (header.contains("Country")) {
					country_Index=j;
					System.out.println("country_index:"+country_Index);
					
				}
				else if (header.equals("Totalcases")) {
					total_Cases_Index =j;
					System.out.println("total_cases_Index:"+total_Cases_Index);
					
				}
				else if (header.equalsIgnoreCase("TotalDeaths")) {
					total_Deaths_Index = j;
					System.out.println("total death cases:"+total_Deaths_Index);
					
				}}}
		System.out.println("***********************************");
		List<WebElement> row_Datas = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
		for (int i = 0; i < row_Datas.size(); i++) {
			List<WebElement> all_Datas = row_Datas.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < all_Datas.size(); j++) {
				if (all_Datas.get(j).getText().equalsIgnoreCase("india")) {
					String text = all_Datas.get(total_Cases_Index).getText();
					System.out.println("total cases="+text);
					String text2 = all_Datas.get(total_Deaths_Index).getText();
					System.out.println("total death cases="+text2);
					
				}
				
			}
			
		}
				
			

	
	



	}}
