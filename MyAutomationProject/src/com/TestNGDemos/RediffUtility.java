package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
	WebDriver driver;
	
	public RediffUtility(WebDriver d)
	{
		driver = d;
	}
	
	public void enterFullName(String fn)
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
	}
	public void enterRediffId(String rid)
	{
		driver.findElement(By.xpath("//*[@placeholder=\"Enter Rediffmail ID\"]")).sendKeys(rid);
	}
	public void enterPassword(String ps)
	{
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(ps);
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(ps);
	}
	public void setBirthDate(String d, String m, String y)
	{
		Select day = new Select(driver.findElement(By.xpath("//select[@class=\"day\"]")));
		day.selectByVisibleText(d);
		
		new Select(driver.findElement(By.xpath("//select[@class=\"middle month\"]"))).selectByContainsVisibleText(m);
		new Select(driver.findElement(By.xpath("//select[@class=\"year\"]"))).selectByContainsVisibleText(y);
	}
	public void selectGender(String gn)
	{
		if(gn.equals("Male"))
			driver.findElement(By.xpath("//input[@value=\"m\"]")).click();
		else
			driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
	}
}
