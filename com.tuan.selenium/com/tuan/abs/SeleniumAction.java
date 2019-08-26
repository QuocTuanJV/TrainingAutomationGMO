package com.tuan.abs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAction {
protected WebDriver driver;
	
	public void openMultiBrowser(String nameBrowser) {
		if(nameBrowser.equals("chrome")) {
			System.out.println("YOU CHOSED CHROME BROWSER!!");
			System.setProperty("webdriver.chrome.driver", "G:\\workspace\\TrainingAutomation\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
	}
	
	public void choseBrowser(Scanner sc) {
		System.out.println("CHOSE NAME BROWSER F or C");
		String a = sc.nextLine();
		if(a.equals("c") || a.equals("c")) {
			openMultiBrowser("chrome");
		}
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("CLOSE BROWSER");
	}
	
	public void openWebPage(String url) {
		System.out.println("OPEN WEBPAGE WITH URL: " + url);
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public int getLength(String s) {
		return s.length();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public boolean isTheSame(String url,String expectedUrl) {
		if(url.equals(expectedUrl)) 
			return true;
		else
			return false;
	}
	
	public String getPageSource() {
		return driver.getPageSource();
	}
	



}
