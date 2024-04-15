package org.DropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleProg {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		
		WebElement ddncountry = driver.findElement(By.id("country-list"));
		
		Select select = new Select(ddncountry);
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement element = options.get(i);
			System.out.println(element);
			
		}
		}
		
		
		
				
	
	}



