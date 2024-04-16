package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	
	private void EmpName() {
		System.out.println("Empname : Rajasekar");
	}
	private void EmpID() {
		System.out.println("EmpId : 346766");
	}
	private void EmpClgname() {
		System.out.println("Empclgname : K.S.R college of arts and science");
	}
	private void EmpAdd() {
		System.out.println("EmpCity : Chennai");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("151654");
	}
//<<<<<<< HEAD
//		
//		
//
//=======
//	
//>>>>>>> eb635b8039bd2b23430cccf147085a8ea2249244
		
	
		
}
