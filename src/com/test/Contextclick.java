package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick{
	static{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.linkText("Gmail"));
		Actions ac= new Actions(driver);
		ac.contextClick(ele).perform();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}