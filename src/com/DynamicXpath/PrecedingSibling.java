package com.DynamicXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrecedingSibling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		WebElement JobBoard = driver.findElement(By.xpath("//div[text()='Job Board']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(JobBoard).perform();

		driver.findElement(By.xpath("//a[text()='Applications ']")).click();

		// Preceding-Sibling====>to pick only name
		WebElement PreSib1 = driver.findElement(By.xpath("//a[text()='Content Creator']//parent::td//preceding-sibling::td//strong"));
		System.out.println(PreSib1.getText());
		// To pick Parent Sibling
		List<WebElement> PreSib2 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding-sibling::td"));
		for (int i = 0; i < PreSib2.size(); i++) {
			System.out.println(PreSib2.get(i).getText());
		}
		// To pick All 
		List<WebElement> PreSib3 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding::td"));
		for (int i = 0; i < PreSib3.size(); i++) {
			System.out.println(PreSib3.get(i).getText());
			
		}
		System.out.println("******");
		// To pick only Email Portion
		List<WebElement> PreSib4 = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//preceding::td[@data-colname='E-mail']"));
		for (int i = 0; i < PreSib4.size(); i++) {
			System.out.println(PreSib4.get(i).getText());
		}
		
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


