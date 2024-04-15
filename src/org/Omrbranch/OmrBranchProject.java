package org.Omrbranch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmrBranchProject {
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://omrbranch.com/");
	driver.manage().window().maximize();
	
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("rajasekar93446@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Raja@2709");
	
	WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Login']"));
	loginbtn.click();
	
	}

}
