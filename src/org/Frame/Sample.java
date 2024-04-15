package org.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("login_page");	
		WebElement txtlogin = driver.findElement(By.name("fldLoginUserId"));
		txtlogin.sendKeys("Ram12345");
		
		WebElement txtcontinue = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		txtcontinue.click();
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name='fldPassword']"));
		txtpassword.sendKeys("Raja@6464");
		
		
	
		
	
	
	
	
	}

}