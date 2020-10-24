package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown{
	static{
		System.setProperty("webdriver.chrome.driver","C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
		
		}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		List<WebElement> Opt = s.getOptions();
		for (WebElement sel : Opt) {
			//System.out.println(sel.getAttribute("value"));
			System.out.println(sel.getText());
		}
	}
}