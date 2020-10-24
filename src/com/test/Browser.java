package com.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browser{
	static{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	}
	public static void mytest(WebDriver driver){
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		Browser.mytest(driver);
		WebDriver driver2=new FirefoxDriver();
		Browser.mytest(driver2);
		driver.manage().window().maximize();
	}
}