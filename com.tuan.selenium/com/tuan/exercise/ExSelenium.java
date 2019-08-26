package com.tuan.exercise;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import com.tuan.abs.SeleniumAction;
import com.tuan.page.PageUI;

public class ExSelenium extends SeleniumAction {
	
//	public ExSelenium() {
//		
//	}
	
	public void Exercise_01(Scanner sc) {
		choseBrowser(sc);
		openWebPage(PageUI.URL_PAGE);
		
		System.out.println("==> PAGE TILTE IS       : " + getPageTitle());
		System.out.println("==> PAGE TITLE LENGTH IS: " + getLength(getPageTitle()));
		System.out.println("==> CURRENT URL PAGE IS : " + getPageURL());
		if(isTheSame(getPageURL(), PageUI.URL_PAGE)) {
			System.out.println("==> 2 URL IS THE SAME");
		}
		else
			System.out.println("==> 2 URL IS DIFFERENT");
		
		System.out.println("==> PAGE SOURCE IS     : " + getPageSource());
		System.out.println("==> PAGE LENGTH IS     : " + getLength(getPageSource()));
		
		closeBrowser();
		
	}
	
	public void Exercise_02() {
		
	}
	
	public void Exercise_03() {
		
	}
}
