package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookjavascript{
	static{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement w = driver.findElement(By.xpath("//*[text()='View more demos']"));
		w.sendKeys(Keys.PAGE_DOWN);
		/*js.executeScript("document.getElementById('email').setAttribute('value','Hello')");
		Object s = js.executeScript("return document.getElementById('email').getAttribute('value')");
		System.out.println(s);*/
	}
	
}