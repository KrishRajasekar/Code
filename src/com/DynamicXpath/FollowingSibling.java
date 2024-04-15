package com.DynamicXpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FollowingSibling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-login.php?redirect_to=https%3A%2F%2Fdemo.wpjobboard.net%2Fwp-admin%2F&reauth=1");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='Log In']")).click();

		WebElement JobBoard = driver.findElement(By.xpath("//div[text()='Job Board']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(JobBoard).perform();

		driver.findElement(By.xpath("//a[text()='Applications ']")).click();
		
		// Following----->
		
//		List<WebElement> Fol = driver.findElements(By.xpath("//a[text()='Content Creator']//parent::td//following::td"));
//		for (int i = 0; i < Fol.size(); i++) {
//			System.out.println(Fol.get(i).getText());
//	}
		WebElement Follow2 = driver.findElement(By.xpath("//a[text()='Content Creator']//parent::td//following::td[@data-colname='Job']"));
		System.out.println(Follow2.getText());
	
	
	}
}