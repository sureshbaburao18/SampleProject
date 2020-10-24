package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionHangover{
	static{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement courses = driver.findElement(By.linkText("COURSES"));
		Actions ac= new Actions(driver);
		ac.moveToElement(courses).perform();
		
		WebElement devops = driver.findElement(By.xpath("//span[text()='DevOps Training']"));

		ac.click(devops).perform();
			
			
		}
	}
