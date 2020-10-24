package com.test;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmailscript{
	static{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.gmail.com");
		WebElement w = driver.findElement(By.xpath("//input[@id='identifierId']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','sureshcs.tech')", w);
	}
}