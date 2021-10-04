package org.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		int country_Index = 1, total_Cases_Index = 2, total_Deaths_Index = 4;
		List<WebElement> first_Data = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr"));
		for (int i = 0; i < first_Data.size(); i++) {
			List<WebElement> second_Data = first_Data.get(i).findElements(By.tagName("th"));
			for (int j = 0; j < second_Data.size(); j++) {

				String header = second_Data.get(j).getText().replaceAll("\n", "");
				System.out.println(header);
				if (header.contains("Country")) {
					country_Index = j;
					System.out.println("country_index:" + country_Index);
				}
				if (header.equals("TotalCases")) {
					total_Cases_Index = j;
					System.out.println("total_cases_index:" + total_Cases_Index);

				}
				if (header.equalsIgnoreCase("TotalDeaths")) {
					total_Deaths_Index = j;
					System.out.println("total_deaths_index:" + total_Deaths_Index);

				}}}
				System.out.println("**********************************");
				List<WebElement> third_Data = driver
						.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody/tr"));
				for (int i = 0; i < third_Data.size(); i++) {
					
				List<WebElement> four_Data = third_Data.get(i).findElements(By.tagName("td"));
                for (int j = 0; j < four_Data.size(); j++) {
                	if (four_Data.get(j).getText().equalsIgnoreCase("india")) {
                		String text = four_Data.get(total_Deaths_Index).getText();
                		System.out.println("total_Deaths_Index:"+text);
                		String text2 = four_Data.get(total_Cases_Index).getText();
                		System.out.println("total_Cases_Index:"+text2);
						
					}
					
				}						
					}
					
				}
	

				
			}

		

	
