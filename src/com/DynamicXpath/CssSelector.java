package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//1.ID-->#email
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("Rajasekar@gmail.com");Thread.sleep(1000);
		email.clear();Thread.sleep(1000);
		
		//2.ClassAttribute----> Password --->.inputtext._55r1._6luy._9npi
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("Dev@1234");Thread.sleep(1000);
		
		//3.ClassAttribute with Specific Attribute value
		WebElement email1 = driver.findElement(By.cssSelector(".inputtext._55r1._6luy[id=email]"));
		email1.sendKeys("Prakash");
		email1.clear();
	
		//4.Tagname with attribute value
		//input[id=email]
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("Ramu");
		
		//5.Tagname with multiple attribute value
		//input[id=email][name=email]
		driver.findElement(By.cssSelector("input[id=email][name=email]")).sendKeys("Dharmesh");
		
		//6.
		
	}
}