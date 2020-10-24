package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion{
	static{
		System.setProperty("webdriver.chrome.driver","C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
		
		}

	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		String xp = "//span[contains(text(),'java')]";
		List<WebElement> autosugg = driver.findElements(By.xpath(xp));
		int count = autosugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement sugg = autosugg.get(i);
			String text = sugg.getText();
			System.out.println(text);
		}
		}
	}
