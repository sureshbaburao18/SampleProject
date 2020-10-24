package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart{
	static{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		 WebElement web = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions A= new Actions(driver);
		A.moveToElement(web).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[text()='Mobile Cases']")).click();
		
		
		
		
	}
}