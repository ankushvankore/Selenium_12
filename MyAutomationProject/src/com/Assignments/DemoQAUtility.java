package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoQAUtility {
	WebDriver driver;
	
	public DemoQAUtility(WebDriver driver) {
		this.driver = driver;
	}
	public void enterFirstName(String fn)
	{
		driver.findElement(By.id("firstName")).sendKeys(fn);
	}
	public void enterLastName(String ln) {
		driver.findElement(By.id("lastName")).sendKeys(ln);
	}
	public void enterEmailId(String eid) {
		driver.findElement(By.id("userEmail")).sendKeys(eid);
	}
	public void selectGender(String gn)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(gn.equalsIgnoreCase("Male"))
			js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-1")));
		else if(gn.equalsIgnoreCase("Female"))
			js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-2")));
		else
			js.executeScript("arguments[0].click()", driver.findElement(By.id("gender-radio-3")));
	}
}
