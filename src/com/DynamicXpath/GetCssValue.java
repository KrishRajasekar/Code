package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetCssValue {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String color = CreateNewAcc.getCssValue("color");
		System.out.println(color);

		WebElement CreateNewAcc1 = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String background = CreateNewAcc1.getCssValue("background-color");
		System.out.println(background);
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();

		if (background.equals(color)) {
			System.out.println("Text is not highlighted");
		} else {
			System.out.println("Text is highlighted");

		}

	}
}