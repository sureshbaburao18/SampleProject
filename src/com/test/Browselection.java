package com.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browselection{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Browser");
		String browser = sc.nextLine();
		WebDriver driver=null;
		if(browser.equals("Chrome"));
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("invalid browser");
		}
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
}
