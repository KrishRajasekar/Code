package com.DynamicXpath;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLink {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		int attribute=0;
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < Links.size(); i++) {
			System.out.println(Links.get(i).getAttribute("href"));
			attribute++;
			
		}
		System.out.println("Link Count:"+attribute);
//		int brokencount=0;
//		for (int i = 0; i < Links.size(); i++) {
//		String attribute = Links.get(i).getAttribute("href");		
//		if (attribute!=null) {
//			URL url = new URL(attribute);
//			URLConnection Connection = url.openConnection();
//			HttpURLConnection urlconnection = (HttpURLConnection) Connection;
//			int responseCode = urlconnection.getResponseCode();
//			//respoce code 400 or 200
//			if (responseCode>=300) {
//				System.out.println("Broken Links:"+attribute);
//				brokencount++;
//			{
//			}
//		
//			}
//		}
//		}
//		System.out.println("Link Count:"+brokencount);
	}
}
		
	



	
	
	


