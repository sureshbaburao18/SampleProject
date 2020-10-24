package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelLog{
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.id("username")).sendKeys("suresh");
		driver.findElement(By.id("password")).sendKeys("suresh");
		driver.findElement(By.id("login")).click();*/
		WebElement x = driver.findElement(By.xpath("//body/table/tbody/tr/td/img[@class='logo']"));
		String x1 = x.getCssValue("color");
		System.out.println(x1);
		
		
		Thread.sleep(3000);
	}
}