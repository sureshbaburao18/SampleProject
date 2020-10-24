package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2{
	static{
		System.setProperty("webdriver.chrome.driver","C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		driver.get("https://www.facebook.com/");
		WebElement w = driver.findElement(By.name("coffee2"));
		Select s = new Select(w);
		List<WebElement> o = s.getOptions();
		for (int i = 0; i < o.size(); i++) {
			  s.selectByIndex(i);
			System.out.println();
		}
		
	}
}