package org.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement txtstate = driver.findElement(By.id("city"));
		
		Select select = new Select(txtstate);
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement Element = options.get(i);
//			
//			String text = Element.getText();
//			
//			System.out.println(text);
			
			String attribute = Element.getAttribute("value");
			
			System.out.println(attribute);
			
			
		}
		
	}

}
