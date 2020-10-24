package com.test;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookradio {
	static{
		System.setProperty("webdriver.chrome.driver","C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
		
		}
	public static void main(String[] args) throws Exception {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*boolean Username = driver.findElement(By.id("email")).isEnabled();
		if(Username==true){
			System.out.println("Text box is enabled");
		}
		else
		{
			System.out.println("not enabled");
		}*/
		/*boolean logo = driver.findElement(By.xpath("//div[@class='fb_content clearfix ']//img[@class='fb_logo _8ilh img']")).isEnabled();
				if(logo==true){
					System.out.println("LOgo is enabled");
				}
				else
				{
					System.out.println("not enabled");
				}*/
		WebElement logo = driver.findElement(By.xpath("//div[@class='fb_content clearfix ']//img[@class='fb_logo _8ilh img']"));
		org.openqa.selenium.Dimension d=logo.getSize();
		int h = d.height;
		int w=d.width;
		org.openqa.selenium.Point L=logo.getLocation();
		int x=L.getX();
		int y=L.getY();
		
		
		System.out.println("height: "+h);
		System.out.println("width:"+w);
		System.out.println("xaxis: "+x);
		System.out.println("yaxis:"+y);
		driver.close();
		Thread.sleep(3000);
		
	}

}
