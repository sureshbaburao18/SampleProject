package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragundrop{
	static{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		 WebElement source = driver.findElement(By.xpath("//li/a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("//li[@class='placeholder']"));
		Thread.sleep(2000);
		//a.dragAndDrop(source, des).perform();
		a.clickAndHold(source).moveToElement(des).release(des).perform();
		
	}
}