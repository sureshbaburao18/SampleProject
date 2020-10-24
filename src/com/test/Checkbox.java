package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox{
	static{
		System.setProperty("webdriver.chrome.driver","C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
		
		}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		/*List<WebElement> w = driver.findElements(By.xpath("//span[@class='rct-text']"));
		for (int i = 0; i < w.size(); i++) {
			w.get(i).click();
		}
	}*/
		 driver.findElement(By.xpath("//li/span/button[@class='rct-collapse rct-collapse-btn']")).click();;
		List<WebElement> w = driver.findElements(By.xpath(""));
		for (int i = 0; i < w.size(); i++) {
			w.get(i).click();
			System.out.println(i);
		}
		driver.close();
	}
}