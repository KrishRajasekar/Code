package org.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement txtcontinue = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		txtcontinue.click();
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("prakash@1345");
		
		WebElement txtpassword = driver.findElement(By.id("label2"));
		txtpassword.sendKeys("Devesh@1345");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
