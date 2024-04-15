package org.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ICICIBank {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icicibank.com/personal-banking/insta-banking/internet-banking");
		driver.manage().window().maximize();
		
		WebElement txtbtn = driver.findElement(By.id("modal-close"));
		txtbtn.click();
		
		WebElement txtclick = driver.findElement(By.xpath("//span[text()='Login']"));
		txtclick.click();
		
		Actions actions = new Actions(driver);
		WebElement txtlog = driver.findElement(By.xpath("//a[text()='Corporate ']"));
		actions.doubleClick(txtlog).perform();
		
		WebElement txtlogin = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		txtlogin.sendKeys("Raja@1455");
		
		WebElement txtpass = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		txtpass.sendKeys("Dev@1455");
		
		WebElement txtbtn1 = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS_UX"));
		
		txtbtn1.click();
	}

}
