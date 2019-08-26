package com.tuan.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:\\workspace\\TrainingAutomation\\lib\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "G:\\workspace\\TrainingAutomation\\lib\\geckodriver.exe");
		driver = new ChromeDriver();
//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		System.out.println("Page Soure" + driver.getPageSource());
		System.out.println("Page Soure" + driver.getPageSource().length());
		
		driver.close();
		
		

	}

}
