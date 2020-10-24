package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable{
	static{
		System.setProperty("webdriver.chrome.driver","C:/Users/Suresh/workspace/SelniumSoftware/Seldriver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		//String w = driver.findElement(By.xpath("//div[@class='rt-resizable-header-content']")).getText();
	//System.out.println(w);
		List<WebElement> trows = driver.findElements(By.className("rt-thead -header"));
		Thread.sleep(3000);
		for (WebElement row : trows) {
			List<WebElement> tdata = driver.findElements(By.className("rt-tbody"));
			for (WebElement data : tdata) {
				System.out.println(data.getText());
			}
		}
	}
}